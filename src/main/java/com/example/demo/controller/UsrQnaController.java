package com.example.demo.controller;

import com.example.demo.vo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.QnaService;
import com.example.demo.util.Ut;
import com.example.demo.vo.Qna;
import com.example.demo.vo.ResultData;
import com.example.demo.vo.Rq;

import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.util.List;

@Controller
public class UsrQnaController {

    @Autowired
    private Rq rq;

    @Autowired
    private QnaService qnaService;

    @RequestMapping("/usr/article/qna")
    public String showQna(HttpServletRequest req, Model model,
                          @RequestParam(defaultValue = "") String searchKeyword) throws IOException
    {

        Rq rq = (Rq) req.getAttribute("rq");


        List<Article> articles = qnaService.getForPrintQnaArticles(searchKeyword);
        model.addAttribute("searchKeyword", searchKeyword);
        model.addAttribute("articles", articles);

        return "usr/article/qna";
    }

}