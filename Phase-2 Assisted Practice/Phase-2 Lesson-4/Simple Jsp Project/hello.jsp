<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  
	int n1=Integer.parseInt(request.getParameter("a"));
    int n2=Integer.parseInt(request.getParameter("b"));
    int n3=Integer.parseInt(request.getParameter("c"));
    int n4=Integer.parseInt(request.getParameter("d"));
    out.println(n1+n2+n3+n4);
	  
	%>  
	
	<a href="header.jsp">Click here for welcome page</a>
	<%= 10 %>
	<%! int n=10; %>
	<%-- This is comment--%>
</body>
</html>