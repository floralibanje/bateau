<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div>// permet dafficher quelque chose sur la meme ligne
	<%= LocalDate.now() %>//dit que l'on va écrire du java qui nous affiche la date d'aujourdhuii
	</div>
	
	<div>
	<%= LocalTime.now() %>
	</div>

</body>
</html>