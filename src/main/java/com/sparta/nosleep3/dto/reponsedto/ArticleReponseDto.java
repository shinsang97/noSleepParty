package com.sparta.nosleep3.dto.reponsedto;

import com.sparta.nosleep3.domain.Article;
import lombok.Getter;

@Getter
public class ArticleReponseDto {
    private Long artcleId;

    private String title;

    private String content;

    public ArticleReponseDto(Long artcleId, String title, String content) {
        this.artcleId = artcleId;
        this.title = title;
        this.content = content;
    }

    public ArticleReponseDto(Article article) {
        this.artcleId = article.getArtcleId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
