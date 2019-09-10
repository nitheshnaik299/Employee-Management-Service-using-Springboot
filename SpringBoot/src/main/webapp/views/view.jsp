<jsp:include page="home.jsp"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<center><h3>Employee Information</h3></center>
<table class="w3-table w3-bordered w3-striped w3-border">
<tr class="w3-green">
	<th>Employee Id</th>
	<th>Employee Name</th>
	<th>Date of Birth</th>
	<th>Salary</th>
	<th>Delete</th>
	<th>Update</th>
</tr>
<td>${empn.empId}</td>
     <td>${empn.empName}</td>
     <td>${empn.dob}</td>
     <td>${empn.salary}</td>
     <td><a href='delete?empid=${empn.empId}' onclick="return confirm('Are you sure?')">Delete</a></td>
      <td><a href='update?empid=${empn.empId}'>Update</a></td>
</tr>
</table>
</body>
</html>