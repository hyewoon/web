package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.UserDTO;
import mybatis.MybatisFactory;

public class UserDAO {
	private SqlSession sql;
	
	public List<UserDTO> select_user_list() {
		connect();
		 List<UserDTO> list = sql.selectList("user.user_list");
		return list;
	}
	
	
	
	//전체 사용자 조회 메소드
	public List<String> select_name_all() {
		connect();
		List<String> list = sql.selectList("user.name_all");
		return list;
	}
	
	//이름 조회해올 메소드 선언
	public String select_name(){
		connect();
		String name = sql.selectOne("user.select_name");
		return name;
	}
	
	//money 조회해 올 메소드 선언
	public int select_money() {
		connect();
		 int money = sql.selectOne("user.select_money");
		 return money;
	}
	
	//db연결
	void connect() {
		SqlSessionFactory factory = MybatisFactory.getInstance();
		sql = factory.openSession( true );
	}
	
}
