package com.masai.app.usecases;

import java.util.Scanner;

import com.masai.app.bean.Employee;
import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;

public class AddEmployeeDetails {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please Enter Employee ID");
		int empId =	scn.nextInt();
		
		System.out.println("Please Enter Employee Name");
		String name = scn.next();
		
		System.out.println("Please Enter Employee Address");
		String address = scn.next();
		
		System.out.println("Please Enter Employee Salary");
		int salary = scn.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		Employee employee=new Employee(empId,name,address,salary);
		
		
		String result=dao.saveEmployeeDetails(employee);
		System.out.println(result);

	}

}
