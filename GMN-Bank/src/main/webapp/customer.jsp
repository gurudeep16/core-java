<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Customer Registration</h2>

<form action="saveCustom" method="post">
<pre>

<label style="color: blue;">  First Name         : </label>   <input type="text" name="firstName">
<label style="color: blue;">  Last Name          : </label>   <input type="text" name="lastName">
<label style="color: blue;">  Address            : </label>   <input type="text" name="address">
<label style="color: blue;">  Mobile Number      : </label>   <input type="text" name="mobileNumber">
<label style="color: blue;">  Email              : </label>   <input type="text" name="email">
<label style="color: blue;">  User Name          : </label>   <input type="text" name="userName">
<label style="color: blue;">  PassWord           : </label>   <input type="password" name="password">
<label style="color: blue;">  Gender             : </label>   <input type="text" name="gender">
<label style="color: blue;">  Government ID      : </label>   <input type="text" name="govt_id">
<label style="color: blue;">  Balance            : </label>   <input type="text" name="balance">
<label style="color: blue;">  Bank Name          : </label>   <input type="text" name="bankName">

<input type="submit" value="save">

</pre>
</form>
</body>
</html>