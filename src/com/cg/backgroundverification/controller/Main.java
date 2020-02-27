package com.cg.backgroundverification.controller;

import java.util.Scanner;

public class Main {
public static void main(String[] args) throws Exception {
	while(true)
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("PRESS : 1 > EMPLOYEE");
		System.out.println("PRESS : 2 > BCG TEAM");
		System.out.println("PRESS : 3 > FOR EXIT");
		System.out.println("Enter tour choice");
		int ch=ss.nextInt();
		switch (ch) {
		case 1:
			Employee.main(null);
			break;
//		case 2:
//			BCGTeam.main(null);
//			break;
		case 2:
			System.out.println("!!!THANK YOU FOR USING MY APPLICATION");
			System.exit(0);
		default:
			System.out.println("invalid key");
		}
	}
}
}
