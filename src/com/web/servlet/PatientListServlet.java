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
import com.model.Patient;
import com.service.MedicineServiceImpl;
import com.service.PatientServiceImpl;

@WebServlet("/PatientListServlet")
public class PatientListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PatientServiceImpl patientService = new PatientServiceImpl();
		List<Patient> patients = patientService.findAllPatients(request.getSession().getAttribute("userID").toString());
		
		request.setAttribute("patients", patients);
		
		request.getRequestDispatcher("/admin/patients/list.jsp").forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request,response);
	}

}
