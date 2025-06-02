package com.example.demo.repository;

import com.example.demo.vo.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface QnaRepository {
    public List<Article> getForPrintQnaArticles(String searchKeyword);
}
