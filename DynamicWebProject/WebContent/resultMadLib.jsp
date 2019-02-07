<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MadLib Result</title>
</head>
<body>
<p>${userMadLib.getProperNoun()} was looking for a ${userMadLib.getNoun()} to ${userMadLib.getVerb()} ${userMadLib.getProperNoun()}'s 
<br/>
${userMadLib.getAdjective()} ${userMadLib.getTransportation()}.
<br/>
<a href="MadLib.jsp">Try another MadLib</a>
<br/>
<a href="index.jsp">Go to Homepage</a>
</body>
</html>