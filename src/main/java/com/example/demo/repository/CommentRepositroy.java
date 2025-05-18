package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.Comment;
@Mapper
public interface CommentRepositroy {
    public Comment getCommentById(int id);

    public int writeComment(String commentBody, int articleId);

    public int getLastInsertId();
}
