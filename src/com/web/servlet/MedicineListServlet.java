package com.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.MedicineServiceImpl;
import com.model.Medicine;


@WebServlet("/MedicineListServlet")
public class MedicineListServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request,response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//调用业务方法
		MedicineServiceImpl medicineService = new MedicineServiceImpl();
		List<Medicine> medicines = medicineService.findAllMedicines(request.getSession().getAttribute("userID").toString());
		
		//2.把数据放在请求对象中
		request.setAttribute("medicines", medicines);
		
		//3.进入admin/products/list.jsp
		request.getRequestDispatcher("/admin/medicines/list.jsp").forward(request, response);
	}

}
