<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div><a href='../'>홈으로</a></div>
<div><a href='join.jsp'>회원가입</a></div>
<hr>
<%
 		pageContext.setAttribute("pageInfo", "스마트");
		request.setAttribute("requestInfo", "웹&앱");

%>
<h3>회원정보[  <%=pageContext.getAttribute("pageInfo") %>
			 <%=request.getAttribute("requestInfo") %>]</h3>


<%
  	String name = request.getParameter("name");
  	String gender = request.getParameter("gender");
	String []hobby = request.getParameterValues("hobby");

%>

<div>이름 : <%=name %></div>
<div>성별 : <%=gender %></div>
<div>취미 : 

<%
for(String h: hobby){
	out.print(h + "&nbsp;");
	}
%>

<div>
<%
 /*  RequestDispatcher rd 
  = request.getRequestDispatcher("./");//홈화면으로 연결
  rd.forward(request, response); */
  response.sendRedirect("../"); //홈으로
%>

</div>
</body>
</html>