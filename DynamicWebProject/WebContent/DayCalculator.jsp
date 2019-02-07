<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Day Calculator</title>
</head>
<body>
	<h1>Determine Day</h1>
<form action="getDayServlet" method="post">
Enter the date to get day of week mm/dd/yyyy:
<input type="text" name="userDate" size="10">
<input type="submit" value="Determine Day" />
<br/>
<a href="index.jsp">Go to Homepage</a>
</form>
</body>
</html>