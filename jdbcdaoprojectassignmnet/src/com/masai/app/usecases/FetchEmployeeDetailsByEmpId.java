package com.masai.app.usecases;

import java.util.Scanner;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;
import com.masai.app.exceptions.EmployeeException;
import com.masai.app.model.Employee;

public class FetchEmployeeDetailsByEmpId {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Please Enter EmpId");
		int eid=scn.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		try {
			
			Employee employee=dao.getEmployeeById(eid);
			
			System.out.println("Employee ID : "+employee.getEmpId());
			System.out.println("Employee Name : "+employee.getName());
			System.out.println("Employee Address : "+employee.getAddress());
			System.out.println("Employee Salary : "+employee.getSalary());
			
			
		} catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
		}

	}

}
