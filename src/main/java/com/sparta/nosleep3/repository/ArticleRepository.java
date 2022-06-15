package com.sparta.nosleep3.repository;

import com.sparta.nosleep3.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface ArticleRepository extends JpaRepository<Article, Long> {

    // get 할떄 내림차순으로 리스트를 가져옴
    List<Article> findAllByOrderByModifiedAtDesc();

}
