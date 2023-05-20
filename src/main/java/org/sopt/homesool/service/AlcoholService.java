package org.sopt.homesool.service;

import lombok.RequiredArgsConstructor;
import org.sopt.homesool.controller.dto.response.ProductInquiryResponseDto;
import org.sopt.homesool.controller.dto.response.AlcoholDetailResponseDto;
import org.sopt.homesool.controller.dto.response.AlcoholResponseDto;
import org.sopt.homesool.controller.dto.response.TagResponseDto;
import org.sopt.homesool.domain.Alcohol;
import org.sopt.homesool.domain.ProductInquiry;
import org.sopt.homesool.domain.Tags;
import org.sopt.homesool.infrastructure.AlcoholRepository;
import org.sopt.homesool.infrastructure.ProductInquiryRepository;
import org.sopt.homesool.infrastructure.ReviewRepository;
import org.sopt.homesool.infrastructure.TagRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AlcoholService {
    private final AlcoholRepository alcoholRepository;
    private final TagRepository tagRepository;
    private final ReviewRepository reviewRepository;
    private final ProductInquiryRepository productInquiryRepository;

    @Transactional
    public List<AlcoholResponseDto> findAll() {
        List<Alcohol> alcohols = alcoholRepository.findAll();

        return alcohols.stream()
                .map(alcohol -> AlcoholResponseDto.of(
                        alcohol.getId(),
                        alcohol.getName(),
                        TagResponseDto.of(tagRepository.findByAlcoholId(alcohol.getId())
                                .orElse(Tags.newInstance(alcohol, false, false, false))),
                        alcohol.isSoldOut(),
                        alcohol.isLike(),
                        alcohol.getSale(),
                        alcohol.getPrice(),
                        alcohol.getImage(),
                        alcohol.getDetailImage(),
                        alcohol.getImageInfoImage(),
                        alcohol.getStock(),
                        alcohol.isSubscribe(),
                        alcohol.isTwinkle()
                        )
                )
                .collect(Collectors.toList());
    }

    public AlcoholDetailResponseDto findAlcoholDetail(Long id){
        Alcohol alcohol = alcoholRepository.findById(id);

        return AlcoholDetailResponseDto.builder()
                .detailImage(alcohol.getDetailImage())
                .name(alcohol.getName())
                .price(alcohol.getPrice())
                .sale(alcohol.getSale())
                .imageInfoImage(alcohol.getImageInfoImage())
                .build();
    }

    public List<ProductInquiryResponseDto> findAlcoholInquiry(Long id) {
        List<ProductInquiry> inquiries = productInquiryRepository.findByAlcoholId(id);

        List<ProductInquiryResponseDto> productInquiryResponseDtoList = Collections.emptyList();

        if(!inquiries.isEmpty()){
            productInquiryResponseDtoList = new ArrayList<>();

            for(ProductInquiry productInquiry : inquiries) {
                productInquiryResponseDtoList.add(
                        ProductInquiryResponseDto.builder()
                                .userName(productInquiry.getUser().getNickName())
                                .date(productInquiry.getDate().toString())
                                .title(productInquiry.getTitle())
                                .contents(productInquiry.getContents())
                                .answer(productInquiry.getAnswer())
                                .build()
                );
            }
        }

        return productInquiryResponseDtoList;
    }

    public void setLike(Long id) {
        Alcohol alcohol = alcoholRepository.findById(id);
        alcohol.setLike(!alcohol.isLike());
        alcoholRepository.save(alcohol);
    }
}
