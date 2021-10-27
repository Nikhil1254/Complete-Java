<%-- 
    Document   : home
    Created on : 22-Oct-2021, 1:40:00 pm
    Author     : Nik
--%>
<!--We are learning about JSP and its tags-->


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--this tag is called page directive tag-->
<!--it is used to give information about page to container-->
<%@page import="java.util.Random,java.util.ArrayList,java.util.LinkedList" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background: #e2e2e2;">
        <h1>Hello we are learning about JSP technology here.</h1>

        <h1>------------learning include directive--------------</h1>
        <%@include file="header.jsp" %>


        <h1>---------------learning Declarative tag ------------------</h1>

        <%!
            //this tag is called Declarative(Declaration) tag
            //This tag is used for declaring methods and variables of java code
            int a = 5;
            int b = 10;
            String name = "Nikhil";

            public int add() {
                return a + b;
            }

            public String reverse() {
                StringBuilder str = new StringBuilder(name);
                return str.reverse().toString();
            }

        %>

        <h1>---------------lerning scriplet tag---------------------</h1>

        <%
            //This tag is called Scriplet tag
            //we can write our java code here that we write in service()
            out.println("<h1>Sum of a and b is " + add() + "</h1>");
            out.println("<br/>");
            out.println("<h1>Reverse of Nikhil is " + reverse() + "</h1>");

        %>

        <!--this tag is called expression tag alternative of ut.println()-->

        <h1>----------learning expression tag--------------------</h1>
        <h1 style="color: green;">Sum is <%= add()%></h1>  

        <h1>------------------------leaning page directive-----------------</h1>
        <h1 style="color: blueviolet">
            <%
                Random rand = new Random();
                int num = rand.nextInt(10);
            %>

            <%= "Random value is " + num%>

        </h1>

        <h1>--------------- We are learning taglib directive below ------------------</h1>

        <c:set var="name" value="Nikhil"></c:set>
        <h1><c:out value="${name}"></c:out></h1>
        <c:if test="${3>2}">
            <h1>We are in if block, 3>2 is true hence this is getting printed.</h1>
        </c:if>

    </body>
</html>
