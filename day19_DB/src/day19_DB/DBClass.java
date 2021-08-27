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
	
	public DBClass() { // DBClass ������
		try {
			// �ڹٿ��� ����Ŭ�� ������ �� �ְԲ� �����ִ� ���̺귯���� ����ϴ� ��
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
	 * 1. driver load(����Ŭ ��� ���)
	 * 2. ����� ��ü�� ���´�.
	 * 3. ����� ��ü�� �̿��ؼ� ��ɾ�(������)�� ������ �� �ִ� ���� ��ü�� ���´�.
	 * 4. ���� ��ü�� �̿��ؼ� DB���� ���� �� ����� ���´�.
	 * 5. ���� ����� int �Ǵ� ResultSet���� �޴´�.
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
			// ���� ������ 1 ��ȯ, ���н� catch �̵��̳� 0 ��ȯ
			// select�� ����� executeQuery(); / �ٸ� ��ɾ�� Update();
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
