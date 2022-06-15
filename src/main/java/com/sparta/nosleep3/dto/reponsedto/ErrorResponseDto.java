package com.sparta.nosleep3.dto.reponsedto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ErrorResponseDto {
    private int errorCode;
    private String errorMessage;
    public static ErrorResponseDto of (HttpStatus httpStatus, String errorMessage) {
        return new ErrorResponseDto(httpStatus.value(), errorMessage);
    }

    public static ErrorResponseDto of (HttpStatus httpStatus, FieldError fieldError) {
        if( fieldError != null ) {
            return new ErrorResponseDto(httpStatus.value(), fieldError.getDefaultMessage());
        } return new ErrorResponseDto(httpStatus.value(), "Invalid Param");
    }
}
