/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.html_form_example.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nik
 */
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Welcome to Register servlet.</h1>");
        String name = req.getParameter("user_name");
        String pass = req.getParameter("user_password");
        String email = req.getParameter("user_email");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_course");
        String condition = req.getParameter("condition");

        if (condition != null) {
            out.println("<h2>name: " + name + "</h2>");
            out.println("<h2>password: " + pass + "</h2>");
            out.println("<h2>email: " + email + "</h2>");
            out.println("<h2>Gender: " + gender + "</h2>");
            out.println("<h2>Course: " + course + "</h2>");
            
            //tryning to forward request using RequestDispatcher
            RequestDispatcher rd = req.getRequestDispatcher("success"); //success is url pattern of our other servlet
            rd.forward(req, resp);
        } else {
            out.println("<h2>Please accept terms and conditions.</h2>");
            
            //using RequestDispatcher to include response
            RequestDispatcher rd = req.getRequestDispatcher("index.html");
            rd.include(req, resp);
        }
    }

}
