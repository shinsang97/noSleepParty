package com.sparta.nosleep3.controller;

import com.sparta.nosleep3.dto.reponsedto.CommentResponseDto;
import com.sparta.nosleep3.dto.requestdto.CommentRequestDto;
import com.sparta.nosleep3.security.UserDetailsImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CommentController {

    @PostMapping("/api/artcle/{artcleId}/comment")
    public CommentResponseDto postComment(@RequestBody CommentRequestDto commentRequestDto, @AuthenticationPrincipal UserDetailsImpl userDetails){
        return null;
    }

}
