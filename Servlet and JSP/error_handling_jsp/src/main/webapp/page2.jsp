<%-- 
    Document   : page2
    Created on : 25-Oct-2021, 4:21:52 pm
    Author     : Nik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page2</title>
    </head>
    <body>
        <h1>This is page2.</h1>
        <%
            //we are writing redirecive code here.
            response.sendRedirect("page3.jsp");
            //response.sendRedirect("http://www.google.com"); - we can go to third website also by giving its url
        %>
    </body>
</html>
