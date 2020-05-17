package com.model;

import java.sql.Date;

public class Patient {
	private String patientName;
	private String patientAge;
	private String patientSex;
	private String patientAddress;
	private String patientBloodType;
	private String patientMedicalHistory;
	private String patientAllergy;
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}
	public String getPatientSex() {
		return patientSex;
	}
	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}
	public String getpatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getPatientBloodType() {
		return patientBloodType;
	}
	public void setPatientBloodType(String patientBloodType) {
		this.patientBloodType = patientBloodType;
	}
	public String getPatientMedicalHistory() {
		return patientMedicalHistory;
	}
	public void setPatientMedicalHistory(String patientMedicalHistory) {
		this.patientMedicalHistory = patientMedicalHistory;
	}
	public String getPatientAllergy() {
		return patientAllergy;
	}
	public void setPatientAllergy(String patientAllergy) {
		this.patientAllergy = patientAllergy;
	}
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName 
				+ ", patientAge=" + patientAge 
				+ ", patientSex=" + patientSex + ", patientAddress=" + patientAddress 
				+ ", patientBlood=" + patientBloodType
				+ ", patientMedicalHistory=" + patientMedicalHistory
				+ ", patientAllergy=" + patientAllergy+ "]";
	}
}
