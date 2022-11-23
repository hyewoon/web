<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>JSTL</h2>
<div><a href = '../'>홈으로</a></div>

<hr>
<div><a href = 'core.jsp'>코어 라이브러리</a></div>
<div><a href = '<c:url value="/jstl/functions.jsp"/>'> 함수 라이브러리</a></div>
<div><a href = '<c:url value="/jstl/format.jsp"/>'>포맷 라이브러리</a></div>

<hr>
</body>
</html>