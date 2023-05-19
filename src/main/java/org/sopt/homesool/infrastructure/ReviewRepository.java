package org.sopt.homesool.infrastructure;

import org.sopt.homesool.domain.Review;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ReviewRepository extends Repository<Review, Long> {
    List<Review> findByAlcoholId(Long alcoholId);
}
