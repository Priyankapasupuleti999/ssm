<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h2 align="center">Scheduled Sessions</h2>
	<table border=1 align="center">
		<tr>
			<th>SessionName
			<th>Duration(Days)
			<th>Faculty
			<th>Mode
		</tr>
		<c:forEach items="${session}" var="element">
			<tr>
				<td align="center">${element.name}</td>
				<td align="center">${element.duration}</td>
				<td align="center">${element.faculty}</td>
				<td align="center">${element.mode1}</td>
				<td><a href="enroll">Enroll Me</a></td>
		</c:forEach>
	</table>
</body>
</html>