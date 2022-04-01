package com.masai.app.usecases;

import java.util.Scanner;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;
import com.masai.app.exception.EmployeeException;

public class DeleteEmployeeByEmpId {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please Enter Employee ID");
		int empId =	scn.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		try {
			
			String result=dao.deleteEmployee(empId);
			System.out.println(result);
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
