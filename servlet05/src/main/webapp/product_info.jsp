<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상품정보</h3>

<table border='1'>
<tr><th>번호</th><td>${pro_info.num}</td></tr>
<tr><th>상품명</th><td>${pro_info.name}</td></tr>
<tr><th>출판사</th><td>${pro_info.company}</td></tr>
<tr><th>가격</th><td>${pro_info.price}</td></tr>
<tr><th>수량</th><td>${pro_info.qty}</td></tr>

<%-- <table border='1'>
<tr><th>번호</th><td>${name.num}</td></tr>
<tr><th>상품명</th><td>${name.name}</td></tr>
<tr><th>출판사</th><td>${name.company}</td></tr>
<tr><th>가격</th><td>${name.price}</td></tr>
<tr><th>수량</th><td>${name.qty}</td></tr> --%>



</table>

</body>
</html>