package com.cg.backgroundverification.dao.impl;

import java.util.*;

import org.apache.log4j.Logger;

import com.cg.backgroundverification.controller.Employee;
import com.cg.backgroundverification.dao.*;
import com.cg.backgroundverification.dto.*;

public class EmployeeDocumentDaoImpl implements EmployeeDocumentDao {
	private static Logger logger=Logger.getLogger(EmployeeDocumentDaoImpl.class);
	static List<EmployeeDocumentDto> l=new ArrayList<>();
	@Override
	public void uploadDocument(EmployeeDocumentDto e) {
		
		l.add(e);
		System.out.println("!!!!Register sucessfully!!!!");
	}

	@Override
	public void viewstatus(EmployeeDocumentDto e) 
	{
		
		String name=e.getEmpName();
		Iterator<EmployeeDocumentDto> ii=l.iterator();
		while(ii.hasNext())
		{
			EmployeeDocumentDto ed=ii.next();
			if(ed.getEmpName().equals(name))
			{
				System.out.println("Name : "+ed.getEmpName()+"\tEmpId : "+ed.getEmpId()+"\tStatus : "+ed.getStatus());
			}
		}
		EmployeeDocumentDto ed = new EmployeeDocumentDto();
		logger.info("Details: "+ed.getEmpName()+" "+ed.getEmpId()+" "+ed.getStatus());
	}

	
	}


