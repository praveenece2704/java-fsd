<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, java.lang.*"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="verify.css" />
<title>Insert title here</title>
 
</head>
<body style='text-align:center;'>
<header>
  <h2><%String name= request.getParameter("name");//implicit objects
  out.println("Welcome "+name);
  session.setAttribute("nameuse",name);
%></h2>
</header>

<form style='text-align:center'>
<section >
<nav>
<img src="de.jfif" alt="Paris" class="center">
<span style='color:powerblue;font-size:30px'><%= name %></span><br><br>
<q style="font-style:italic;font-size:25px">Personal details of the Student</q>
</nav>
<article >
<h1 style='font-style:italic;font-size:25px'>Verify your details</h1>
 <div class="cen">
 <table class="cen">
 <tr>
    <td>Username: </td>
    <td><%= request.getParameter("name") %></td>
    </tr>
    <tr>
    <td>Password: </td>
    <td><%= request.getParameter("pass") %></td>
</tr>
<tr>
    <td>Age: </td>
    <td><%= request.getParameter("age") %></td>
</tr>
<tr>
    <td>Branch: </td>
    <td><%= request.getParameter("branch") %></td>
</tr>
<tr>
    <td>Card: </td>
    <td><%= request.getParameter("card") %></td>
    </tr>
</table>
<a href="dashboard.jsp">Submit & verified</a>
</div>
</article>
</section>
</form>
</body>
</html>