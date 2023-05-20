package org.sopt.homesool.controller.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class LikeRequestDto {
    @NonNull
    private String alcoholId;
}
