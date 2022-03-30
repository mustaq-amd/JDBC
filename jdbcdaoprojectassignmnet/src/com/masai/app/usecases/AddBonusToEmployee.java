package com.masai.app.usecases;

import java.util.Scanner;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;
import com.masai.app.exceptions.EmployeeException;

public class AddBonusToEmployee {
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Please Enter EmpId");
		int eid=scn.nextInt();
		
		System.out.println("Please Enter Bonus Amount");
		int amount=scn.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		try {
			String result=dao.giveBonusToEmployee(eid, amount);
			System.out.println(result);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}

}
