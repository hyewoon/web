<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>로그인 정보</h3>

<!-- 파라미터 네임, 필드 이름, 데이터 담을 프라터디 필드 모두 같은 이름이여야 한다 -->
<jsp:useBean id="member" class ="dto.MemberDTO"  scope ="session">
</jsp:useBean>
<jsp:setProperty property="*" name="member"/>
<%-- <jsp:setProperty property="id" name="member"/> --%>
<%-- <jsp:setProperty property="pw" name="member"/> --%>
 	id : <jsp:getProperty property="id" name="member"/>
	pw :<jsp:setProperty property="pw" name="member"/>

<%
 String id= request.getParameter("id");
 String pw= request.getParameter("pw");
 /* 아이디, 비번 모두 입력되어 있으면 로그인 된 것으로 간주 */
 if(id.isEmpty() || pw.isEmpty() ){
	 //아이디나 비밀번호가 입력하지 않으면 다시 로그인 화면으로 연결
	 
	 response.sendRedirect("login.jsp");
 }else {
	 //로그인된 정보는 모든 페이지에서 접근할 수 있도록 세션에 담는다
	session.setAttribute("id", id); /* 지정한 속성명으로 값을 저장 */
	session.setAttribute("pw", pw); /* 지정한 속성명으로 값을 저장 */
	//response.sendRedirect("../");//홈화면 연결	
	
}
%>
</body>
</html>