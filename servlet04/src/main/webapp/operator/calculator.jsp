<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div> <a href ='../'>홈으로</a> </div>
<hr>
<h2>계산기</h2>
<form method ='get' action="calculator_result.jsp">
<input type ="text" name = 'num1'>
<input type ="text" name = 'num2'>
<input type ="submit" value = '계산하기'>

</form>

<h3>과일 목록</h3>
<div>${fruits[0]}</div>
<div>${fruits[1]}</div>
<div>${fruits[2]}</div>
</body>
</html>