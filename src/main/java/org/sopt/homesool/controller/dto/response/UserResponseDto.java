package org.sopt.homesool.controller.dto.response;

import lombok.*;
import org.sopt.homesool.domain.Rank;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserResponseDto {
    private Long id;
    private String nickName;
    private String userRank;
    private int point;
    private int coupon;
    private long interest;
    private int waiting;
    private int finish;
    private int ready;
    private int delivering;
    private int delivered;
    private String address;
    private String phoneNumber;

    public static UserResponseDto of(Long id, String nickName, String userRank, int point, int coupon, long interest,
                                     int waiting, int finish, int ready, int delivering, int delivered, String address,
                                     String phoneNumber) {
        return UserResponseDto.builder()
                .id(id)
                .nickName(nickName)
                .userRank(userRank)
                .point(point)
                .coupon(coupon)
                .interest(interest)
                .waiting(waiting)
                .finish(finish)
                .ready(ready)
                .delivering(delivering)
                .delivered(delivered)
                .address(address)
                .phoneNumber(phoneNumber)
                .build();
    }
}
