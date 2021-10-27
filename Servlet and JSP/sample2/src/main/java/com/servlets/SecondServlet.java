/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Nik
 */
public class SecondServlet extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("This is second servlet using GenericServlet class");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>This is my second servlet using GenericServlet.</h1>");
        out.println("<div style='font-size:30px;'>");
        out.println("GenericServlet is a class which extends Servlet Interface.<br/>");
        out.println("In this class out of 5 methods 4 methods has given body.<br/>");
        out.println("only for service() method body is not given.<br/>");
        out.println("So when we create our servlet by extending this class <br/>");
        out.println("we have to give body to service() method only.");
        out.println("</div>");
    }
    
}
