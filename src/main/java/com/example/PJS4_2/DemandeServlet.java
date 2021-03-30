package com.example.PJS4_2;

import lib.Article;
import lib.Mission;
import persistant.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DemandeServlet", value = "/DemandeServlet")
public class DemandeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request,response);
        response.setContentType("text/html");
        List<Mission> missions = Data.getInstance().getMissions();
        request.setAttribute("missions", missions);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
