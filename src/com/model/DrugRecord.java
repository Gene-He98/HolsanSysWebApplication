package com.model;

import java.sql.Date;

public class DrugRecord {
	private Date drugTime;
	private String notificationName;
	private String ifDrug;
	
	public Date getDrugTime() {
		return drugTime;
	}
	
	public void setDrugTime(Date drugTime) {
		this.drugTime = drugTime;
	}
	
	public String getNotificationName() {
		return notificationName;
	}
	
	public void setNotificationName(String notificationName) {
		this.notificationName = notificationName;
	}
	
	public String getIfDrug() {
		return ifDrug;
	}
	
	public void setIfDrug(String ifDrug) {
		this.ifDrug = ifDrug;
	}
	
	@Override
	public String toString() {
		return "DrugRecord [drugTime=" + drugTime 
				+ ", notificationName=" + notificationName 
				+ ", ifDrug=" + ifDrug 
				+ "]";
	}
}
