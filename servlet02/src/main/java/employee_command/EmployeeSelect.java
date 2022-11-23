package employee_command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Command;
import dao.HrDAO;
import dto.EmployeeDTO;

public class EmployeeSelect implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//비즈니스로직은 커멘드가 한다 
		//비즈니스 로직 : 사원정보를 DB에서 조회한다
		
		HrDAO dao = new HrDAO();
		ArrayList<EmployeeDTO> list = dao.employee_list();
		//조회해온 데이터를 request에 담는다
		request.setAttribute("list", list);
		

	}

}
