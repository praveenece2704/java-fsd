<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style='text-align:center;background-image:url("fdd.jfif")'>
<h1 style='font-size:30px'>Flights Available from ${source} to ${dest}</h1>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/airways"  user="root" password="root"/>
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

<table border="4" width="100%" style='border-color:black;color:white;background-color:black;margin-top:50px;margin-bottom:50px'>  
<tr>  
<th>Airline Name</th>  
<th>Price</th>  
<th>Flight Number</th>                   
<th>Source City</th>
<th>Destination City</th>
<th>Departure Time</th>
<th>Arrival Time</th>
<th>Total seats</th>
<th>Booked seats</th>
<th>Seat Availability</th>
<th>Date of Travel</th>
<th>Class (E/B)</th>
</tr>  
	<c:forEach var="table" items="${rs.rows}">  
		<tr>  
			<td><c:out value="${table.airline_name}"/></td>  
			<td><c:out value="${table.price}"/></td>  
			<td><c:out value="${table.flight_no}"/></td>
			<td><c:out value="${table.source_city}"/></td>
			<td><c:out value="${table.destination_city}"/></td>
			<td><c:out value="${table.dep_time}"/></td>
			<td><c:out value="${table.arrival_time}"/></td>
			<td><c:out value="${table.total_seats}"/></td>
			<td><c:out value="${table.booked_seats}"/></td>
			<td><c:out value="${table.seat_availability}"/></td>
			<td><c:out value="${table.date_of_travel}"/></td>
			<td><c:out value="${table.class_Eco_Buis}"/></td> 
		</tr>  
	</c:forEach>  
</table> 
<form action="updation.jsp">
<h2 style='font-style:italic;font-size:25px'>Choose a Flight : <input type="text" name="flight_no"/></h2><br>
<input type="submit" style='text-decoration:none;border-radius:20px;font-size:20px;border-style:solid;border-color:black;padding:7px;color:black;background-color:gold' value="Book"/>
</form>
</body>
</html>