<%-- 
    Document   : operation
    Created on : 23-Oct-2021, 9:34:42 pm
    Author     : Nik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error_page.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            //fetching two numbers
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            //performing operation
            int result = num1 / num2;
        %>

        <!--printing the result-->
        <h1>Result is : <%= result%></h1>
    </body>
</html>
