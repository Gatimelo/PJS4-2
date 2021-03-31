package com.example.PJS4_2;

import lib.Association;
import persistant.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginAssoServlet", value = "/login/association")
public class LoginAssoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/login2.jsp").forward(request,response);
        request.setAttribute("creer", "Créer un compte pour votre association");
        request.setAttribute("mail", "Email de l'association");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mail = "";
        String mdp = "";
        Association asso = null;
        request.setAttribute("error", "connexion");
        try {
            mail = request.getParameter("mail");
            mdp = request.getParameter("mdp");
            asso = Data.getInstance().getAsso(mail, mdp);
            request.getSession().setAttribute("user", asso);
            if (asso == null) request.setAttribute("error", "connexion échouée");
            else {
                this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request,response);
            }
        }
        catch(Exception e){
            System.out.println("Something went wrong.");
        }

        this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
    }
}
