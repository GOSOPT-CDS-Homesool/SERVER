package org.sopt.homesool.controller.dto.response;

import lombok.*;
import org.sopt.homesool.domain.Review;

import java.util.Collections;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ReviewAllResponseDto {
    private String image;
    private String title;
    private String contents;
    private int star;
}
