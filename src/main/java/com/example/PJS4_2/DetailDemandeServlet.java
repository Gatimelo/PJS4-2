package com.example.PJS4_2;

import lib.Article;
import lib.Mission;
import persistant.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DetailDemandeServlet", value = "/mission/*")
public class DetailDemandeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/mission.jsp").forward(request,response);
        response.setContentType("text/html");
        String missionId = request.getPathInfo();
        int id = Integer.parseInt(missionId);
        Mission mission = Data.getInstance().getMission(id);
        request.setAttribute("mission", mission);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
