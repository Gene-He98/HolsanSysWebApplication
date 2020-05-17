package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Medicine;
import com.service.MedicineServiceImpl;

@WebServlet("/MedicineEditUpdateServlet")
public class MedicineEditUpdateServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Medicine medicine =new Medicine();
		medicine.setMedicineName(request.getParameter("medicineName"));
		medicine.setMedicineAnotherName(request.getParameter("medicineAnotherName"));
		medicine.setUsage(request.getParameter("usage"));
		medicine.setDosage(request.getParameter("dosage"));
		medicine.setCautions(request.getParameter("cautions"));
		SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd" ); 
		Date validity;
		try {
			validity = new Date(sdf.parse(request.getParameter("validity")).getTime());
			medicine.setValidity(validity);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		MedicineServiceImpl medicineService = new MedicineServiceImpl();
		medicineService.editMedicine(medicine,request.getSession().getAttribute("userID").toString());
		request.getRequestDispatcher("/MedicineListServlet").forward(request, response);
	}
	

}
