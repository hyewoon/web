<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div> <a href = '../'>홈으로</a>  </div>
<hr>
<h3>배열, 자료구조</h3>
<%
String[] hobby= {"스포츠", "바둑", "유트브"};
request.setAttribute("hobby", hobby);

ArrayList<String> list = new ArrayList<String>();

list.add("사과");
list.add("귤");
list.add("딸기");
session.setAttribute("fruits", list);//주소값(list) 저장

HashMap<String, String>map = new HashMap<String, String>();
map.put("홍길동", "010-123-1201");
map.put("박문수", "010-777-1201");
map.put("이문수", "010-333-1201");
session.setAttribute("phone", map);//setAttribute에 자료를 담는다 "변수값과 같은 속성값에 담는다"

request.getRequestDispatcher("array_result.jsp").forward(request, response);
%>

</body>
</html>