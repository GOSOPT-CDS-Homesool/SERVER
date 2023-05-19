package org.sopt.homesool.service;

import lombok.RequiredArgsConstructor;
import org.sopt.homesool.controller.dto.response.ReviewResponseDto;
import org.sopt.homesool.controller.dto.response.ReviewAllResponseDto;
import org.sopt.homesool.domain.Review;
import org.sopt.homesool.infrastructure.AlcoholRepository;
import org.sopt.homesool.infrastructure.ReviewRepository;
import org.sopt.homesool.infrastructure.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;
    private final AlcoholRepository alcoholRepository;

    @Transactional
    public List<ReviewResponseDto> findByAlcoholId(Long alcoholId) {
        List<Review> reviews = reviewRepository.findByAlcoholId(alcoholId);

        return reviews.stream()
                .map(review -> ReviewResponseDto.of(
                        review.getId(),
                        review.getTitle(),
                        review.getImage(),
                        review.getContents(),
                        review.getStar(),
                        review.getDate()
                )
                ).collect(Collectors.toList());
    }

    public List<ReviewAllResponseDto> getAllReview() {
        List<Review> reviews = reviewRepository.findAll();

        List<ReviewAllResponseDto> reviewDtoList = new ArrayList<>();

        if(reviews.isEmpty())
            reviewDtoList = Collections.emptyList();
        else {
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
        }

        return reviewDtoList;
    }
}
