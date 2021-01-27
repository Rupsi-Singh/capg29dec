package com.cg.cms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

/**
 * This DBUtil will perform common database operations like  : register driver, getting connection object and getting prepared statement object
 * @author panka
 *
 */
public class DBUtil {
	private static Logger logger = Logger.getLogger(DBUtil.class);
	private Connection con=null;
	private PreparedStatement pstmt = null;
	private static String driverClassName = "org.postgresql.Driver";
	private String url = "jdbc:postgresql://localhost/cmsdb";
	private String user = "postgres";
	private String password = "admin";
	
	static {
		try {
			Class c = Class.forName(driverClassName);
			logger.info(c);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}
	private Connection connect() {
		
		try {
			con = DriverManager.getConnection(url, user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public PreparedStatement prepareStatement(String sql) {
		try {
			pstmt = connect().prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}

}
