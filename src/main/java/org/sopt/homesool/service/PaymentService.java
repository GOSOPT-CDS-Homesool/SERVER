package org.sopt.homesool.service;

import lombok.RequiredArgsConstructor;
import org.sopt.homesool.controller.dto.response.PaymentResponseDto;
import org.sopt.homesool.domain.Alcohol;
import org.sopt.homesool.domain.Payment;
import org.sopt.homesool.domain.User;
import org.sopt.homesool.infrastructure.AlcoholRepository;
import org.sopt.homesool.infrastructure.PaymentRepository;
import org.sopt.homesool.infrastructure.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final UserRepository userRepository;
    private final AlcoholRepository alcoholRepository;

    @Transactional
    public PaymentResponseDto payment(final Long userId, final Long alcoholId) {
        Boolean result = false;
        Optional<User> user = userRepository.findById(userId);
        Alcohol alcohol = alcoholRepository.findById(alcoholId);

        if (alcohol.getStock() <= 0) return PaymentResponseDto.of(false);

        user.get().updateWaiting();
        alcohol.updateStock();
        if(alcohol.getStock() <= 0) alcohol.setSoldOut(false);

        paymentRepository.save(new Payment(alcohol, user.get()));

        return PaymentResponseDto.of(true);
    }
}
