<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="home.css" />
<title>Insert title here</title>
</head>
<body>
<h1>Today's date: <%= (new java.util.Date()).toLocaleString()%></h1>
<h1> Welcome to Student Page</h1>
<a class="a1" href="login.jsp">Login</a>
<a class="a2" href="register.jsp">Register</a>
</body>
</html>