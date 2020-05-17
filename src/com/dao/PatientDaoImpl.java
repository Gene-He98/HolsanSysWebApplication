package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.model.DrugRecord;
import com.model.Medicine;
import com.model.Patient;
import com.utils.C3P0Utils;

public class PatientDaoImpl {
	public List<Patient> findAllPatients(String userID) throws SQLException{
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		return qr.query("select * from Tab_Patient where UserID = ?", new BeanListHandler<Patient>(Patient.class),userID);
	}
	
	public void addPatient(Patient patient, String userID) throws SQLException{
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		Object[] params = { patient.getPatientName(),patient.getPatientAge()
				, patient.getPatientSex(),patient.getpatientAddress(),patient.getPatientBloodType()
				,patient.getPatientMedicalHistory(),patient.getPatientAllergy(),userID};
		qr.update("insert into Tab_Patient (PatientName,PatientAge,PatientSex,patientAddress"
				+ ",PatientBloodType,PatientMedicalHistory,PatientAllergy,UserID) values (?,?,?,?,?,?,?,?)",params);
	}

	public Patient findThePatient(String patientName, String userID) throws SQLException{
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		Object[] params = { patientName,userID};
		return qr.query("select * from Tab_Patient where PatientName = ? and UserID = ? ",new BeanHandler<Patient>(Patient.class),params );
	}

	public void editPatient(Patient patient , String userID) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		Object[] params = {patient.getPatientAge(), patient.getPatientSex(),patient.getpatientAddress(),patient.getPatientBloodType()
				,patient.getPatientMedicalHistory(),patient.getPatientAllergy(), patient.getPatientName(),userID};
		qr.update("update Tab_Patient set PatientAge=?, PatientSex=?, patientAddress=?"
				+ ", PatientBloodType=?, PatientMedicalHistory=?, PatientAllergy=? where PatientName=? and UserID=?",params);
	}

	public void deletePatient(String patientName,String userID) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		Object[] params = { patientName,userID};
		qr.update("delete from Tab_Patient where PatientName=? and UserID = ? ",params);
	}
	
	public List<DrugRecord> findRecords(String patientName,String userID) throws SQLException{
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		Object[] params = { patientName,userID};
		return qr.query("select DrugTime,NotificationName,IfDrug from Tab_DrugRecord where PatientName=? and UserID = ? order by DrugTime desc"
				, new BeanListHandler<DrugRecord>(DrugRecord.class),params);
	}
}
