package com.cg.backgroundverification.service.impl;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

import com.cg.backgroundverification.dao.EmployeeDocumentDao;
import com.cg.backgroundverification.dao.impl.EmployeeDocumentDaoImpl;
import com.cg.backgroundverification.dto.EmployeeDocumentDto;
import com.cg.backgroundverification.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	

	@Override
	public void viewstatus() throws Exception {
		// TODO Auto-generated method stub
		DataInputStream ss=new DataInputStream(System.in);
		EmployeeDocumentDto emp=new EmployeeDocumentDto();
		System.out.println("Enter emp name");
		emp.setEmpName(ss.readLine());
		EmployeeDocumentDao e=new EmployeeDocumentDaoImpl();
		e.viewstatus(emp);
	}

	@Override
	public void uploadDocument() throws Exception {
		// TODO Auto-generated method stub
		DataInputStream ss=new DataInputStream(System.in);
		EmployeeDocumentDto emp=new EmployeeDocumentDto();
		System.out.println("Enter emp Id");
		emp.setEmpId(Integer.parseInt(ss.readLine()));
		System.out.println("Enter emp name");
		emp.setEmpName(ss.readLine());
		EmployeeDocumentDao e=new EmployeeDocumentDaoImpl();
		e.uploadDocument(emp);
	}

	

}
