<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.User,com.UserHibernate" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style='text-align:center;font-size:30px;background-color:gold'>
<jsp:useBean id="u" class="com.User" scope="session"></jsp:useBean>
<%
    UserHibernate uh=new UserHibernate();
    uh.result(u);
    
%>
<h1>Welcome ${name}</h1><br>
<form action="flightdetails.jsp">
<label for="start">Enter the Date : </label>
<input type="date" style='font-size:22px' id="start" name="bdate" value="2022-12-01" min="2022-01-01" max="2022-12-31" required/><br><br>
<label for="Slocation" >Enter the source : </label>
<select style='font-size:22px' name="Slocation" >
<option value="Delhi">Delhi</option>
<option value="Mumbai">Mumbai</option>
<option value="Pune">Pune</option>
<option value="Chennai">Chennai</option>
<option value="Bengaluru">Bengaluru</option>
</select><br><br>
<label for="Dlocation" name="dest">Enter the Destination : </label>
<select name="Dlocation" style='font-size:22px'>
<option value="Delhi">Delhi</option>
<option value="Mumbai">Mumbai</option>
<option value="Pune">Pune</option>
<option value="Chennai">Chennai</option>
<option value="Bengaluru">Bengaluru</option>
</select><br><br>
<label>Enter the number of seats : </label>
<input type="number" style='font-size:22px' id="start" name="num" value="1" min="1" max="10" required/><br><br>
<input style='text-decoration:none;font-size:25px;border-radius:20px;border-style:solid;border-color:black;padding:9px;color:white;background-color:black' type="submit" value="Show Flights"/>
</form>
</body>
</html>