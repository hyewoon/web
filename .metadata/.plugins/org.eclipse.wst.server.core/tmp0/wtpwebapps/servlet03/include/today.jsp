<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import='java.text.*, java.util.*'%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//세션에 저장한 로그인정보인 id를 확인(데이터를 가져와야)
//object타입을 string으로 바꿔야 


String id = (String)session.getAttribute("id");
if(id == null){
	//로그인 해야함 
	out.print("<div><a href = 'member/join.jsp'>회원가입</a></div>");
	out.print("<div><a href = 'member/login.jsp'>로그인</a></div>");
	
}else{
	//로그인 성공
	out.print("[ "+id+" ]");
	out.print("[ <a href = 'member/logout.jsp'>로그아웃</a> ]");
}
%>

<%
SimpleDateFormat  df= new SimpleDateFormat("yyyy년 MM월 dd일");
String today = df.format(new Date());
%>

[<%=today %>]
</body>
</html>