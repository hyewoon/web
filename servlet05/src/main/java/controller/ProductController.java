package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.ProductCommand;



@WebServlet("*.pd")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	   	String uri= request.getRequestURI();
		String path = request.getContextPath();
		uri = uri.substring(path.length());
		
		if(uri.equals("/product.pd")) {
			ProductCommand pc = new ProductCommand();
			pc.execute(request, response);
			//비즈니스 로직
			
			//응답화면 연결 : 기본 forward
			//redirect 하는 경우 : Db에 insert, update, delete 하는 요청에 대한 처리를 하는 경우
			RequestDispatcher rd = request.getRequestDispatcher("product.jsp");
			rd.forward(request, response);
		}
		
		
	   
	   
	}

	

}
