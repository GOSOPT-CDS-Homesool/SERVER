package org.sopt.homesool.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access =  AccessLevel.PRIVATE)
public enum Success {
    /**
     * 200 OK
     */
    GET_REVIEW_EMPTY_SUCCESS(HttpStatus.OK, "리뷰가 하나도 없어요."),
    GET_REVIEW_SUCCESS(HttpStatus.OK, "모든 리뷰가 조회되었음."),


    /**
     * 201 CREATED
     */
    SIGNUP_SUCCESS(HttpStatus.CREATED, "회원가입이 완료됐습니다."),
    CREATE_BOARD_SUCCESS(HttpStatus.CREATED, "게시물 생성이 완료됐습니다."),
    ;

    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}