package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.utils.C3P0Utils;
import com.model.Medicine;

public class MedicineDaoImpl {

	public List<Medicine> findAllMedicines(String userID) throws SQLException{
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		return qr.query("select * from Tab_Medicine where UserId = ?", new BeanListHandler<Medicine>(Medicine.class),userID);
	}
	
	public void addMedicine(Medicine medicine, String userID) throws SQLException{
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		Object[] params = { medicine.getMedicineName(),medicine.getMedicineAnotherName()
				, medicine.getUsage(),medicine.getDosage(),medicine.getCautions()
				,medicine.getValidity(),userID};
		qr.update("insert into Tab_Medicine (MedicineName,MedicineAnotherName,Usage,Dosage,Cautions,Validity,UserID) values (?,?,?,?,?,?,?)",params);
	}

	public Medicine findTheMedicine(String medicineName, String userID) throws SQLException{
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		Object[] params = { medicineName,userID};
		return qr.query("select * from Tab_Medicine where MedicineName = ? and UserID = ? ",new BeanHandler<Medicine>(Medicine.class),params );
	}

	public void editMedicine(Medicine medicine , String userID) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		Object[] params = { medicine.getMedicineAnotherName()
				, medicine.getUsage(),medicine.getDosage(),medicine.getCautions()
				,medicine.getValidity(),medicine.getMedicineName() ,userID};
		qr.update("update Tab_Medicine set MedicineAnotherName=?, Usage=?, Dosage=?, Cautions=?, Validity=? where MedicineName=? and UserId=?",params);
	}

	public void deleteMedicine(String medicineName,String userID) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		Object[] params = { medicineName,userID};
		qr.update("delete from Tab_Medicine where MedicineName=? and UserID = ? ",params);
	}
	
}
