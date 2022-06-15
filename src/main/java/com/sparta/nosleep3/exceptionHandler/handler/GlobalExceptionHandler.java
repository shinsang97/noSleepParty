package com.sparta.nosleep3.exceptionHandler.handler;


import com.sparta.nosleep3.dto.reponsedto.ErrorResponseDto;
import com.sparta.nosleep3.exceptionHandler.ArtiePostUsernameException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ArtiePostUsernameException.class)
    public ErrorResponseDto handleArtiePostUsernameException(ArtiePostUsernameException ex){
        return ErrorResponseDto.of(HttpStatus.BAD_REQUEST,ex.getMessage());
    }
}
