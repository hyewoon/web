package employee_command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Command;
import dao.HrDAO;

public class EmployeeDelete implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 비즈니스로직(DB에서 불러오는 역할) -->command에서
		
		 HrDAO dao = new HrDAO();
		int id =Integer.parseInt(request.getParameter("id"));
		//아이디값을 숫자로 변환해서 가져온다
		dao.employee_delete(id);
	}

}
