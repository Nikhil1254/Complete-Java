<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HELP</title>
</head>
<body>
	<h1>--------------Welcome to help page----------------</h1>
	<h2>We are doing 3 things here</h2>
	<ol>
		<li>ModelAndView to transfer data from controller to view</li>
		<li>access data using normal scriptlet tags</li>
		<li>access data using JSP expression language and JSTL tags</li>
	</ol>
	<%-- <%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	%> --%>

	<h1 style="color: blue;">
		Myself ${name}
		<%-- <%=name%>. --%>
	</h1>
	<h3 style="color: green;">
		My id is ${id }
		<%-- <%=id%> --%>
	</h3>

	<h2>---------------Marks are as follows----------------</h2>

	<c:forEach items="${marks}" var="item">
		<h1 style="color: orange;">${item}</h1>
	</c:forEach>
</body>
</html>