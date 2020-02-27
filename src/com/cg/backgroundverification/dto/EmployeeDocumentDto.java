package com.cg.backgroundverification.dto;

import com.cg.backgroundverification.dao.impl.EmployeeDocumentDaoImpl;

public class EmployeeDocumentDto {
	private int empId;
	private String empName;
	private String status="not verify";
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}
