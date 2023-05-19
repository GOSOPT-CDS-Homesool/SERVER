package org.sopt.homesool.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.homesool.common.dto.ApiResponse;
import org.sopt.homesool.common.dto.SuccessStatus;
import org.sopt.homesool.controller.dto.response.AlcoholResponseDto;
import org.sopt.homesool.controller.dto.response.ReviewResponseDto;
import org.sopt.homesool.infrastructure.AlcoholRepository;
import org.sopt.homesool.service.AlcoholService;
import org.sopt.homesool.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/alcohol")
@RestController
public class AlcoholController {

    private final AlcoholService alcoholService;
    private final ReviewService reviewService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse<List<AlcoholResponseDto>> read() {
        return ApiResponse.success(SuccessStatus.ALCOHOL_FIND_SUCCESS, alcoholService.findAll());
    }

    @GetMapping("/review/{alcoholId}")
    @ResponseStatus(HttpStatus.OK)
    public  ApiResponse<List<ReviewResponseDto>> reviewRead(@PathVariable Long alcoholId) {
        return ApiResponse.success(SuccessStatus.ALCOHOL_REVIEW_FIND_SUCCESS, reviewService.findByAlcoholId(alcoholId));
    }
}
