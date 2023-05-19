package org.sopt.homesool.controller.dto.response;

import lombok.*;
import org.sopt.homesool.domain.Tags;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TagResponseDto {
    private boolean best;
    private boolean newProduct;
    private boolean recommend;

    public static TagResponseDto of(Tags tags) {
        return TagResponseDto.builder()
                .best(tags.isBest())
                .newProduct(tags.isNewProduct())
                .recommend(tags.isRecommmend())
                .build();
    }

}
