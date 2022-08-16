<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="xmlvar">
<employees>  
<employee>  
  <name>Rajesh</name>  
  <age>34</age>  
  <dept>IT</dept>  
</employee>  
<employee>  
  <name>Vinay</name>  
  <age>35</age>  
  <dept>IT</dept>  
</employee> 
<employee>  
  <name>Ramesh</name>  
  <age>29</age>  
  <dept>HR</dept>  
</employee> 
<employee>  
  <name>Kamal</name>  
  <age>35</age>  
  <dept>IT</dept>  
</employee>  
</employees>  
</c:set>  

<x:parse xml="${xmlvar}" var="output"/>

<%-- <x:choose>  
   <x:when select="$output//employee[1]/dept = 'HR'">  
        Rajesh<br>
   </x:when>
   <x:when select="$output//employee[2]/dept = 'HR'">  
        Vinay<br>
   </x:when>
   <x:when select="$output//employee[3]/dept = 'HR'">  
        Ramesh<br>
   </x:when>
   <x:when select="$output//employee[4]/dept = 'HR'">  
       Kamal<br>
   </x:when>   
   <x:otherwise>  
      The author is unknown...  
   </x:otherwise>  
</x:choose>
<x:forEach select="$output//employee">
<x:choose>  
   <x:when select="name='Vinay'">  
<x:out select="age"/> is the age of Vinay<br>
   </x:when>
</x:choose>
</x:forEach> --%>
<br>
<br>
<x:forEach select="$output//employee">  
<x:if select="dept='HR'">
<x:out select="name"/> is working as HR<br>
</x:if>
</x:forEach>
<br>

<br>
<x:forEach select="$output//employee">  
<x:if select="name='Vinay'">
<x:out select="age"/> is the age of Vinay<br>
</x:if>
</x:forEach>
<br>

<x:forEach select="$output//employee">  
<x:if select="dept='IT'">
<x:out select="name"/> is working in IT<br>
</x:if>
<x:if select="dept='HR'">
<x:out select="name"/> is working as HR<br>
</x:if>
</x:forEach>


<br><br>
<x:forEach select="$output/employees/employee">  
<x:if select="age<30">
<x:out select="name"/>
Your are younger<br>
</x:if>
<x:if select="age>=30" >
<x:if select="age<=35" >
<x:out select="name"/>
Your are experienced<br>
</x:if>
</x:if>
</x:forEach>


<br>
<x:out select="$output//employee[2]/name"></x:out><br>
<x:out select="$output//employee[3]/name"></x:out>
   
</body>
</html>