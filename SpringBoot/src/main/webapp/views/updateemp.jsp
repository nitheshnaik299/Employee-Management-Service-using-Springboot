
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
<form action="updateemp" method="get">
<b>Id</b><br><input type="text" value="${empd.empId}" name="empid" readonly><br><br>
<b>Name</b><br><input type="text" value="${empd.empName }" name="empname"><br><br>
<b>Date of birth</b><br><input type="date" value="${empd.dob }" name="dob"><br><br>
<b>Salary</b><br><input type="number" value="${empd.salary }" name="sal"><br><br>
<input type="submit" value="Update">
</form>
</body>
</html>