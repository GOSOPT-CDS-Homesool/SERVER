package org.sopt.homesool.controller.dto.response;


import lombok.*;

import java.util.Date;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ReviewResponseDto {
    private Long id;
    private String title;
    private String image;
    private String contents;
    private int star;
    private Date date;

    public static ReviewResponseDto of(Long id, String title, String image, String contents, int start, Date date) {
        return ReviewResponseDto.builder()
                .id(id)
                .title(title)
                .image(image)
                .contents(contents)
                .star(start)
                .date(date)
                .build();
    }

}
