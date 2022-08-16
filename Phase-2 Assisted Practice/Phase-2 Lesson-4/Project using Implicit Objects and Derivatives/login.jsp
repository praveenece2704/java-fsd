<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="login.css" />
<title>Insert title here</title>
</head>
<body>
    <div class="login-wrapper">
      <form action="dashboard.jsp" method="get" class="form">
        <h2>Login</h2>
        <div class="input-group">
          <input type="text" name="name" id="loginUser" required />
          <label for="loginUser">User Name</label>
        </div>
        <div class="input-group">
          <input type="password"  name="pass" id="loginPassword" required/>
          <label for="loginPassword">Password</label>
        </div>
        <input type="submit" value="Login" class="submit-btn" />
      </form>
    </div>
  </body>
<body>
</html>