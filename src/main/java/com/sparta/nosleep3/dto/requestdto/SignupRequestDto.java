package com.sparta.nosleep3.dto.requestdto;

import lombok.Getter;
import lombok.Setter;
import org.intellij.lang.annotations.Pattern;


@Getter
@Setter
public class SignupRequestDto {

    @NotBlank
    @Pattern(regexp = "(?=.*[0-9a-zA-Z]).{4,20}")
    private String username;

    @NotBlank
    @Pattern(regexp = "(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\d~!@#$%^&*()+|=]{4,20}")
    private String password;

    @NotBlank
    private String profilePic;
}
