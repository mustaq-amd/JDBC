package com.masai.app.usecases;

import java.util.Scanner;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;
import com.masai.app.exceptions.EmployeeException;

public class DeleteEmployeeByEmpId {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Please Enter EmpId");
		int eid=scn.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		try {
			boolean result=dao.deleteEmployeeById(eid);
			if(result)
				System.out.println("Deleted Successfully");
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
