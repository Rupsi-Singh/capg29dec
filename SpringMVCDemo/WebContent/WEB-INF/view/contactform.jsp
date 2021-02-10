<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Form</title>
</head>
<body>
	<h1>Contact Form</h1>
	<form:form action="processContactForm" modelAttribute="contact">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name"  /></td>
			</tr>
			<tr>
				<td>Contact</td>
				<td><form:input path="contact" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email"  /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>