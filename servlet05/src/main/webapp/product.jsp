<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상품목록 출력</h3>

<table border ='1'>
<tr><th>번호</th><th>상품명</th><th>출판사</th><th>가격</th><th>수량</th></tr>

<c:forEach items ='${list}' var ='dto'>

<tr>
<td><a href ='product_info.pd?num=${dto.num}'>${dto.num}</a></td>
<td><a href ='product_name.pd?name=${dto.name}'>${dto.name}</a></td>
<td>${dto.company}</td>
<td>${dto.price}</td>
<td>${dto.qty}</td>

</c:forEach>
</tr>
</table>
</body>
</html>