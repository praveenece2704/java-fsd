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
<body style='text-align:center'>
<h1 style='color:black;font-style:italic'>Booked Details</h1>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/airways"  user="root" password="root"/>
<sql:query dataSource="${db}" var="rs">  
		select * from book_success 
</sql:query> 

<table border="4" width="100%" style='border-color:black;color:black;background-color:gold;margin-top:50px;margin-bottom:50px'>  
<tr>  
<th>ID</th>  
<th>Booking ID</th>  
<th>Flight Name</th>                   
<th>Ticket Price</th>
<th>Booking Seats</th>
<th>Username</th>
</tr>  
	<c:forEach var="table" items="${rs.rows}">  
		<tr>  
			<td><c:out value="${table.id}"/></td>  
			<td><c:out value="${table.bookingid}"/></td>  
			<td><c:out value="${table.flight_name}"/></td>
			<td><c:out value="${table.flight_price}"/></td>
			<td><c:out value="${table.booking_seats}"/></td>
			<td><c:out value="${table.username}"/></td>
		</tr>  
	</c:forEach>  
</table> 
</body>
</html>