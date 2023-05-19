package org.sopt.homesool.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.homesool.common.dto.ApiResponse;
import org.sopt.homesool.common.dto.SuccessStatus;
import org.sopt.homesool.controller.dto.response.AlcoholDetailResponseDto;
import org.sopt.homesool.controller.dto.response.AlcoholResponseDto;
import org.sopt.homesool.controller.dto.response.ProductInquiryResponseDto;
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
    public ApiResponse<List<ReviewResponseDto>> reviewRead(@PathVariable("alcoholId") Long alcoholId) {
        return ApiResponse.success(SuccessStatus.ALCOHOL_REVIEW_FIND_SUCCESS, reviewService.findByAlcoholId(alcoholId));
    }

    @GetMapping("/{alcoholId}")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse<AlcoholDetailResponseDto> readAlcoholDetail(@PathVariable("alcoholId") Long alcoholId) {
        return ApiResponse.success(SuccessStatus.ALCOHOL_DETAIL_INFO_SUCCESS, alcoholService.findAlcoholDetail(alcoholId));
    }

    @GetMapping("/inquiry/{alcoholId}")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse<List<ProductInquiryResponseDto>> readAlcoholInquiry(@PathVariable("alcoholId") Long alcoholId) {
        return ApiResponse.success(SuccessStatus.ALCOHOL_FIND_INQUIRY_SUCCESS, alcoholService.findAlcoholInquiry(alcoholId));
    }
}
