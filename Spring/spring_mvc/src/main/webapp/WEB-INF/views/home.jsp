<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
</head>
<body>
	<h1>This is home page!!!</h1>
	<%
	String name = (String) request.getAttribute("Name");
	Integer id = (Integer) request.getAttribute("Id");
	List<String> friends = (List<String>) request.getAttribute("Friends");
	%>

	<h1>
		Welcome
		<%=name%>!
	</h1>
	<h1>
		Your id is
		<%=id%></h1>

	<%
	for (String friend : friends) {
	%>
	<h1><%=friend%></h1>
	<%
	}
	%>

</body>
</html>