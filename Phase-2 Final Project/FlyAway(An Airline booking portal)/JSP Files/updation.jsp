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
<body>
<%
String fli_no=request.getParameter("flight_no");
session.setAttribute("flight_num", fli_no);

%>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/airways"  user="root" password="root"/>
<c:set var="flno" value="${flight_num}"/>
<c:set var="val" value="${value}"/>
<c:set var="val1" value="${value}"/>
<c:set var="date" value="${date}" />
<c:set var="source" value="${source}" />
<c:set var="dest" value="${dest}" />
<sql:update dataSource="${db}" var="count">  
		update Flight_details set booked_seats= booked_seats+?, seat_availability=seat_availability -? where date_of_travel = ? and source_city = ? and destination_city =? and flight_no  =?
		<sql:param value="${val}"></sql:param>
		<sql:param value="${val1}"></sql:param>
		<sql:param value="${date}"></sql:param>
		<sql:param value="${source}"></sql:param>
		<sql:param value="${dest}"></sql:param>
		<sql:param value="${flno}"></sql:param>
</sql:update>

<% 

    response.sendRedirect("register.jsp");
%>                            
</body>
</html>