<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mad Libber</title>
</head>
<body>
<h1>Mad Lib Creater</h1>
<form action="getMadLibServlet" method="post">
Enter Proper Noun:
<input type="text" name="userProperNoun" size="10">
<br/>
Enter verb:
<input type="text" name="userVerb" size="10">
<br/>
Enter adjective:
<input type="text" name="userAdjective" size="10">
<br/>
Enter noun:
<input type="text" name="userNoun" size="10">
<br/>
Enter type of transportation:
<input type="text" name="userTransportation" size="10">
<br/>
<input type="submit" value="Get Mad Lib" />
<br/>
<a href="index.jsp">Go to Homepage</a>
</form>
</body>
</html>