package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Userdao {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "1234");
		} catch (Exception e) {
			System.out.println(e);
		}
		return conn;
	}

	public int adduser(User u) {
		int status = 0;
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn
					.prepareStatement("insert into usertable(UserName,EmailId,DOB,Age,Password) values(?,?,?,?,?)");
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getEmailId());
			ps.setString(3, u.getDob());
			ps.setInt(4, u.getAge());
			ps.setString(5, u.getPassword());
			status = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return status;
	}

	public boolean validate(User u) {
		boolean status = false;
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from usertable where UserName=? and Password=?");
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getPassword());
			ResultSet rs = ps.executeQuery();
			status = rs.next();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return status;

	}

	public static List<User> getAllrecords() {
		List<User> list = new ArrayList<User>();
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from usertable");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User u = new User();
				u.setUserName(rs.getString("UserName"));
				u.setEmailId(rs.getString("EmailId"));
				u.setDob(rs.getString("DOB"));
				u.setAge(rs.getInt("Age"));
				u.setPassword(rs.getString("Password"));
				u.setUserId(rs.getInt(1));
				list.add(u);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;

	}

	public static int update(User u) {
		int status = 0;
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(
					"update usertable set UserName=?,EmailId=?,Dob=?,Age=?,Password=? where Userid=?");
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getEmailId());
			ps.setString(3, u.getDob());
			ps.setInt(4, u.getAge());
			ps.setString(5, u.getPassword());
			ps.setInt(6, u.getUserId());
			status = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return status;

	}

	public static int delete(int id) {
		int status = 0;
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("Delete from usertable where Userid=?");
			ps.setInt(1, id);
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static User getRecordById(int Userid) {
		User u = null;
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from usertable where Userid=?");
			ps.setInt(1, Userid);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u = new User();
				u.setUserName(rs.getString("UserName"));
				u.setEmailId(rs.getString("EmailId"));
				u.setDob(rs.getString("DOB"));
				u.setAge(rs.getInt("Age"));
				u.setPassword(rs.getString("Password"));
				u.setUserId(rs.getInt(1));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return u;

	}
}
