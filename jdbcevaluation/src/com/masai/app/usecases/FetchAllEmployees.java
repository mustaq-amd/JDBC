package com.masai.app.usecases;

import java.util.List;

import com.masai.app.bean.Employee;
import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;

public class FetchAllEmployees {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		List<Employee> list =dao.getAllEmployees();
		
		list.forEach(employee ->{
			
			System.out.println("Employee ID is : "+employee.getEmpId());
			System.out.println("Employee Name is : "+employee.getName());
			System.out.println("Employee Address is : "+employee.getAddress());
			System.out.println("Employee Salary is : "+employee.getSalary());
			
			System.out.println("=============================================");
		});

	}

}
