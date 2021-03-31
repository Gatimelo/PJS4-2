package com.example.PJS4_2;

import lib.Article;
import persistant.Data;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/", loadOnStartup = 1)
public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        try {
            Class.forName("persistant.Data");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("tetee");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("ouiidz");
        this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request,response);
        response.setContentType("text/html");
        List<Article> articles = Data.getInstance().getArticles();
        request.setAttribute("articles", articles);
        System.out.println("passé");

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}