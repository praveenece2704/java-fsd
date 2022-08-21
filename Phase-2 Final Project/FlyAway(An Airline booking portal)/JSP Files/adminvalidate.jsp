<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.Admin" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

        String adname = request.getParameter("username");
        String adpwd = request.getParameter("password");
        
        if (adname == null || adname.equals("") || adpwd == null || adpwd.equals("")) {
                response.sendRedirect("adminlogin.jsp?error=1");
        } else {
                
                session.setAttribute("adname", adname);
                session.setAttribute("pass", adpwd);
                response.sendRedirect("show.jsp");
                
        }
%>
<jsp:useBean id="a" class="com.Admin" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="a"/>
</body>
</html>