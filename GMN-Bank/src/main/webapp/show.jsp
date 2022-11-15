<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bank Details</h1>

	<table>
		<thead>
			<th>bankId</th>
			<th>bankName</th>
			<th>branchName</th>
			<th>IFSC_Code</th>
			<th>address</th>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${bank}">
				<tr>
					<td>${dto.bankId }</td>
					<td>${dto.bankName }</td>
					<td>${dto.branchName }</td>
					<td>${dto.IFSC_Code}</td>
					<td>${dto.address }</td>

					<td></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form action="cust/page" method="post">
	<input type="submit" value="Click_here_for_customer_registration">
	</form>
</body>
</html>