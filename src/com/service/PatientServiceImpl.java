package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.MedicineDaoImpl;
import com.dao.PatientDaoImpl;
import com.model.DrugRecord;
import com.model.Medicine;
import com.model.Patient;

public class PatientServiceImpl {
	public List<Patient> findAllPatients(String userID){
		
		PatientDaoImpl patientDao = new PatientDaoImpl();
		try {
			return  patientDao.findAllPatients(userID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void addPatient(Patient patient,String userID){
		
		PatientDaoImpl patientDao = new PatientDaoImpl();
		
		try {
			patientDao.addPatient(patient,userID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Patient findThePatient(String patientName ,String userID) {
		PatientDaoImpl patientDao = new PatientDaoImpl();
		try {
			return  patientDao.findThePatient(patientName,userID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void editPatient(Patient patient,String userID) {
		PatientDaoImpl patientDao = new PatientDaoImpl();
		
		try {
			patientDao.editPatient(patient,userID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void deletePatient(String patientName,String userID) {
		PatientDaoImpl patientDao = new PatientDaoImpl();
		
		try {
			patientDao.deletePatient(patientName,userID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<DrugRecord> findRecords(String patientName,String userID) {
		PatientDaoImpl patientDao = new PatientDaoImpl();
		
		try {
			return patientDao.findRecords(patientName,userID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
