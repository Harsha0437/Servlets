package com.java.cis;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // You should validate the username and password here
        // For simplicity, we'll assume a hardcoded valid username and password
        if (username.equals("harsha") && password.equals("harsha123")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("home.html");
        } else {
            response.sendRedirect("login.html");
        }
    }
}
