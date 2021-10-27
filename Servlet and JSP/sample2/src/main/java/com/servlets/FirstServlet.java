/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;

/**
 *
 * @author Nik
 */
public class FirstServlet implements Servlet {

    ServletConfig conf;

    //Life cycle methods
    @Override
    public void init(ServletConfig conf) throws ServletException {
        this.conf = conf;
        System.out.println("Creating object.....");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("This is First servlet using Servlet interface");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>This is first servlet using Servlet interface.</h1>");
        out.println("<h4 fontsize=30px>");
        out.println("<br/>Servlet is a interface which is present in javax.servlet package");
        out.println("It has 5 abstract methods - <br/>");
        out.println("1)public void init(ServletConfig)<br/>");
        out.println("2)public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException <br/>");
        out.println("3)void destroy()<br/>");
        out.println("4)String getServletInfo()<br/>");
        out.println("5)ServletConfig getServletConfig()<br/>");
        out.println("First 3 are lifecycle methods of servlet and oher two are non lifecycle methods.<br/>");
        out.println("As Servlet is an interface we have to implement all this methods in our servlet.");
        out.println("<h4/>");
    
    }

    @Override
    public void destroy() {
        System.out.println("Destoying servlet object.");
    }

    //non life cycle methods
    @Override
    public String getServletInfo() {
        return "This servlet is created by Nikhil.";
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.conf;
    }

}
