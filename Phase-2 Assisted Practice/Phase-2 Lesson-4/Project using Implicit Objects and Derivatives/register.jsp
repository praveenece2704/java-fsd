<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="register.css" />
<title>Insert title here</title>
</head>
<body>
<div class="login-wrapper">
<form action="verify.jsp" class="form">
<h2>Register</h2>
  <div id="container" class="login-wrapper">
    

    <div class="input-group">
    <input type="text" name="name" required>
    <label for="name"><b>User Name</b></label>
    </div>
    
    <div class="input-group">
    <input type="password"name="pass" required>
    <label for="pass"><b>Password</b></label>
    </div>
    
    <div class="input-group">
    <input type="text" name="age" required>
    <label for="age"><b>Age</b></label>
    </div>
    
    
   <div class="input-group">
    <input type="text" name="branch" required>
    <label for="branch"><b>Branch</b></label>
     </div>
     
     <div class="input-group">
    <input type="text" name="card" required>
    <label for="card"><b>Card</b></label>
    </div>
    <button type="submit" class="RegisterButton">Register</button>
  </div>
</form> 
</div>
</body>
</html>