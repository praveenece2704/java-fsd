<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style='background-color:black;color:white'>
<form style='text-align:center;font-size:30px;margin-top:150px;border-style:solid;border-color:white;margin-left:25%;margin-right:25%;padding:10px'>
Transaction successful!!!<br>
<% Random r=new Random();
   long id=r.nextLong();
%>
Tnx.Id is : <%= id %><br>
Thank you for booking ${name}!!!<br>
Happy and Safe Journey...<br>

</form>
</body>
</html>