/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-11-16 05:32:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.text.*;
import java.util.*;

public final class sum_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


	int num1, num2;
	String operator;

	int calculate() {
		int result = 0;
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
	}
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/include/today.jsp", Long.valueOf(1668500742150L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.text");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div>\r\n");
      out.write("		<a href=\"./\">홈으로</a>\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

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

      out.write("\r\n");
      out.write("\r\n");

SimpleDateFormat  df= new SimpleDateFormat("yyyy년 MM월 dd일");
String today = df.format(new Date());

      out.write("\r\n");
      out.write("\r\n");
      out.write("[");
      out.print(today );
      out.write("]\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<hr>\r\n");
      out.write("	<h3>스크립팅 기본 문법</h3>\r\n");
      out.write("	<div>1.스크립트릿</div>\r\n");
      out.write("	<div>합 계산하기</div>\r\n");
      out.write("	");

	int sum = 0;
	for (int i = 1; i <= 10; i++) {
		sum += i;
	}
	String text = "가나다";

	num1 = 10;
	num2 = 20;
	operator = "*";
	int result = calculate(); //아래메소드내에 선언된 result와 다른 변수

	num1 = 20;
	num2 = 20;
	operator = "+";
	int a = calculate();

	//메소드와 변수는 아래에 선언되어져 있지만 (메모리에 올라가는 순서가 없기 때문에) 앞쪽에서 가져와서 사용할 수 있다
	//즉 선언부 없이 가져와서 사용가능(num1 = 10 , num2 = 20;)
	
      out.write("\r\n");
      out.write("	<div>2.표현식(데이터 출력시)</div>\r\n");
      out.write("	");
      out.print("가나다");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print(text);
      out.write("\r\n");
      out.write("	<div>\r\n");
      out.write("		1~10까지의 합 :\r\n");
      out.write("		");
      out.print(sum);
      out.write("</div>\r\n");
      out.write("	<div>");
      out.print("1부터 10까지의 합 :" + sum);
      out.write("</div>\r\n");
      out.write("	<div>");
      out.print(num1);
      out.print(operator);
      out.print(num2);
      out.write('=');
      out.print(calculate());
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
