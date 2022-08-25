<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List,java.util.Scanner,org.springframework.context.ApplicationContext,
    org.springframework.context.support.ClassPathXmlApplicationContext" %>
	<%@page import="com.example.User,com.example.UserDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display here</title>
</head>
<body style='text-align:center;background-color:gold'>


<%
String id=(String)request.getAttribute("ID");
ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
User s=ac.getBean(User.class);
UserDAO dao=ac.getBean(UserDAO.class);

List<User> ss=dao.getallstudents(id);
%>
<table style='text-align:center;margin-left:40%'><br>
  <tr><th>Id</th><br><th>Name</th><br><th>Email</th><br></tr><br>
  <%for(User us:ss){%><br><br>
  <tr><td><%=us.getId()%></td><td><%=us.getName()%></td><td><%=us.getEmail()%></td></tr>
  <%} %>
</table>
<form  action="update.jsp">
<input type="submit" name="edit" value="Update data"></input>
</form>
</body>
</html>

