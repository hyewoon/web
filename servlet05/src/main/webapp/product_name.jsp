<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> 상품 목록</h3>

<table border= '1'>
<tr><th>번호</th> <td>${name.num }</td> </tr>
<tr><th>상품명</th> <td>${name.name }</td> </tr>
<tr><th>회사명</th> <td>${name.company }</td> </tr>
<tr><th>가격</th> <td>${name.price }</td> </tr>
<tr><th>수량</th> <td>${name.qty }</td> </tr>

</table>

</body>
</html>