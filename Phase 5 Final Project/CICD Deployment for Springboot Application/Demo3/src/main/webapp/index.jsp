<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h2>Insert the user details</h2>
<form action="addUsers">
Enter the id: <input name="id"/>
Enter the name: <input name="name"/>
Enter the age:<input name="age"/>
<input type="submit"/><br>
</form>
<h2>Display the user details</h2>
<form action="displayUsers">
Enter the Id: <input name="id"/>
<input type="submit"/>
</form>
</form>
<h2>Delete the user details</h2>
<form action="deleteUsers">
Enter the Id: <input name="id"/>
<input type="submit"/>
</form>

</form>
<h2>Update details</h2>
<form action="updateUsers">
Enter the Id: <input name="id"/>
<input type="submit"/>
</form>
</body>
</html>