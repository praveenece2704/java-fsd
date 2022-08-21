<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="login.css"/>
</head>
<body style='text-align:center;background-image:url("deee.jpg");background-size: cover'>
<%
  if (request.getParameter("error") != null)
          out.println("Oops !!! please enter the valid username and password");
%>
<h1 style='font-size:30px;color:white;margin-top:10px;font-family:Times New Roman;font-style:italic'>Welcome to Admin Page</h1>
<div class="login-wrapper">
      <form action="adminvalidate.jsp" method="get" class="form" style='background-color:black'>
        <h2  style='font-size:30px;color:white;margin-top:10px;font-family:Times New Roman;font-style:italic'>Admin Login</h2>
        <div class="input-group">
          <input type="text" name="username" id="loginUser" required />
          <label for="loginUser">User Name</label>
        </div>
        <div class="input-group">
          <input type="password"  name="password" id="loginPassword" required/>
          <label for="loginPassword">Password</label>
        </div>
         <a style='margin-right:70%;text-decoration:none;color:black;background-color:gold;width:100%' class="submit-btn" href="check.jsp">Change Password</a><br>
        <input style='color:white;background-color:deepskyblue' type="submit" value="Login" class="submit-btn" />
       
      </form>
    </div>
</form>

</body>
</html>