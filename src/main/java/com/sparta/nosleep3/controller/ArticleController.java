package com.sparta.nosleep3.controller;


import com.sparta.nosleep3.dto.reponsedto.ArticleResponseDto;
import com.sparta.nosleep3.dto.requestdto.ArticleRequestDto;
import com.sparta.nosleep3.repository.ArticleRepository;
import com.sparta.nosleep3.security.UserDetailsImpl;
import com.sparta.nosleep3.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ArticleController {

    private final ArticleRepository articleRepository;
    private final ArticleService articleService;

    @PostMapping("/api/article")
    public ResponseEntity postArticle(@RequestBody ArticleRequestDto articleRequestDto,@AuthenticationPrincipal UserDetailsImpl userDetails){
        return articleService.post(articleRequestDto,userDetails);
    }

    @GetMapping("/api/article")
    public List<ArticleResponseDto> getArticle(){
        return articleService.getArticles();
    }

    @PutMapping("/api/article/{artcleId}")
    public ArticleResponseDto update(@RequestBody ArticleRequestDto articleRequestDto, @PathVariable Long artcleId, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        return articleService.update(articleRequestDto, artcleId, userDetails);
    }

    @DeleteMapping("/api/article/{artcleId}")
    public ResponseEntity delete(@PathVariable Long artcleId,@AuthenticationPrincipal UserDetailsImpl userDetails){
       return ResponseEntity.ok().body(articleService.delete(artcleId,userDetails));
    }
}
