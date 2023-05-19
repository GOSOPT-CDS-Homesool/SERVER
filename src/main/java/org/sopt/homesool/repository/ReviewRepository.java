package org.sopt.homesool.repository;


import org.sopt.homesool.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
