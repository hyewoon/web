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


@WebServlet("/employee/emp_delete")
public class EmployeeDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HrDAO dao = new HrDAO();
		int id =Integer.parseInt(request.getParameter("id"));
		dao.employee_delete(id);
		
		//
		response.sendRedirect("emp_list");
	}
		
}

