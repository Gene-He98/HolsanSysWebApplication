package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Medicine;
import com.service.MedicineServiceImpl;

@WebServlet("/MedicineEditFindServlet")
public class MedicineEditFindServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//调用业务方法
		MedicineServiceImpl medicineService = new MedicineServiceImpl();
		Medicine medicine = medicineService.findTheMedicines(request.getParameter("medicineName"),request.getSession().getAttribute("userID").toString());
		
		//2.把数据放在请求对象中
		request.setAttribute("medicine", medicine);
		
		//3.进入admin/products/list.jsp
		request.getRequestDispatcher("/admin/medicines/edit.jsp").forward(request, response);
	}

}
