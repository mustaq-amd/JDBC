package com.masai.app.usecases;

import java.util.Scanner;

import com.masai.app.bean.Employee;
import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;
import com.masai.app.exception.EmployeeException;

public class FetchEmployeeByEmpId {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please Enter Employee ID");
		int empId =	scn.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		try {
			Employee employee=dao.getEmployeeById(empId);
			
			System.out.println("Employee ID is : "+employee.getEmpId());
			System.out.println("Employee Name is : "+employee.getName());
			System.out.println("Employee Address is : "+employee.getAddress());
			System.out.println("Employee Salary is : "+employee.getSalary());
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
