package org.sopt.homesool.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.homesool.common.dto.ApiResponse;
import org.sopt.homesool.common.dto.SuccessStatus;
import org.sopt.homesool.controller.dto.response.AlcoholResponseDto;
import org.sopt.homesool.controller.dto.response.PaymentResponseDto;
import org.sopt.homesool.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/payment")
@RestController
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<PaymentResponseDto> payment(@RequestParam final Long userId, @RequestParam final Long alcoholId) {
        return ApiResponse.success(SuccessStatus.PAYMENT_SUCCESS, paymentService.payment(userId, alcoholId));
    }
}
