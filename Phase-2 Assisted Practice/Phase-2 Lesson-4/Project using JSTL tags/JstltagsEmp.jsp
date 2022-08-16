<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="emp1In" value="${20000}" />
<c:set var="emp2In" value="${14000}" />
<c:set var="emp3In" value="${25000}" />
<c:set var="emp4In" value="${10000}" />

<c:choose>
<c:when test="${emp1In>=9000 && emp1In<=13000}">
Income+bonus of emp1 is <c:out value="${emp1In+5000}"/><br>
</c:when>
<c:when test="${emp1In>=13500 && emp1In<=21000}">
Income+bonus of emp1 is <c:out value="${emp1In+7000}"/><br>
</c:when>
<c:when test="${emp1In>=22000 && emp1In<=26000}">
Income+bonus of emp1 is <c:out value="${emp1In+9000}"/><br>
</c:when>
<c:when test="${emp1In>=28000}">
Income+bonus of emp1 is <c:out value="${emp1In+10000}"/><br>
</c:when>
</c:choose>
<c:choose>
<c:when test="${emp2In>=9000 && emp2In<=13000}">
Income+bonus of emp2 is <c:out value="${emp2In+5000}"/><br>
</c:when>
<c:when test="${emp2In>=13500 && emp2In<=21000}">
Income+bonus of emp2 is <c:out value="${emp2In+7000}"/><br>
</c:when>
<c:when test="${emp2In>=22000 && emp2In<=26000}">
Income+bonus of emp2 is <c:out value="${emp2In+9000}"/><br>
</c:when>
<c:when test="${emp2In>=28000}">
Income+bonus of emp2 is <c:out value="${emp2In+10000}"/><br>
</c:when>
</c:choose>
<c:choose>
<c:when test="${emp3In>=9000 && emp3In<=13000}">
Income+bonus of emp3 is <c:out value="${emp3In+5000}"/><br>
</c:when>
<c:when test="${emp3In>=13500 && emp3In<=21000}">
Income+bonus of emp3 is <c:out value="${emp3In+7000}"/><br>
</c:when>
<c:when test="${emp3In>=22000 && emp3In<=26000}">
Income+bonus of emp3 is <c:out value="${emp3In+9000}"/><br>
</c:when>
<c:when test="${emp4In>=28000}">
Income+bonus of emp4 is <c:out value="${emp3In+10000}"/><br>
</c:when>
</c:choose>
<c:choose>
<c:when test="${emp4In>=9000 && emp4In<=13000}">
Income+bonus of emp4 is <c:out value="${emp4In+5000}"/><br>
</c:when>
<c:when test="${emp4In>=13500 && emp4In<=21000}">
Income+bonus of emp4 is <c:out value="${emp4In+7000}"/><br>
</c:when>
<c:when test="${emp4In>=22000 && emp4In<=26000}">
Income+bonus of emp4 is <c:out value="${emp4In+9000}"/><br>
</c:when>
<c:when test="${emp4In>=28000}">
Income+bonus of emp4 is <c:out value="${emp4In+10000}"/><br>
</c:when>
</c:choose>
<c:remove var="emp1"/>
<c:remove var="emp2"/>
<c:remove var="emp3"/>
<c:remove var="emp4"/>
</body>
</html>