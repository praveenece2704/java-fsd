<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, java.lang.*"%> 
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
 <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="verify.css" />
<title>Insert title here</title>
 
</head>
<body style='text-align:center;'>
<jsp:useBean id="p" class="com.PersonalDetails" scope="session" ></jsp:useBean>
<header>
  <h2>Welcome <jsp:getProperty property="fullname" name="p"/></h2>
</header>

<form style='text-align:center'>
<section >
<nav>
<img src="de.jfif" alt="Paris" class="center">
<span style='color:powerblue;font-size:30px'><% out.println("welcome"); %></span><br><br>
<q style="font-style:italic;font-size:25px">Personal details of the Customer</q>
</nav>
<article >
<h1 style='font-style:italic;font-size:25px'>Verify your details</h1>
 <div class="cen">
 <table class="cen">
 <tr>
    <td>Username: </td>
    <td><jsp:getProperty property="username" name="p"/></td>
    </tr>
    <tr>
    <td>FullName: </td>
    <td><jsp:getProperty property="fullname" name="p"/></td>
</tr>
<tr>
    <td>Age: </td>
    <td><jsp:getProperty property="age" name="p"/></td>
</tr>
<tr>
    <td>Address: </td>
    <td><jsp:getProperty property="address" name="p"/></td>
</tr>
<tr>
    <td>Card: </td>
    <td><jsp:getProperty property="card" name="p"/></td>
    </tr>
<tr>
    <td>CardNo: </td>
    <td><jsp:getProperty property="cardno" name="p"/></td>
    </tr>
<tr>
    <td>Country: </td>
    <td><jsp:getProperty property="country" name="p"/></td>
    </tr>  
<tr>
    <td>Card: </td>
    <td><jsp:getProperty property="card" name="p"/></td>
    </tr>
    <tr>
    <td>Mobile: </td>
    <td><jsp:getProperty property="mobile" name="p"/></td>
    </tr>  
<%-- <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/airways"  user="root" password="root"/>
<c:set var="val" value="${value}"/>
<c:set var="val1" value="${value}"/>
<c:set var="date" value="${date}" />
<c:set var="source" value="${source}" />
<c:set var="dest" value="${dest}" />

<sql:query dataSource="${db}" var="rs">
		select * from Flight_details where date_of_travel = ? and source_city = ? and destination_city =?
		<sql:param value="${date}"></sql:param>
		<sql:param value="${source}"></sql:param>
		<sql:param value="${dest}"></sql:param>
</sql:query>

<table border="2" width="100%">  
<tr>  
<th>Airline Name</th>  
<th>Price</th>  
<th>Flight Number</th>                   
<th>Departure Time</th>
<th>Arrival Time</th>
<th>Booked seats</th>

</tr>  
	<c:forEach var="table" items="${rs.rows}">  
		<tr>  
			<td><c:out var="flight_name" value="${table.airline_name}"/></td>  
			<td><c:out value="${table.price}"/></td>  
			<td><c:out value="${table.flight_no}"/></td>
			<td><c:out value="${table.dep_time}"/></td>
			<td><c:out value="${table.arrival_time}"/></td>
			<td><c:out value="${table.booked_seats}"/></td>
		</tr>  
	</c:forEach>  
</table> 
 --%>
 
 <%
 String s=session.getAttribute("source").toString();
 String d=session.getAttribute("dest").toString();
String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/airways";
String user = "root";
String password = "root";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
PreparedStatement ps = null;
ResultSet resultSet = null;
%>
<%
try{ 
String sql ="SELECT * FROM flight_details where source_city =? and destination_city =?";
connection = DriverManager.getConnection(url, user, password);
ps=connection.prepareStatement(sql);

ps.setString(1,s);  
ps.setString(2,d);  
String fno;
String fname;
String fprice;
resultSet = ps.executeQuery();
while(resultSet.next()){
	fno=resultSet.getString("flight_no");
	fname=resultSet.getString("airline_name");
	fprice=resultSet.getString("price");
	session.setAttribute("flight_number", fno);
	session.setAttribute("flight_name",fname);
	session.setAttribute("flight_price",fprice);
	
}
}catch (Exception e) {
e.printStackTrace();
}
%>
<td>Flight Number: </td>
    <td><%= session.getAttribute("flight_num") %></td>
    </tr> 
    <td>Flight Name: </td>
    <td><%= session.getAttribute("flight_name") %></td>
    </tr> 
     <td>Ticket Price: </td>
    <td><%= session.getAttribute("flight_price") %></td>
    </tr> 
</table>
<a href="payment.jsp">Proceed Payment</a>
</div>
</article>
</section>
</form>
</body>
</html>