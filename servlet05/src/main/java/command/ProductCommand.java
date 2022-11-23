package command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;
import dto.ProductDTO;

public class ProductCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//메소드 호출
		
		ProductDAO dao = new ProductDAO();
		List<ProductDTO> list = dao.select_product_list();
		
		request.setAttribute("list", list);
		
		
		
		

	}

}
