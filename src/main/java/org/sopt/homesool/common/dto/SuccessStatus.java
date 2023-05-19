package org.sopt.homesool.common.dto;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum SuccessStatus {

    /*
    user
     */
    USER_FIND_SUCCESS(HttpStatus.OK, "유저 조회에 성공하였습니다."),
    GET_REVIEW_SUCCESS(HttpStatus.OK, "리뷰 조회에 성공하였습니다."),
    /*
    alcohol
     */
    ALCOHOL_FIND_SUCCESS(HttpStatus.OK, "술 조회에 성공하였습니다."),
    ALCOHOL_REVIEW_FIND_SUCCESS(HttpStatus.OK, "술 리뷰 조회에 성공하였습니다."),
    ALCOHOL_DETAIL_INFO_SUCCESS(HttpStatus.OK, "술 상세 정보 조회에 성공하였습니다."),
    ALCOHOL_FIND_INQUIRY_SUCCESS(HttpStatus.OK, "술 상품 문의 조회에 성공하였습니다.")
    ;

    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}