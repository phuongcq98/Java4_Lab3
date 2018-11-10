<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page session="true" %>
<%@ page isELIgnored="false" %>
<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<%-- <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> --%>
<%-- <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> --%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<font color="red">welcome, ${USER}</font>
	<h1>Welcome to MVC</h1>
	<form action="Controller">
		Name <input type="text" name="txtSearch" value=""></br> <input
			type="submit" value="Search" name="btAction" />
	</form>
</body>
</html>
