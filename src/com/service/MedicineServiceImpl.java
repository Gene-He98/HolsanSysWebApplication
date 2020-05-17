
package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.MedicineDaoImpl;
import com.model.Medicine;

public class MedicineServiceImpl {

	public List<Medicine> findAllMedicines(String userID){
		
		//1.创建dao对象
		MedicineDaoImpl medicineDao = new MedicineDaoImpl();
		
		//2.调用findAllBook的方法
		try {
			return  medicineDao.findAllMedicines(userID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void addMedicine(Medicine medicine,String userID){
		
		//1.创建dao对象
		MedicineDaoImpl medicineDao = new MedicineDaoImpl();
		
		try {
			medicineDao.addMedicine(medicine,userID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Medicine findTheMedicines(String medicineName ,String userID) {
		//1.创建dao对象
		MedicineDaoImpl medicineDao = new MedicineDaoImpl();
		
		//2.调用findAllBook的方法
		try {
			return  medicineDao.findTheMedicine(medicineName,userID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void editMedicine(Medicine medicine,String userID) {
		//1.创建dao对象
		MedicineDaoImpl medicineDao = new MedicineDaoImpl();
		
		try {
			medicineDao.editMedicine(medicine,userID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void deleteMedicine(String medicineName,String userID) {
		// TODO Auto-generated method stub
		MedicineDaoImpl medicineDao = new MedicineDaoImpl();
		
		try {
			medicineDao.deleteMedicine(medicineName,userID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
