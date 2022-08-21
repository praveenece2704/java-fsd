<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style='text-align:center;font-size:25px;background-image:url("dd.jpg");background-size:cover'>
<%
String opass=request.getParameter("oldpass");
 String npass=request.getParameter("newpass");
 String cpass=request.getParameter("conpass");

 if(npass.equals(opass))
{
	 out.println("<h2 style='color:red'>Oops New password is same as Old password</h2>");
	 RequestDispatcher rd=request.getRequestDispatcher("check.jsp");
	 rd.include(request, response);
}
 else if(npass.equals(cpass))
 {
	 out.println("<h2 style='color:black'>Password Updated Successfully</h2><br><br><br><br>");
	 out.println("<a style='text-decoration:none;font-size:25px;border-style:solid;border-radius:20px;margin-top:300px;border-color:black;padding:2px;color:white;background-color:black' href='adminlogin.jsp'>Click here go to Login Page</a><br>");
 }
 else
 {
	 out.println("<h2 style='color:red'>Oops New password and Confirm password doesn't matches</h12>");
	 RequestDispatcher rd=request.getRequestDispatcher("check.jsp");
	 rd.include(request, response);
 } 
%>
</body>
</html>