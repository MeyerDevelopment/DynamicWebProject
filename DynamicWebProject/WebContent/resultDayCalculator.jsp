<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<p>${userDay.getDate()} fell on a ${userDay.getDay()}<br />
<br/>
<a href="DayCalculator.jsp">Try another date</a>
<br/>
<a href="index.jsp">Go to Homepage</a>
</body>
</html>