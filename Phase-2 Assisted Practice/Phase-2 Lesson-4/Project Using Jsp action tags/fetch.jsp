<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style='font-size:18px;text-align:center;background-image:url(use.jpg)'>
<jsp:include page="header1.jsp"></jsp:include>
<jsp:useBean id="empp" class="advanced.Employe" scope="session"></jsp:useBean>
<div style='font-size:35px;position: absolute;top: 50%;left: 50%;transform: translate(-50%, -50%)'>
Emp id is <jsp:getProperty property="id" name="empp"/><br>
Emp Name is <jsp:getProperty property="name" name="empp"/><br>
Emp Age is <jsp:getProperty property="age" name="empp"/><br>
Emp Department is <jsp:getProperty property="dept" name="empp"/><br>
</div>

</body>
</html>