<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Product details</title>
</head>
<body style="text-align:center;background-color:powderblue">
<form action="productstore.jsp">
Fill the below product details to add the product into Database<br><br>
Product Id : <input type="text" name="productid" required/><br><br/>
Product Name : <input type="text" name="productname" required/><br><br/>
Product Price:<input type="text" name="productprice" required/><br><br/>
Supplier Id : <input type="text" name="supplierid" required/><br><br/>
Category Id : <input type="text" name="categoryid" required/><br><br/>
Availability Count : <input type="text" name="availablecount" required/><br><br/>
<input type="submit" value="Add"/><br><br/>
</table>
</form>
</body>
</html> 