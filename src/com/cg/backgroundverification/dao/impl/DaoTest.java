package com.cg.backgroundverification.dao.impl;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.backgroundverification.dao.EmployeeDocumentDao;
import com.cg.backgroundverification.dto.EmployeeDocumentDto;

public class DaoTest implements EmployeeDocumentDao {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
		
	@Test
	public void viewstatustest(EmployeeDocumentDto e) {
		EmployeeDocumentDto ed = new EmployeeDocumentDto();
	}

	@Override
	public void uploadDocument(EmployeeDocumentDto e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewstatus(EmployeeDocumentDto e) {
		// TODO Auto-generated method stub
		
	}

}
