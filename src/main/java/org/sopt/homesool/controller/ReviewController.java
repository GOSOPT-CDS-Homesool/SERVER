package org.sopt.homesool.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.homesool.common.dto.ApiResponse;
import org.sopt.homesool.common.dto.SuccessStatus;
import org.sopt.homesool.controller.dto.response.ReviewAllResponseDto;
import org.sopt.homesool.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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

        return ApiResponse.success(SuccessStatus.GET_REVIEW_SUCCESS, allReview);
    }
}
