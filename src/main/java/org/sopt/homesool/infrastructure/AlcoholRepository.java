package org.sopt.homesool.infrastructure;

import org.sopt.homesool.domain.Alcohol;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AlcoholRepository extends Repository<Alcohol, Long> {
    List<Alcohol> findAll();
    Alcohol findById(Long id);

    void save(Alcohol alcohol);
}
