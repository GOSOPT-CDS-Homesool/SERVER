package org.sopt.homesool.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.homesool.controller.dto.ReviewAllResponseDto;
import org.sopt.homesool.exception.Success;
import org.sopt.homesool.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/alcohol/review")
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse<List<ReviewAllResponseDto>> getAllReview(){
        List<ReviewAllResponseDto> allReview = reviewService.getAllReview();

        if(allReview.isEmpty())
            return ApiResponse.success(Success.GET_REVIEW_EMPTY_SUCCESS, Collections.emptyList());

        return ApiResponse.success(Success.GET_REVIEW_SUCCESS, allReview);
    }
}
