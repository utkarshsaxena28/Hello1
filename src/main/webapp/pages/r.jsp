<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Profile </title>
	</head>
	<body>
	
	<% String x = (String) request.getParameter("name");%>
	<h1> your name is <%= x %></h1>
	</body>
</html>