<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="capture.css"/>
</head>
<body  style='text-align:center;background-image:url(use.jpg)'>
<jsp:include page="header1.jsp"></jsp:include>

<jsp:useBean id="empp" class="advanced.Employe" scope="session" />
<jsp:setProperty property="*" name="empp"/>
<a class='submit-btn' href="fetch.jsp">Fetch data</a><br>
<a class='submit-btn' href="fetch1.jsp">Logout</a><br>
<h1><jsp:include page="footer.jsp"></jsp:include></h1>
</body>
</html>
