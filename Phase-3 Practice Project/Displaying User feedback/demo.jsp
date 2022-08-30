<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style='background-color:gold'>
<h1 style="text-align:center;font-size:40px">Please give a feedback</h1>
<form style='padding:15px;margin:15px;font-size:20px'action="link" method="post">
Enter the User Id <input name="uid" style='margin-left:5%;width: 25%;font-size:20px'/><br><br>
Enter Your User name  <input name="uname" style="margin-left:2%;width: 25%;font-size:20px"/><br><br>
Enter the Rating(1-5)
<select name="rating" style='font-size:22px;margin-left:32px;font-size:20px'>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
</select><br><br>
Enter the Feedback <br><textarea name="feedbacks" rows="5" cols="50" style="font-size:20px"></textarea>
<br><br>
Enter the Comments <br><textarea name="ename" rows="5" cols="50" style="font-size:20px"></textarea><br><br>
<input style="font-size:20px;padding:8px" type="submit" value="submit" />
</form>
</body>
</html>