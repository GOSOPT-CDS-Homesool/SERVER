package org.sopt.homesool.controller.dto.response;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
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
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy.MM.dd", timezone="Asia/Seoul")
    private LocalDate date;

    public static ReviewResponseDto of(Long id, String title, String image, String contents, int start, LocalDate date) {
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
