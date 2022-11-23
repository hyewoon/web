package command;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TestDAO;

public class TestCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//비즈니스 로직
		//db에서 데이터를 조회해 온다 dbd연결 --> 조회메소드 호출
		TestDAO dao = new TestDAO();
		Date today =dao.select_today();
		
		
		//현재시각 정보 조회메소드 호출
		 String now = dao.select_now();
		 
		 //회원수 조회 메소드
		 int count = dao.user_count();
		 
		
		
		
		//request.setAttribute("today", today);
		 request.setAttribute("today", today);
		 request.setAttribute("now", now);
		 request.setAttribute("user", count);
		
	}
	

	
		
}
