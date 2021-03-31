package com.example.PJS4_2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginBenevServlet", value = "/login/benevole")
public class LoginBenevServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/login2.jsp").forward(request,response);
        request.setAttribute("creer", "Créer un compte");
        request.setAttribute("mail", "Votre Email");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
