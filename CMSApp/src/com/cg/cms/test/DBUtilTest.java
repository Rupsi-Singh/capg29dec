package com.cg.cms.test;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.cms.util.DBUtil;

public class DBUtilTest {

	public static void main(String[] args) {
		DBUtil dbUtil =  new DBUtil();
		String sql = "INSERT INTO users(id, name, contact, email, loginname, pwd, status, role) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = dbUtil.prepareStatement(sql);
		try {
			pstmt.setInt(1, 101);
			pstmt.setString(2, "pankaj");
			pstmt.setString(3, "8827611875");
			pstmt.setString(4, "pankajsimmc@gmail.com");
			pstmt.setString(5, "pankaj");
			pstmt.setString(6, "pan@123");
			pstmt.setInt(7, 1);
			pstmt.setInt(8, 1);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Success! Data Inserted. Check Database");

	}

}
