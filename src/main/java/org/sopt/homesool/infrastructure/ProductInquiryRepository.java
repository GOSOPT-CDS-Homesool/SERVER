package org.sopt.homesool.infrastructure;

import org.sopt.homesool.domain.Alcohol;
import org.sopt.homesool.domain.ProductInquiry;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ProductInquiryRepository extends Repository<ProductInquiry, Long> {
    List<ProductInquiry> findByAlcoholId(Long id);
}
