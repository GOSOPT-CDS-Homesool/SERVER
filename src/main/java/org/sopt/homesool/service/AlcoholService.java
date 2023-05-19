package org.sopt.homesool.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.sopt.homesool.controller.dto.response.AlcoholResponseDto;
import org.sopt.homesool.controller.dto.response.TagResponseDto;
import org.sopt.homesool.domain.Alcohol;
import org.sopt.homesool.domain.Tags;
import org.sopt.homesool.infrastructure.AlcoholRepository;
import org.sopt.homesool.infrastructure.TagRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AlcoholService {
    private final AlcoholRepository alcoholRepository;
    private final TagRepository tagRepository;

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
}
