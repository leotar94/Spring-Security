<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html"; charset="ISO-8859-1">
<title>ADMIN</title>
</head>
<body>
	Dear <strong>${user }</strong>, Welcome to admin page.
	<a href = "<c:url value="/logout" />">logout</a>
</body>
</html>