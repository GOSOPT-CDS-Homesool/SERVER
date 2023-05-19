package org.sopt.homesool.controller.dto.response;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PaymentResponseDto {
    private boolean result;

    public static PaymentResponseDto of(boolean value){
        return new PaymentResponseDto(value);
    }
}
