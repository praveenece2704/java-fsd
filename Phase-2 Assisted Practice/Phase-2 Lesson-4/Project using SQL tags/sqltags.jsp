<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/db_world"  user="root" password="root"/>


<%-- <sql:update dataSource="${db}" var="count">
INSERT INTO emp VALUES (95,'Virendra', 44000);
</sql:update>

<sql:update dataSource="${db}" var="count">
INSERT INTO emp VALUES (96,'Praveen', 44000);
</sql:update>

<sql:update dataSource="${db}" var="count">
INSERT INTO emp VALUES (97,'Kumar', 44000);
</sql:update> --%>

<%-- <sql:update dataSource="${db}" var="count">  
		update emp set empname="manager" where salary>20000
</sql:update>  --%>

<c:set var="empid" value="103"/>  
	<sql:update dataSource="${db}" var="count">  
		DELETE FROM emp WHERE empid = ?  
	 <sql:param value="${empid}" />  
</sql:update> 

<c:set var="empid" value="102"/>  
	<sql:update dataSource="${db}" var="count">  
		DELETE FROM emp WHERE empid = ?  
	 <sql:param value="${empid}" />  
</sql:update> 

<sql:query dataSource="${db}" var="rs">  
	SELECT * from emp where empid between 101 and 104;  
</sql:query>

<table border="2" width="100%">  
<tr>  
<th>Employee ID</th>  
<th>Employee Name</th>  
<th>Salary</th>  
<th>Age</th>  
</tr>  
	<c:forEach var="table" items="${rs.rows}">  
		<tr>  
			<td><c:out value="${table.empid}"/></td>  
			<td><c:out value="${table.empname}"/></td>  
			<td><c:out value="${table.salary}"/></td>  
			<td><c:out value="${table.age}"/></td>  
		</tr>  
	</c:forEach>  
</table>  

 
</body>
</html>