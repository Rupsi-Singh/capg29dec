package com.cg.cms.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cg.cms.dao.UserDAO;
import com.cg.cms.domain.User;
import com.cg.cms.util.DBUtil;

public class UserDAOImpl extends DBUtil implements UserDAO {

	@Override
	public void save(User user) {
		String sql = "INSERT INTO public.users(name, contact, email, loginname, pwd, status, role) 	VALUES (?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = prepareStatement(sql);
		try {
			
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getContact());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getLoginname());
			pstmt.setString(5, user.getPwd());
			pstmt.setInt(6, user.getStatus());
			pstmt.setInt(7, user.getRole());
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> findAll() {
		List<User> users =new ArrayList<>();
		String sql = "Select * from users";
		PreparedStatement pstmt = prepareStatement(sql);
		try {
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				//map each field with user field. 
				
				User user=new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setContact(rs.getString("contact"));
				user.setEmail(rs.getString("email"));
				user.setLoginname(rs.getString("loginname"));
				user.setPwd(rs.getString("pwd"));
				user.setRole(rs.getInt("role"));
				user.setStatus(rs.getInt("status"));
				users.add(user);
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

}
