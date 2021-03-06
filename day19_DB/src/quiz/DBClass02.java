package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import day19_DB.StudentDTO;

public class DBClass02 {
	private String url;
	private String id;
	private String pwd;
	private Connection con;

	// DBClass 생성자
	public DBClass02() {
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

	MemberInfo02 mi02;
	PreparedStatement ps;
	ResultSet rs;
	String sql = null;
	int result;
	
	public ArrayList<MemberInfo02> getMembers() {
		ArrayList<MemberInfo02> list = new ArrayList<MemberInfo02>();
		sql = "select * from member";
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				MemberInfo02 mi02 = new MemberInfo02();
				mi02.setMemId(rs.getString("id"));
				mi02.setMemName(rs.getString("name"));
				mi02.setMemGender(rs.getString("gender"));
				mi02.setMemAge(rs.getInt("age"));
				mi02.setMemAddr(rs.getString("Addr"));
				list.add(mi02);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int save(String memId, String memName, String memGender, int memAge, String memAddr) {
		sql = "insert into member values(?, ?, ?, ?, ?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, memId);
			ps.setString(2, memName);
			ps.setString(3, memGender);
			ps.setInt(4, memAge);
			ps.setString(5, memAddr);
			result = ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int modify(String memId, String memName, String memGender, int memAge, String memAddr) {
		sql = "update member set id = ?, name = ?, gender = ?, age = ?, addr = ? where id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, memId);
			ps.setString(2, memName);
			ps.setString(3, memGender);
			ps.setInt(4, memAge);
			ps.setString(5, memAddr);
			ps.setString(6, memId);
			result = ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int delete(String memId) {
		sql = "delete from member where id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, memId);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
