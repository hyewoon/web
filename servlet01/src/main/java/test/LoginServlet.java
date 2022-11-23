package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("요청에대한 응답");
		System.out.println("요청에 맞는 비즈니스 로직");
		//비즈니스 로직 : 아이디/비번 일치 조회하는처리
		//주소창을 통해 전달된 파라미터: request에 있다 
		//주소창을 통해 전달된 파라미터데이터는 모두 문자열 
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//응답할 화면
		response.setContentType("text/html; charset =utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h2>로그인 정보</h2>");
		out.printf("<div>아이디 : %s</div>", id);
		out.printf("<div>비번 : %s</div>", pw);
		out.print("<div><a href ='loginform.html>로그인 화면 </a></div>");
		out.print("</body>");
		out.print("</html>");
	}
}
