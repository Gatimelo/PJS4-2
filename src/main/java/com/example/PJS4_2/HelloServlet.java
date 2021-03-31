package com.example.PJS4_2;

import lib.Article;
import persistant.Data;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/accueil")
public class HelloServlet extends HttpServlet {
    private String message;

    @Override
    public void init() throws ServletException {
        super.init();
        try {
            Class.forName("persitant.MediatekData");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request,response);
        response.setContentType("text/html");
        List<Article> articles = Data.getInstance().getArticles();
        request.setAttribute("articles", articles);

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    public void destroy() {
    }
}