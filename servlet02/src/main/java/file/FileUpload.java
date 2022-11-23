package file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/upload")
@MultipartConfig //파일업로드를 위한 annotation
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		
		//업로드하려는 파일을 저장할 물리적 위치 지정 
	String path=getServletContext().getRealPath("upload");
	//D:\\Study_Web\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\servlet02\\upload
	//해당 지정폴더가 없으면 폴더생성하기(upload파일지금은없다)
	 File dir = new File(path);
	 if( ! dir.exists()) dir.mkdirs();
	 
	 //업로드한 파일목록을 저장할 배열
	 ArrayList<String> list = new ArrayList<String>();
	 
	  
	 //파일을 읽어서 저장하는 처리
	 //파일정보 확인
	Collection <Part> files =request.getParts();
	for(Part file :files ) {
		//첨부파일 태그는 name을 attach1, attach2
		if(file.getName(). contains ("attach")
				&& ! file.getSubmittedFileName().isEmpty() ) {
		//파일명에 attach있고, 비어있지 않으면 (있으면)
			String filename = file.getSubmittedFileName();
			file.write(path + "/" +filename);
			list.add(filename);
			//파일 저장
		}
	}
	 //응답화면 연결
	response.setContentType("text/html; charset=utf-8");
	 PrintWriter out= response.getWriter();
	 out.print("<html><body>");
	 out.print("<div><a href= './'>홈으로</a></div>");
	 out.print("<div><a href= './'>파일업로드</a></div>");
	 out.print("<h2>업로드 정보</h2>");
	 out.printf("이름 : %s", name);
	 for(String filename : list) {
		 out.printf("<div>파일명 :<a href ='download?filename=%s'>%s</a></div>"
				 , filename, filename);
		 
	 }
	  
	out.print("</html></body>");
	} 
	
}
