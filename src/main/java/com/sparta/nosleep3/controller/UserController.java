package com.sparta.nosleep3.controller;

import com.sparta.nosleep3.dto.requestdto.SignupRequestDto;
import com.sparta.nosleep3.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public String userSignup (@Valid @RequestBody SignupRequestDto requestDto) {
     return userService.userSignup(requestDto);
    }

    @PostMapping("/dupcheck")
    public String dupCheck (String username) {
        return userService.dupCheck(username);
    }

    @GetMapping("/test")
    public String hello () {
        return "Hello World!";
    }
}
