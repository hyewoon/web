<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.*" %>
<!-- page지시어를 통해서 날짜, 포맷 import하는 것  -->
    
<!-- <p></p>-->    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div><a href = '/jsp/test/calculate.jsp'>계산기</a></div>
<!--절대경로지정 -->
<div><a href = '/jsp/sum.jsp'>합 계산하기</a></div>
<div><a href = '/jsp/out.jsp'>출력하기</a></div>





<%@ include file ="include/today.jsp"%>
<hr>
<h3>홈[   <%=pageContext.getAttribute("pageInfo") %>
		<%=request.getAttribute("requestInfo") %>]</h3>
			  
			  
<% 
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월 dd일 E a hh시 mm분 ss초");
String now =sdf.format(date); 

%>

<% 


if(request.getAttribute("str") != null){
	String a = (String)request.getAttribute("str");
	out.print(a);
}
%>

<div>날짜정보: <%=date %> </div>
<div>현재: <%=now %> </div>
<hr>
<div>jsp에서 선언할 수 있는 것들
<ul>
<li> html 태그 선언</li>
<li> jsp스크립티 :java 코드</li>
<li> jsp표준액션</li>
<li> EL</li>
<li> JSTL</li>

 
</ul>
<%-- <%@ include file='include/footer.jsp' %> --%>
<jsp:include page ='include/footer.jsp'>
	<jsp:param name ='email' value ='test@naver.com'/>
	<jsp:param name ='phone' value ='031-222-3333'/>
</jsp:include>	

</div>


</body>
</html>