package com.service;

import java.sql.SQLException;
import com.dao.UserDaoImpl;
import com.model.User;

public class UserServiceImpl {
	public User checkUser(String userName, String userPass){
		
		UserDaoImpl userDao = new UserDaoImpl();
		try {
			return  userDao.checkUser(userName,userPass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
