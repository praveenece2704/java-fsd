<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="Result.css" />
<title>Insert title here</title>
</head>
<body >
<form class=form>
<div>
Total percentage of 10th: <%= request.getParameter("mark1") %><br><br>
Total percentage of 12th: <%= request.getParameter("mark2") %><br>

<%  
	int n1=Integer.parseInt(request.getParameter("chem"));
    int n2=Integer.parseInt(request.getParameter("math"));
    int n3=Integer.parseInt(request.getParameter("phys"));
    float avg= n1+n2+n3;
    out.println("<br>Total Marks of PCM is "+avg);

	%> </div>
	</form>
</body>
</html>