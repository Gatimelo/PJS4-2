package com.example.PJS4_2;

import lib.Article;
import persistant.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ArticleServlet", value = "/article/*")
public class ArticleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/article.jsp").forward(request,response);
        response.setContentType("text/html");
        String articleId = request.getPathInfo();
        int id = Integer.parseInt(articleId);
        Article article = Data.getInstance().getArticle(id);
        request.setAttribute("article", article);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
