/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.html_form_example.session_tracking;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nik
 */
public class Servlet2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet2</title>");
            out.println("</head>");
            out.println("<body>");
            //getting all the cookies 
            Cookie c[] = request.getCookies();

            boolean f = false;
            String name = "";

            if (c == null) {
                out.println("<h1>You are new user go to homepage and submit name.</h1>");
                return;
            } else {
                for (Cookie cookie : c) {
                    if (cookie.getName().equals("name")) {
                        f = true;
                        name = cookie.getValue();
                    }
                }
            }
            if (f) {
                out.println("<h1>Hello," + name + " Welcome back again.</h1>");
                out.println("<h2>We have fetched the name succesfully using cookie in servlet2 request.</h2>");
                out.println("<h2>Thank you!</h2>");
            } else {
                out.println("<h1>You are new user go to homepage and submit name.</h1>");
            }
            
            out.print("<h2>Drwabacks of cookies - </h2>");
            out.println("<ul style='font-size:25px;'>");
            out.println("<li>Some special characters are not allowed in cookies as a value eg.space is not allowed i.e only single word value can be given</li>");
            out.println("<li>We can only store textual data in cookies as a key value pair.No other type of data can be stored.</li>");
            out.println("</ul>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
