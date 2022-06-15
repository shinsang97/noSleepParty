package com.sparta.nosleep3.repository;

import com.sparta.nosleep3.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


public interface CommentRepository extends JpaRepository<Comment, Long> {

}
