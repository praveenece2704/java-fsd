<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style='background-color:powderblue;text-align:center'>
<h1 style='color:deepskyblue'> Printing the Product details using Expression Language</h1>
<div style='color:red;font-size:20px'>
Product Id is : ${pid}<br>
Product Name is : ${pname}<br>
Product review is : ${preview}<br>
Product rating is : ${prating}<br>
Supplier Id is : ${sid}<br>
Customer Id is : ${cid}<br>
Product Price is : ${pprice}<br>
</div>


<%
  String val= session.getAttribute("pid").toString();
String val1= session.getAttribute("pname").toString();
String val2= session.getAttribute("preview").toString();
String val3= session.getAttribute("prating").toString();
String val4= session.getAttribute("sid").toString();
String val5= session.getAttribute("cid").toString();
String val6= session.getAttribute("pprice").toString();
%>
<h1 style='color:black'> Printing the Product details using Expression Tag</h1>
<div style='color:red;font-size:20px'>
Product Id is : <%= val %><br>
Product Name is : <%= val1 %><br>
Product review is : <%= val2 %><br>
Product rating is : <%= val3 %><br>
Supplier Id is : <%= val4 %><br>
Customer Id is : <%= val5 %><br>
Product Price is : <%= val6 %><br>
</div>

<h1 style='color:Green'> Printing the Product details using JSTL Tag</h1>
<div style='color:red;font-size:20px'>
Product Id is : <c:out value="${pid}"></c:out><br>
Product Name is : <c:out value="${pname}"></c:out><br>
Product review is : <c:out value="${preview}"></c:out><br>
Product rating is : <c:out value="${prating}"></c:out><br>
Supplier Id is : <c:out value="${sid}"></c:out><br>
Customer Id is : <c:out value="${cid}"></c:out><br>
Product Price is : <c:out value="${pprice}"></c:out><br>
</div>

<h1 style='color:maroon'> Printing the details using toString in POJO class</h1>

<span style='color:red;font-size:20px'>${Details}</span> 


</body>
</html>