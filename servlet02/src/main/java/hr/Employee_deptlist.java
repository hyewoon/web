package hr;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HrDAO;
import dto.DepartmentDTO;


@WebServlet("/employee/dept_list")
public class Employee_deptlist extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset= utf-8");
		PrintWriter out =response.getWriter();
		out.print("<html><body>");
		
		out.print("<div><a href ='../'>홈으로</a></div>");
		out.print("<div><a href ='index.html'>사원목록</a></div>");
		out.print("<h2>부서목록</h2>");
		out.print("<table border = '1'>");
		out.print("<tr><th>부서코드</th><th>부서목록</th></tr>");
		
		
		 HrDAO dao = new HrDAO();
		 //부서목록 조회 메소드 호출
		 ArrayList<DepartmentDTO> list = dao.department_list();
		 for(DepartmentDTO dto :list) {
			 out.printf("<tr><td>%d</td><td>%s</td></tr>"
					 , dto.getDepartment_id()
					 , dto.getDepartment_name());
		 }
		 
		 out.print("</table>");
		 out.print("</body></html>");
		
	}

}
