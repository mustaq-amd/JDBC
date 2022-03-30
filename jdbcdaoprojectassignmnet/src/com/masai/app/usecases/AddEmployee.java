package com.masai.app.usecases;

import java.util.Scanner;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;
import com.masai.app.model.Employee;

public class AddEmployee {
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Please Enter EmpId");
		int eid=scn.nextInt();
		
		System.out.println("Please Enter Name");
		String name=scn.next();
		
		System.out.println("Please Enter City Name");
		String address=scn.next();
		
		System.out.println("Please Enter Salary");
		int salary=scn.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		Employee employee=new Employee(eid,name,address,salary);
		
		String result=dao.saveEmployeeDetails(employee);
		
		System.out.println(result);
	}

}
