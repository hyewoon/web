package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employee_command.EmployeeDelete;
import employee_command.EmployeeInsert;
import employee_command.EmployeeSelect;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

//http://localhost:80/servlet02/select.do
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String uri= request.getRequestURI();// /servlet02/select.do
		 request.getContextPath();// /servlet02
		 String context = request.getContextPath();
		 uri = uri.substring(context.length());

	String business = "", view = "";
	if(uri.equals("/select.do")) {
		business = "조회 요청에 대한 비즈니스 로직";
		view = "select"; //조회요청에 대한 응답화면
		
		//직접처리하지 않고 커멘드에게 맡긴다:비즈니스 로직
		EmployeeSelect command = new EmployeeSelect();
		command.execute(request, response);
		
		//응답화면 연결 :기본방식 forward
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
		
		
	
	}else if(uri.equals("/insert.do")) {
		business = "저장 요청에 대한 비즈니스 로직";
		view ="select.do";// "저장 요청에 대한 응답화면";
	
		//비즈니스로직 :db에서 조회하기
		EmployeeInsert command = new EmployeeInsert();
		command.execute(request, response);
		//응답화면 연결 : redirect방식
		//insert.update.delete처리가 실행되는 요청 후 화면연결은 redirect
		response.sendRedirect(view);
		
		
//		 RequestDispatcher rd= request.getRequestDispatcher(view);
//		 rd.forward(request, response);
//		
	}else if(uri.equals("/update.do")) {
		business = "수정 요청에 대한 비즈니스 로직";
		view ="수정 요청에 대한 응답화면";
		
		
		
		
	}else if(uri.equals("/delete.do")) {
		business = "삭제 요청에 대한 비즈니스 로직";
		view ="select.do";
		//비즈니스로직 :db에서 삭제하기
		EmployeeDelete command = new EmployeeDelete();
		command.execute(request, response);
		
		//프리젠테이션 로직
		//응답화면연결 :redirect방식
		response.sendRedirect(view);
		
		
	}
	response.setContentType("text/html; charset =utf-8");
	 PrintWriter out= response.getWriter();
	 out.print("<html>");
	 out.print("<body>");
	 out.print("<div><a href ='front.html'>front controller 패턴</a></div>");
	 out.printf("<div>%s</div>", business);
	 out.printf("<div>%s</div>", view);
	 out.print("</body>");
	 out.print("</html>");
	 
	}
}
