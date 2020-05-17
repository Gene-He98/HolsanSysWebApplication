package com.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.model.User;
import com.utils.C3P0Utils;

public class UserDaoImpl {
	
	public User checkUser(String userName, String userPass) throws SQLException{
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		Object[] param={userName , userName, userPass};
		return qr.query("select * from Tab_User where ( UserID= ? OR UserName= ? ) and Password= ?", new BeanHandler<User>(User.class), param);
	}
	
}
