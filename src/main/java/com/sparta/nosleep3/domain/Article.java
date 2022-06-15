package com.sparta.nosleep3.domain;

import com.sparta.nosleep3.dto.requestdto.ArticleRequestDto;
import com.sparta.nosleep3.security.UserDetailsImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Article extends Timestamped{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long artcleId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Long userId;


    //post 할떄 입력값을 (title,content)에 넣어줬다.
    public Article(ArticleRequestDto articleRequestDto, UserDetailsImpl userDetails) {
        this.title = articleRequestDto.getTitle();
        this.content = articleRequestDto.getContent();
        this.userId = userDetails.getUser().getUserId();
    }

    public void update(ArticleRequestDto articleRequestDto, UserDetailsImpl userDetails) {
        this.title = articleRequestDto.getTitle();
        this.content = articleRequestDto.getContent();
        this.userId = userDetails.getUser().getUserId();
    }
}
