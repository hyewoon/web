<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr>
<div>업체명 :한울직업전문학교</div>
<div>주소 : 광주 서구 경열로 3</div>
	연락처 :<%=request.getParameter("phone") %>
	이메일 :<%=request.getParameter("email") %>
<!-- <div>연락처 : 062-1234-5678 이메일 : admin@hanul.co.kr</div> -->
</body>
</html>