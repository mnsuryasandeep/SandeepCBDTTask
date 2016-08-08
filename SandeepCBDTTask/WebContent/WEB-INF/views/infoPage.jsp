<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/myApp.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/javascript/myApp.js" /></script>

<title>Income Tax User</title>
</head>
<body>
	<h1>Personal Information</h1>

	<c:url var="addAction" value="/infoPage/xml"></c:url>

	<form:form action="${addAction}" commandName="personalInfo"
		modelAttribute="personalInfo">
		<table>
			
			<tr>
				<td><form:label path="name">
						<spring:message text="Name" />
					</form:label></td>
				<td><form:input path="name" /> <form:errors path="name" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><form:textarea path="address" rows="5" cols="22" /> <form:errors
						path="address" /></td>
				<%-- <td><form:label path="address">
						<spring:message text="Address" />
					</form:label></td>
				<td><form:input path="address" /></td> --%>
			</tr>
			<tr>
				<td><form:label path="pan">
						<spring:message text="PAN" />
					</form:label></td>
				<td><form:input path="pan" /> <form:errors path="pan" /></td>
			</tr>
			<tr>
				<td><form:label path="dob">
						<spring:message text="Date Of Birth" />
					</form:label></td>
				<td><form:input path="dob" /> <form:errors path="dob" /></td>
			</tr>
			<tr>
				<td><form:label path="aYear">
						<spring:message text="Assessement Year" />
					</form:label></td>
				<td><form:input path="aYear" /> <form:errors path="aYear" /></td>
			</tr>
			<tr>
				<td><form:label path="income">
						<spring:message text="Income" />
					</form:label></td>
				<td><form:input path="income" /> <form:errors path="income" /></td>
			</tr>
			<tr>
				<td><form:label path="tds">
						<spring:message text="TDS" />
					</form:label></td>
				<td><form:input path="tds" /> <form:errors path="tds" /></td>
			</tr>
			<tr>
				<td><form:label path="taxDeducted">
						<spring:message text="Tax Deducted" />
					</form:label></td>
				<td><form:input path="taxDeducted" /> <form:errors
						path="taxDeducted" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="<spring:message text="Save"/>" /></td>
				<td><input type="button" value="Cancel"
					onclick="return reset();" /></td>
			</tr>
		</table>
	</form:form>
	
	<br>
</body>
</html>
