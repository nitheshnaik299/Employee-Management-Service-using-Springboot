
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script type="text/javascript">

function viewAll()

{

 document.viewall.submit();

}

</script>
</head>
<body>
<center> <h1>Employee Management </h1></center>
<br>
<div class="w3-bar w3-black">
	<a href="home.jsp" class="w3-bar-item w3-button">Home</a>
	<a href="index.jsp" class="w3-bar-item w3-button">ADD EMPLOYEE</a>
	<a href="empnamejsp.jsp" class="w3-bar-item w3-button">GET EMPLOYEE</a>
	<form action="getAll" name="viewall" method="post"><a href="javascript:viewAll()" class="w3-bar-item w3-button">VIEW ALL EMPLOYEE</a></form>
	<a href="delete.jsp" class="w3-bar-item w3-button">DELETE EMPLOYEE</a>
	<a href="update.jsp" class="w3-bar-item w3-button">UPDATE EMPLOYEE</a>


</div>

</body>
</html>