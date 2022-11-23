package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;
import dto.ProductDTO;

public class ProductNameCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		 String name = request.getParameter("name");
		 ProductDAO dao = new ProductDAO();
		 ProductDTO dto = dao.select_product_name(name);
		 
		 //받은 값을 저장한다
		 request.setAttribute("name", dto);

	}

}
