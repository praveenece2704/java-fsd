<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.Admin,com.AdminHibernate" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="a" class="com.Admin" scope="session"></jsp:useBean>
<%
    AdminHibernate ah=new AdminHibernate();
    ah.result(a);
    
%>
<body style='text-align:center;font-size:30px;background-color:gold'>
<h1 style='font-weight:bold;font-style:italic;font-size:40px'>Welcome ${adname}</h1><br><br>
<a href="seedetails.jsp" style='text-decoration:none;border-radius:20px;font-size:25px;border-style:inset;border-color:silver;padding:5px;color:white;background-color:#555;'>Flight Details</a><br><br>
<a href="customerinfo.jsp" style='text-decoration:none;border-radius:20px;font-size:25px;border-style:inset;border-color:silver;padding:5px;color:white;background-color:#555;'>Customer Details</a><br><br>
<a href="bookedinfo.jsp" style='text-decoration:none;font-size:25px;border-radius:20px;border-style:inset;border-color:silver;padding:5px;color:white;background-color:#555;'>Booked Details</a><br><br>
</body>
</html>