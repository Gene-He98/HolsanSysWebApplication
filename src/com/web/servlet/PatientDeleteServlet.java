package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.MedicineServiceImpl;
import com.service.PatientServiceImpl;

@WebServlet("/PatientDeleteServlet")
public class PatientDeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PatientServiceImpl patientService = new PatientServiceImpl();
		patientService.deletePatient(request.getParameter("patientName"),request.getSession().getAttribute("userID").toString());
		request.getRequestDispatcher("/PatientListServlet").forward(request, response);
	}

}
