package org.sopt.homesool.controller.dto.response;

import lombok.*;
import org.sopt.homesool.domain.Tags;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AlcoholResponseDto {
    private Long id;
    private String name;
    private TagResponseDto tags;
    private boolean soldOut;
    private boolean like;
    private int sale;
    private String price;
    private String salePrice;
    private String image;
    private String detailImage;
    private String imageInfoImage;
    private int stock;
    private boolean subscribe;
    private boolean twinkle;

    public static AlcoholResponseDto of(Long id, String name, TagResponseDto tags, boolean soldOut,
                                        boolean like, int sale, String price, String salePrice, String image,
                                        String detailImage, String imageInfoImage,
                                        int stock, boolean subscribe, boolean twinkle) {
        return AlcoholResponseDto.builder()
                .id(id)
                .name(name)
                .tags(tags)
                .soldOut(soldOut)
                .like(like)
                .sale(sale)
                .salePrice(salePrice)
                .price(price)
                .image(image)
                .detailImage(detailImage)
                .imageInfoImage(imageInfoImage)
                .stock(stock)
                .subscribe(subscribe)
                .twinkle(twinkle)
                .build();
    }
}
