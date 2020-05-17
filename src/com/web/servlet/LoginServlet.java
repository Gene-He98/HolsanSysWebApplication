package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Tools.MD5;
import com.model.Medicine;
import com.model.User;
import com.service.MedicineServiceImpl;
import com.service.UserServiceImpl;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userPass=(new MD5()).EncryptToMD5(request.getParameter("UserPass"));
		UserServiceImpl userService = new UserServiceImpl();
		User user = userService.checkUser(request.getParameter("UserName"),userPass);
		
		if(user!=null){
			
			request.getSession().setAttribute("userID", user.getUserID());
			request.getSession().setAttribute("userName", user.getUserName());
			request.getRequestDispatcher("/admin/login/home.jsp").forward(request, response);
			
		}else{
			request.getSession().setAttribute("mes", "登录失败，用户名或密码错误！请输入正确的用户名密码！");
			request.getRequestDispatcher("/admin/login/login.jsp").forward(request, response);
		}
		
	}

}
