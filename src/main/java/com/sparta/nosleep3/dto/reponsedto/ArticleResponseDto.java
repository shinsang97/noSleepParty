package com.sparta.nosleep3.dto.reponsedto;

import com.sparta.nosleep3.domain.Article;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ArticleResponseDto {
    private Long artcleId;

    private String title;

    private String content;

    private LocalDateTime modifiedAt;

    public ArticleResponseDto(Long artcleId, String title, String content,LocalDateTime modifiedAt) {
        this.artcleId = artcleId;
        this.title = title;
        this.content = content;
        this.modifiedAt = modifiedAt;
    }

    public ArticleResponseDto(Article article) {
        this.artcleId = article.getArtcleId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.modifiedAt = article.getModifiedAt();
    }
}
