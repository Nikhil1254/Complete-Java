<%-- 
    Document   : error_handling.jsp
    Created on : 23-Oct-2021, 4:28:20 pm
    Author     : Nik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error_page.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>error handling in JSP</title>
    </head>
    <body>
        <h1>Hello welcome!</h1>
        <h1>We will be learning error handling in JSP page in this example.</h1>

        <%!
            int num1 = 20;
            int num2 = 10;
            String name = null;

            public int division() {
                return num1 / num2;
            }

            public int length() {
                return name.length();
            }
        %>

        <h1><%= "Division is " + division()%></h1>
        <h1><%= "Length of String is " + length()%></h1>


        <p style="background: #e2e2e2;color: blue;font-size: 20px;">To see error page set num2 0 or set String null.</p>
    </body>
</html>
