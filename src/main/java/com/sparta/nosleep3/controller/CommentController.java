package com.sparta.nosleep3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CommentController {

    @PostMapping("/api/artcle/{artcleId}/comment")
    public ResponseEntity postComment(Comm){

    }
dfdfd

}
