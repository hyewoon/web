<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div><a href = '../'>홈으로</a></div>
<!-- 상대경로(현재 페이지 기준), 절대경로 -->
<%-- <%@ include file ='../include/today.jsp' %> 상대위치--%>
<%--  <%@ include file ='/include/today.jsp' %> 절대위치 --%>
 <%@ include file ='/include/today.jsp' %> 
 <hr>
<h3>회원가입</h3>
<form method= 'post' action="">
<div>이름 :  <input type ="text" name = 'name'></div>
<div>성별 :  
	<input type ="radio" name = 'gender' value = '남'>남
	<input type ="radio" name = 'gender' value = '여' checked>여
</div>
<div>취미 : 
	 <input type ="checkbox" name = 'hobby' value ='달리기'> 달리기
	 <input type ="checkbox" name = 'hobby' value ='수영'> 수영
	 <input type ="checkbox" name = 'hobby' value ='영화'> 영화
	 <input type ="checkbox" name = 'hobby' value ='낚시'> 낚시
</div>
<input type='submit' value='회원가입'>
</form>
</body>
</html>