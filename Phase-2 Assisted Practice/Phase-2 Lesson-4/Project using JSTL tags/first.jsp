<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="OperServlet" style='text-align:center'><br>
<span style='margin-top:20px'>Enter the ProductId:<input type="text" name="pid" required/></span><br><br><br>
Enter the ProductName:<input type="text" name="pname" required/><br><br><br>
Enter the ProductReview:<input type="text" name="preview" required/><br><br><br>
Enter the ProductRating:<input type="text" name="prating" required/><br><br><br>
Enter the SupplierId:<input type="text" name="sid" required/><br><br><br>
Enter the CustomerId:<input type="text" name="cid" required/><br><br><br>
Enter the ProductPrice:<input type="text" name="pprice" required/><br><br><br>
<input type="submit" value="submit"/><br>
</form>
</body>
</html>