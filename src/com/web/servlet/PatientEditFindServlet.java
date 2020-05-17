package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Medicine;
import com.model.Patient;
import com.service.MedicineServiceImpl;
import com.service.PatientServiceImpl;

@WebServlet("/PatientEditFindServlet")
public class PatientEditFindServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PatientServiceImpl patientService = new PatientServiceImpl();
		Patient patient = patientService.findThePatient(request.getParameter("patientName"),request.getSession().getAttribute("userID").toString());
		
		request.setAttribute("patient", patient);

		request.setAttribute("patientSex", patient.getPatientSex());
		request.setAttribute("patientBloodType", patient.getPatientBloodType());
		request.getRequestDispatcher("/admin/patients/edit.jsp").forward(request, response);
	}

}
