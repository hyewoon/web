<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>계산 결과</h3>

<% 
//파라미터값을 받는다
int num1 = Integer.parseInt(request.getParameter("num1"));
int num2 = Integer.parseInt(request.getParameter("num2"));
String operator = request.getParameter("operator");
  
 int a = calculate(num1, num2, operator);
//5 + 2 = 7
//num1 + operator + num2

String str = num1 + operator + num2 +"="+ a;

//담기: request에 데이터를 담아놔야 forward 사용할 수 있다

request.setAttribute("str",str);

//홈으로 forward하기 
RequestDispatcher rd = request.getRequestDispatcher("../");
rd.forward(request, response);
 
%>

<%!
int calculate(int num1, int num2, String operator) {
	int  result=0;
	if (operator.equals("+")) {
		result = num1 + num2;
	} else if (operator.equals("-")) {
		result = num1 - num2;
	} else if (operator.equals("*")) {
		result = num1 * num2;
	} else if (operator.equals("/")) {
		result = num2 == 0 ? 0 : num1 / num2;
	}
	return result;
}%>
















</body>
</html>