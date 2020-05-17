package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.MedicineServiceImpl;

@WebServlet("/MedicineDeleteServlet")
public class MedicineDeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MedicineServiceImpl medicineService = new MedicineServiceImpl();
		medicineService.deleteMedicine(request.getParameter("medicineName"),request.getSession().getAttribute("userID").toString());
		
		request.getRequestDispatcher("/MedicineListServlet").forward(request, response);
	}

}