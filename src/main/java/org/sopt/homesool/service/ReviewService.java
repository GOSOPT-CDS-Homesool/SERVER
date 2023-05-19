package org.sopt.homesool.service;

import lombok.RequiredArgsConstructor;
import org.sopt.homesool.controller.dto.ReviewAllResponseDto;
import org.sopt.homesool.domain.Review;
import org.sopt.homesool.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public List<ReviewAllResponseDto> getAllReview() {
        List<Review> reviews = reviewRepository.findAll();
        List<ReviewAllResponseDto> reviewDtoList = new ArrayList<>();

        for (Review review: reviews){
            reviewDtoList.add(
                    ReviewAllResponseDto.builder()
                    .image(review.getImage())
                    .title(review.getTitle())
                    .contents(review.getContents())
                    .star(review.getStar())
                    .build()
            );
        }

        return reviewDtoList;
    }
}
