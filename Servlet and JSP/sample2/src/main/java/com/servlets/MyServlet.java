/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Nik
 */
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>This is third method of implementing servlet.</h1>");
        out.println("<div style='font-size:30px'>");
        out.println("<ul>");
        out.println("<li>HttpServlet is a class which extends GenericServlet class.</li>");
        out.println("<li>It has given body to service() method.</li>");
        out.println("<li>When we want protocol specific methods we implement our servlet using HttpServlet method.</li>");
        out.println("<li>we have to override methods like doGet(),doPost(),doPut() like that.</li>");
        out.println("</ul>");
        out.println("In first two methods of creating servlet they call service()<br/>");
        out.println("method for any kind of request thats why we have HttpServlet for protocol specific methods.");
        out.println("</div>");
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("We are processing get method.");
//        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
//        out.println("<h1>This is doPost method of MyServlet class.</h1>");
//        out.println(new Date().toString());
//    }
}
