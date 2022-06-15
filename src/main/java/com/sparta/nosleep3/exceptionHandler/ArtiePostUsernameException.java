package com.sparta.nosleep3.exceptionHandler;

public class ArtiePostUsernameException extends RuntimeException {
    private static final String MESSAGE = "로그인 이 필요합니다.";

    public ArtiePostUsernameException() {
        super(MESSAGE);
    }
}
