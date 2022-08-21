<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="register.css" />
</head>
<body>
<div class="login-wrapper">
<form action="admin.jsp" class="form">
<h2>Register</h2>
  <div id="container" class="login-wrapper">
    

    <div class="input-group">
    <input type="text" name="fullname" required>
    <label for="fname"><b>Full Name</b></label>
    </div>
    
    <div class="input-group">
    <input type="text"name="address" required>
    <label for="address"><b>Address</b></label>
    </div>
    
    <div class="input-group">
    <input type="text" name="age" required>
    <label for="age"><b>Age</b></label>
    </div>
    
    
   <div class="input-group">
    <input type="text" name="mobile" required>
    <label for="mobile"><b>Mobile Number</b></label>
     </div>
     
     <div class="input-group">
   <label for="card"><b>Select Card</b></label>
   <select style="font-size:18px;text-align:center;margin-left:30%" name="card" >
	<option value="Aadhar">Aadhar</option>
	<option value="PAN">PAN</option>
	<option value="Passport">Passport</option>
	<option value="SSN">SSN</option>
	<option value="DLicense">DLicense</option>
	</select>
    </div><br><br>
	<div class="input-group">
         <input type="text" name="cardno" required>
         <label for="cardno"><b>Card No</b></label>
    </div>
    <div class="input-group">
    <input type="text" name="username" required>
    <label for="username"><b>User Name</b></label>
    </div>
    <div class="input-group">
    <input type="text" name="country" required>
    <label for="country"><b>Country</b></label>
    </div>
    <button type="submit" class="RegisterButton">Register</button>
  </div>
</form> 
</div>
</body>
</html>