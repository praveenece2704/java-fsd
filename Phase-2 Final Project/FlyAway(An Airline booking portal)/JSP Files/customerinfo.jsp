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
<h1 style='color:black;font-style:italic'>Customer Details</h1>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/airways"  user="root" password="root"/>
<sql:query dataSource="${db}" var="rs">  
		select * from register_details 
</sql:query> 

<table border="4" width="100%" style='border-color:black;color:white;background-color:#0095FF;margin-top:50px;margin-bottom:50px'>  
<tr>  
<th>Full Name</th>  
<th>Address</th>  
<th>Age</th>                   
<th>Mobile Number</th>
<th>Username</th>
<th>Card Details</th>
<th>Card Number</th>
<th>Country</th>
</tr>  
	<c:forEach var="table" items="${rs.rows}">  
		<tr>  
			<td><c:out value="${table.fullname}"/></td>  
			<td><c:out value="${table.address}"/></td>  
			<td><c:out value="${table.age}"/></td>
			<td><c:out value="${table.mobile}"/></td>
			<td><c:out value="${table.username}"/></td>
			<td><c:out value="${table.card}"/></td>
			<td><c:out value="${table.cardno}"/></td>
			<td><c:out value="${table.country}"/></td>
		</tr>  
	</c:forEach>  
</table> 

</body>
</html>