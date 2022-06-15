package com.sparta.nosleep3.service;

import com.sparta.nosleep3.domain.Article;
import com.sparta.nosleep3.dto.reponsedto.ArticleReponseDto;
import com.sparta.nosleep3.dto.requestdto.ArticleRequestDto;
import com.sparta.nosleep3.repository.ArticleRepository;
import com.sparta.nosleep3.security.UserDetailsImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ResponseEntity post(ArticleRequestDto articleRequestDto, UserDetailsImpl userDetails) {
        Article article = new Article(articleRequestDto, userDetails);
        if(userDetails == null){
            return new ResponseEntity("로그인 하삼",HttpStatus.BAD_REQUEST);
        }else{
            articleRepository.save(article);
            return new ResponseEntity("로그인"+article,HttpStatus.OK);
        }
    }

    public List<ArticleReponseDto> getArticles() {
        List<ArticleReponseDto> articleReponseDtos = new ArrayList<>();
        List<Article> articleList = articleRepository.findAllByOrderByModifiedAtDesc();
        for(int i = 0; i < articleList.size(); i++){
            // 객체생성
            ArticleReponseDto articleReponseDto = new ArticleReponseDto(articleList.get(i));
            articleReponseDtos.add(articleReponseDto);
        }
        return articleReponseDtos;
    }

    public ArticleReponseDto update(ArticleRequestDto articleRequestDto, Long artcleId, UserDetailsImpl userDetails) {
        Article article = articleRepository.findById(artcleId).orElseThrow(
                () -> new IllegalArgumentException("게시글이 존재하지 않습니다.")
        );
        article.update(articleRequestDto,userDetails);
        articleRepository.save(article);
        return new ArticleReponseDto(article);
    }

    public ResponseEntity delete(Long artcleId, UserDetailsImpl userDetails) {

        Article article = articleRepository.findById(artcleId).orElseThrow(
                () -> new IllegalArgumentException("게시글이 존재하지 않습니다.")
        );
        if(userDetails.getUser().getUserId().equals(article.getUserId()) ){
            articleRepository.delete(article);
            return new ResponseEntity("게시글 삭제 성공", HttpStatus.OK);
        }else{
            return new ResponseEntity("아이디가 일치 하지않습니다", HttpStatus.BAD_REQUEST);
        }
    }
}
