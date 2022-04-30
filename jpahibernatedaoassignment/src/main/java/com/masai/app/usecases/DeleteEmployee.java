package com.masai.app.usecases;

import java.util.Scanner;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;

public class DeleteEmployee {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Please Enter Employee ID");
		int empId=scn.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		boolean result=	dao.deleteEmployee(empId);
		
		if(result) {
			System.out.println("Employee deleted Successfully...");
		}
		else {
			System.out.println("Employee does not exist");
		}
		

	}

}
