package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Medicine;
import com.model.Patient;
import com.service.MedicineServiceImpl;
import com.service.PatientServiceImpl;

@WebServlet("/PatientAddServlet")
public class PatientAddServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		Patient patient =new Patient();
		patient.setPatientName(request.getParameter("patientName"));
		patient.setPatientAge(request.getParameter("patientAge"));
		patient.setPatientSex(request.getParameter("patientSex"));
		patient.setPatientAddress(request.getParameter("patientAddress"));
		patient.setPatientBloodType(request.getParameter("patientBloodType"));
		patient.setPatientMedicalHistory(request.getParameter("patientMedicalHistory"));
		patient.setPatientAllergy(request.getParameter("patientAllergy"));
		
		PatientServiceImpl patientService = new PatientServiceImpl();
		patientService.addPatient(patient,request.getSession().getAttribute("userID").toString());
		request.getRequestDispatcher("/PatientListServlet").forward(request, response);
	}

}
