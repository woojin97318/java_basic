package day19_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBClass {
	private String url;
	private String id;
	private String pwd;
	private Connection con;
	
	public DBClass() { // DBClass 생성자
		try {
			// 자바에서 오라클에 연결할 수 있게끔 도와주는 라이브러리를 등록하는 것
			Class.forName("oracle.jdbc.driver.OracleDriver");
			url = "jdbc:oracle:thin:@localhost:1521:xe";
			id = "wujin";
			pwd = "wujin";
			con = DriverManager.getConnection(url, id, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 1. driver load(오라클 기능 사용)
	 * 2. 연결된 객체를 얻어온다.
	 * 3. 연결된 객체를 이용해서 명령어(쿼리문)을 전송할 수 있는 전송 객체를 얻어온다.
	 * 4. 전송 객체를 이용해서 DB에서 전송 후 결과를 얻어온다.
	 * 5. 얻어온 결과는 int 또는 ResultSet으로 받는다.
	 */
	public ArrayList<StudentDTO> getUsers() {
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		String sql = "select * from newst";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				StudentDTO dto = new StudentDTO();
				dto.setStNum(rs.getString("id"));
				dto.setStName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int saveData(String stNum, String stName, int age) {
		String sql = "insert into newst values(?, ?, ?)";
		PreparedStatement ps;
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, stNum);
			ps.setString(2, stName);
			ps.setInt(3, age);
			// ResultSet rs = ps.executeQuery();
			// 저장 성공시 1 반환, 실패시 catch 이동이나 0 반환
			// select문 실행시 executeQuery(); / 다른 명령어는 Update();
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int delete(String userNum) {
		String sql = "delete from newst where id = ?";
		PreparedStatement ps;
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, userNum);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int moidfy(String stNum1, String name1, int age1) {
		int result = 0;
		String sql = "update newst set name = ?, age = ? where id = ?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, name1);
			ps.setInt(2, age1);
			ps.setString(3, stNum1);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
