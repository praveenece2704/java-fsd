<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${userdetails} Enter the details do you want to update</h1>
<form action="addUsers">
Enter the id: <input name="id"/>
Enter the name: <input name="name"/>
Enter the age:<input name="age"/>
<input type="submit"/><br>
</form>
</body>
</html>