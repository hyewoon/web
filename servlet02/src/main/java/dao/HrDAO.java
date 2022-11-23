package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dto.DepartmentDTO;
import dto.EmployeeDTO;

public class HrDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	//사원 삭제 메소드
	public void employee_delete(int employee_id) {
	
	
		connect();
		
		String sql
		="delete from employees where employee_id = ?";
		
		try {
			ps= conn.prepareStatement(sql);
			ps.setInt(1, employee_id);
			ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			disconnect();
		}
	}
	
	//선택한 사원정보를 조회 메소드
	public EmployeeDTO employee_info(int employee_id) {
		EmployeeDTO dto= null;
		connect();
		String sql
		="select employee_id "
		+ "     ,last_name||' '||first_name name "
		+ "     ,department_id, job_id, salary, hire_date, email "
		+ "from employees where employee_id = ?";
		
		try {
			ps= conn.prepareStatement(sql);
			ps.setInt(1, employee_id);
			rs = ps.executeQuery();
			if(rs.next()) {
				dto=new EmployeeDTO();
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setName( rs.getString("name") );
				dto.setDepartment_id( rs.getInt("department_id") );
				dto.setJob_id( rs.getString("job_id") );
				dto.setSalary( rs.getInt("salary") );
				dto.setEmail( rs.getString("email") );
				dto.setHire_date( rs.getDate("hire_date") );
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			disconnect();
		}return dto;
	}
	
	//신규회원정보
	public void employee_insert(EmployeeDTO dto) {
		connect();
		String sql
		="insert into employees "
				+ "(employee_id, last_name, first_name, email "
				+ " ,department_id, job_id, salary, hire_date) "
				+ "values(employees_seq.nextval, ?, ?, ?, ?, ?, ?, sysdate)";		
		try {

			ps = conn.prepareStatement(sql);
			ps.setString(1,dto.getLast_name());
			ps.setString(2,dto.getFirst_name());
			ps.setString(3,dto.getEmail());
			ps.setInt(4, dto.getDepartment_id());
			ps.setString(5,dto.getJob_id());
			ps.setInt(6, dto.getSalary());
			ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("신규등록 오류");
			System.out.println(e.getMessage());
		}finally{
		 disconnect();
		}
	}
			
	//부서목록 조회 메소드
	public ArrayList<DepartmentDTO> department_list() {
		ArrayList<DepartmentDTO> list = new ArrayList<DepartmentDTO>();
		connect();
		
		//쿼리문 작성
		String sql
		="select distinct department_id "
		+ "  , nvl(department_name, '소속없음') department_name "
		+"from employees e left outer join departments d using(department_id) "
		+"order by department_id";
		
		try {
			ps = conn.prepareStatement(sql);
			//준비한 쿼리문 실행ctrl _enter
			rs= ps.executeQuery();
			while(rs.next()) { 
				DepartmentDTO dto= new DepartmentDTO();
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				list.add(dto);
			}
				
		} catch (Exception e) {
			System.out.println("부서목록 조회 오류");
			System.out.println(e.getMessage());
		}finally {
			disconnect();
		}
		return list;		
	}
	
	
	//사원목록 조회 메소드
	public ArrayList<EmployeeDTO> employee_list() {
		connect();
		
		ArrayList<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		String sql
		="select employee_id, last_name|| ' ' ||first_name name "
		+ "   ,salary, department_id, department_name, hire_date "
		+ "from employees e left outer join departments d using(department_id) "		
		+ "order by employee_id" ;
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				EmployeeDTO	 dto = new EmployeeDTO();
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setName(rs.getString("name") );
				dto.setSalary(rs.getInt("salary"));
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setHire_date(rs.getDate("hire_date"));
				list.add(dto);
					
			}
			
		} catch (Exception e) {
		
		}finally {
			disconnect();
		}
		return list;
	}
	
	//db연결 메소드
	private void connect() {
		try {
/*		Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
				, "hr","0000");
				
*/				
		Context initCtx = new InitialContext();
		DataSource ds = (DataSource) initCtx.lookup("java:comp/env/hr");
		conn = ds.getConnection();		
		} catch (Exception e) {}
	}
	
	
	
	//자원회수 처리 메소드
	private void disconnect(){
			if(rs!=null )try {rs.close();}catch(Exception e) {}
			if(ps!=null )try {ps.close();}catch(Exception e) {}
			if(conn!=null )try {conn.close();}catch(Exception e) {}			
	}
	
}
