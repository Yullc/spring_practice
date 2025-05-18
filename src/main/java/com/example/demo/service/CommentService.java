package com.example.demo.service;

import com.example.demo.repository.CommentRepositroy;
import com.example.demo.vo.Comment;
import com.example.demo.vo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepositroy commentRepository;

    public CommentService(CommentRepositroy commentRepository) {
        this.commentRepository = commentRepository;
    }


    public Comment getCommentById(int id) {
        return commentRepository.getCommentById(id);
    }

    public ResultData writeComment(int loginedMemberId, String commentBody, int articleId) {
        commentRepository.writeComment(commentBody,articleId);

        int id = commentRepository.getLastInsertId();

        return ResultData.from("S-1", com.example.demo.util.Ut.f("%d번 글이 등록되었습니다", id), "등록 된 게시글 id", id);
    }
}
