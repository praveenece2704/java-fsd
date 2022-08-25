<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@page import="java.util.List,java.util.Scanner,org.springframework.context.ApplicationContext,
      org.springframework.context.support.ClassPathXmlApplicationContext" %>
	<%@page import="com.example.User,com.example.UserDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update here</title>
</head>
<body>
<%
ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
User u=ac.getBean(User.class);
UserDAO dao=ac.getBean(UserDAO.class);
u.setId(Integer.parseInt(request.getParameter("id")));
u.setName(request.getParameter("name"));
u.setEmail(request.getParameter("email"));
int row = dao.insert(u);
if(row>0){ %>
Update is successful
<%}else{%>
Update failed
<%} %>
</body>
</html>