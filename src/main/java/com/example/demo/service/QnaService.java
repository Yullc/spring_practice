package com.example.demo.service;

import com.example.demo.repository.QnaRepository;
import com.example.demo.vo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QnaService {

    @Autowired
    private QnaRepository qnaRepository;
    public List<Article> getForPrintQnaArticles(String searchKeyword) {
        return qnaRepository.getForPrintQnaArticles(searchKeyword);
    }
}
