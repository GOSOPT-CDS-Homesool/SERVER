package org.sopt.homesool.service;

import lombok.RequiredArgsConstructor;
import org.sopt.homesool.controller.dto.response.UserResponseDto;
import org.sopt.homesool.domain.User;
import org.sopt.homesool.infrastructure.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserResponseDto findUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException());
        return UserResponseDto.builder()
                .id(id)
                .nickName(user.getNickName())
                .userRank(user.getUserRank())
                .point(user.getPoint())
                .coupon(user.getCoupon())
                .interest(user.getInterest())
                .waiting(user.getWaiting())
                .finish(user.getFinish())
                .ready(user.getReady())
                .delivering(user.getDelivering())
                .delivered(user.getDelivered())
                .address(user.getAddress())
                .phoneNumber(user.getPhoneNumber())
                .build();
    }
}
