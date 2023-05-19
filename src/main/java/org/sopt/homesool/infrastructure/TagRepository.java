package org.sopt.homesool.infrastructure;

import org.sopt.homesool.domain.Tags;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TagRepository extends Repository<Tags, Long> {
    Optional<Tags> findByAlcoholId(Long id);
}
