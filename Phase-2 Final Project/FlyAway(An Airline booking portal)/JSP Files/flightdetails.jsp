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
<%
     String date=request.getParameter("bdate");
     String source=request.getParameter("Slocation");
     String destination=request.getParameter("Dlocation");
     int v=Integer.parseInt(request.getParameter("num"));
     if(date!=null || source!=null || destination!=null ||v!=0)
     {
     session.setAttribute("date",date);
     session.setAttribute("source",source);
     session.setAttribute("dest",destination);
     session.setAttribute("value", v);
     response.sendRedirect("filter.jsp");
     }
     else
     {
    	out.println("Oops!!! Please enter the all the details");
    	response.sendRedirect("search.jsp");
     }
     
%>

</body>
</html>