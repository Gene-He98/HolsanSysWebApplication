package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.DrugRecord;
import com.model.Patient;
import com.service.PatientServiceImpl;

@WebServlet("/DrugRecordFindServlet")
public class DrugRecordFindServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PatientServiceImpl patientService = new PatientServiceImpl();
		List<DrugRecord> drugRecords = patientService.findRecords(request.getParameter("patientName").toString()
				,request.getSession().getAttribute("userID").toString());
		System.out.println(request.getParameter("patientName").toString()+request.getSession().getAttribute("userID").toString());
		request.setAttribute("drugRecords", drugRecords);
		request.setAttribute("patientName",request.getParameter("patientName"));
		request.getRequestDispatcher("/admin/patients/record.jsp").forward(request, response);
	}

}
