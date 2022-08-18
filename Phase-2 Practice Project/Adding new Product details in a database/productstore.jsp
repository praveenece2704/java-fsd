<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.Product,com.ProductHibernate" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--  <%
 int productid=Integer.parseInt(request.getParameter("productid"));
 int productprice=Integer.parseInt(request.getParameter("productprice"));
 int supplierid=Integer.parseInt(request.getParameter("supplierid"));
 int categoryid=Integer.parseInt(request.getParameter("categoryid"));
 int availablecount=Integer.parseInt(request.getParameter("availablecount"));
 String productname=request.getParameter("productname");
 Product p=new Product();
 p.setProductid(productid);
 p.setAvailablecount(availablecount);
 p.setCategoryid(categoryid);
 p.setProductname(productname);
 p.setProductprice(productprice);
 p.setSupplierid(supplierid); 
 %> --%>
 <jsp:useBean id="p" class="com.Product"></jsp:useBean>
 <jsp:setProperty property="*" name="p"/>
<%
ProductHibernate p1=new ProductHibernate();
int res=p1.store(p);
if(res>0)
out.print("You are successfully Added");
%>
</body>
</html>