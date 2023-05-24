package org.sopt.homesool.service;

import lombok.RequiredArgsConstructor;
import org.sopt.homesool.controller.dto.response.UserResponseDto;
import org.sopt.homesool.domain.Alcohol;
import org.sopt.homesool.domain.User;
import org.sopt.homesool.infrastructure.AlcoholRepository;
import org.sopt.homesool.infrastructure.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final AlcoholRepository alcoholRepository;

    @Transactional
    public UserResponseDto findUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException());
        long likeCount = alcoholRepository.findAll()
                .stream()
                .map(alcohol -> alcohol.isLike())
                .filter(like -> like == true)
                .count();

        return UserResponseDto.builder()
                .id(id)
                .nickName(user.getNickName())
                .userRank(user.getUserRank().toString())
                .point(user.getPoint())
                .coupon(user.getCoupon())
                .interest(likeCount)
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
