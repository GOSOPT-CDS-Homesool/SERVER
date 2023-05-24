package org.sopt.homesool.controller.dto.response;

import lombok.*;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AlcoholDetailResponseDto {
    private String detailImage;
    private String name;
    private int sale;
    private String price;
    private String salePrice;
    private String imageInfoImage;
}
