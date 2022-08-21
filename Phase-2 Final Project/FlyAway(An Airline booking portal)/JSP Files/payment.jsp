<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.payment,com.pyhibernate,java.util.Random" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style='text-align:center;background-image:url("fdd.jfif");padding:10px;font-size:30px'>
<h1 style='color:black;font-size:30px;font-style:italic;font-weight:bold'>Payment Page</h1>
<%
Random random=new Random();
Integer bookid;
bookid = random.nextInt(Integer.SIZE - 4) + 100256000;;
session.setAttribute("bookingid",bookid);
String flight_number=session.getAttribute("flight_num").toString();
String flight_name=session.getAttribute("flight_name").toString();
String flight_price=session.getAttribute("flight_price").toString();
String booking_seats=session.getAttribute("value").toString();
String username=session.getAttribute("name").toString();
String bookingid=session.getAttribute("bookingid").toString();
out.println("<form>");
out.println("<br>BookingId is : "+bookingid);
out.println("<br><br>Username is : "+username);
out.println("<br><br>Flight number is : "+flight_number);
out.println("<br><br>Flight_name is : "+flight_name);
out.println("<br><br>Per Ticket Price is : "+flight_price);
out.println("<br><br>No of seats booked is : "+booking_seats+"<br><br>");
out.println("</form>");
payment p=new payment();
p.setFlight_name(flight_name);
p.setFlight_number(flight_number);
p.setFlight_price(flight_price);
p.setBooking_seats(booking_seats);
p.setUsername(username);
p.setBookingid(bookingid);
%>
<%
   pyhibernate py=new pyhibernate();
   py.result(p);
%>
<a href="success.jsp" style='text-decoration:none;border-style:solid;border-color:black;padding:2px;color:white;border-radius:20px;background-color:black' >Click here to PAID</a>
</body>
</html>