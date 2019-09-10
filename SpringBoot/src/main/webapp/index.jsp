<jsp:include page="home.jsp"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
input[type=text], select {
  width: 30%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 30%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}
</style>
</head>
<body>
<center><h3>Enter Employee Information</h3></center>
<form action="employee" method="post"><br><br>
<b>Enter Name</b><br><input type="text" name="empName"><br><br>
<b>Enter Date of Birth</b><br><input type="date" name="dob"><br><br>
<b>Enter Salary</b><br><input type="number" name="salary"><br><br>
<input type="submit" value="submit">
</form>
</body>
</html>