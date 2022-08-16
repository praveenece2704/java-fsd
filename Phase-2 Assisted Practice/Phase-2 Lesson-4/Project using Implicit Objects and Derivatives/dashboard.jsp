<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="dashboard.css" />
<title>Insert title here</title>
</head>
<body style='background-image:url(use.jpg);'>
<header>
<h2><%
     String name=request.getParameter("name");
     String val=(String)session.getAttribute("nameuse");
     if(name!=null)
     {
     out.println("Welcome "+name);
     }
     else
     {
     out.println("Welcome "+val);
     }
%></h2>
</header>

<div class="login-wrapper">
<form action="Result.jsp" method="get" class="form">
 <h2>Fill the below details</h2>
 <div class="input-group">
<input name="mark1" type="text" required/>
<label for="mark1">Enter the 10TH mark : </label>
</div>
 <div class="input-group">
<input name="mark2" type="text" required/>
<label for="mark2">Enter the 12TH mark : </label>
</div>
 <div class="input-group">
<input name="school" type="text" required/>
<label for="school">Enter the school name : </label>
</div>
 <div class="input-group">
<input name="chem" type="text" required/>
<label for="chem">Enter the chemistry mark : </label>
</div>
 <div class="input-group">
<input name="math" type="text" required/>
<label for="math">Enter the Mathematics mark : </label>
</div>
 <div class="input-group">
<input name="phys" type="text" required/>
<label for="phys">Enter the Physics mark : </label>
</div>
<input class="submit-btn" type="submit" value="SUBMIT">
</form>
</div>
</body>
</html>