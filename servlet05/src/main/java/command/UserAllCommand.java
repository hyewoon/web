package command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import dto.UserDTO;

public class UserAllCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//전체 사용자의 모드 정보 조회
		
		
		
		//db에서 전체사용자이름을  죄회해 온다
		 UserDAO dao= new UserDAO();
		 List<String> list = dao.select_name_all();
		 List<UserDTO> user_list= dao.select_user_list();
		
		//화면에 출력할 수 있도록 request에  attribute로 담는다
		 request.setAttribute("list", list);
		 request.setAttribute("user_li", user_list);
	}

}
