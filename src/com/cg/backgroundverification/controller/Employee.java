package com.cg.backgroundverification.controller;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.cg.backgroundverification.dao.impl.EmployeeDocumentDaoImpl;
import com.cg.backgroundverification.dto.EmployeeDocumentDto;
import com.cg.backgroundverification.service.EmployeeService;
import com.cg.backgroundverification.service.impl.EmployeeServiceImpl;

public class Employee 
{
	
	public static void main(String[] args) throws Exception 
	{
		Logger logger=Logger.getLogger(EmployeeDocumentDaoImpl.class);
		EmployeeService e=new EmployeeServiceImpl();
		while(true)
		{
		System.out.println("\tMENU\n========================");
		System.out.println("PRESS 1 : > FOR EMPLOYEE REGISTRATION");
		System.out.println("PRESS 2 : > VIEW EMPLOYEE STATUS");
		System.out.println("PRESS 3 : > FOR BACK");
		System.out.println("PRESS 4 : > FOR EXIT");
		System.out.println("Enter your choice");
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		
		switch(n)
		{
		case 1 :
			e.uploadDocument();
			break;
		case 2:
			e.viewstatus();
			break;
		case 3 : 
			return;
		case 4:
			System.out.println(" THANK YOU ");
			System.exit(0);
		default:
			System.out.println("invalid key");
		}
	}
	
	}
}
