package org.sopt.homesool.controller.dto.response;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductInquiryResponseDto {
    private String userName;
    private String date;
    private String title;
    private String contents;
    private String answer;
}
