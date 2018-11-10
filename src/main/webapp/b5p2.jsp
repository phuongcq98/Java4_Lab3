<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!int num = 4;%>
	<%
		if (num > 5) {
	%>
	<H3>hi</H3>
	<%
		} else {
	%>
	<h3>num value should not be less than 6</h3>
	<%
		}
	%>

</body>
</html>