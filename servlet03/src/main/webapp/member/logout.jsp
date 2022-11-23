<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//로그인 정보를 삭제
//session에 attribute로 저장한 값을 삭제 : removeAttribute 속성명을 지정해야 속석이 없어진다
session.removeAttribute("id");
session.removeAttribute("pw");

response.sendRedirect("../");
%>
</body>
</html>