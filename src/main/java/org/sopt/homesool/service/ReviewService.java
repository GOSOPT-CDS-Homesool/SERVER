package org.sopt.homesool.service;

import lombok.RequiredArgsConstructor;
import org.sopt.homesool.controller.dto.response.ReviewResponseDto;
import org.sopt.homesool.domain.Review;
import org.sopt.homesool.infrastructure.AlcoholRepository;
import org.sopt.homesool.infrastructure.ReviewRepository;
import org.sopt.homesool.infrastructure.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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

}
