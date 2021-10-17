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
        out.println("<h1>Todays date and time is "+ new Date().toString()+"</h1>");
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
