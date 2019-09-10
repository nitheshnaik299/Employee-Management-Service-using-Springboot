<jsp:include page="home.jsp"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Successful</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>

<h1>Deleted Employee</h1>
<table class="w3-table w3-bordered w3-striped w3-border">
<tr class="w3-green">
	<th>Employee Id</th>
	<th>Employee Name</th>
	<th>Date of Birth</th>
	<th>Salary</th>
</tr>
<tr>
<td>${empd.empId}</td>
     <td>${empd.empName}</td>
     <td>${empd.dob}</td>
     <td>${empd.salary}</td>
</tr>
</table>
</body>
</html>