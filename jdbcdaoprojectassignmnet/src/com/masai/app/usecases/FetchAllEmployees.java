package com.masai.app.usecases;

import java.util.List;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;
import com.masai.app.model.Employee;

public class FetchAllEmployees {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		List<Employee> employees = dao.getAllEmployee();
		
		employees.forEach(employee->{
			
			System.out.println("Employee ID : "+employee.getEmpId());
			System.out.println("Employee Name : "+employee.getName());
			System.out.println("Employee Address : "+employee.getAddress());
			System.out.println("Employee Salary : "+employee.getSalary());
			
			System.out.println("===============================");
			
		});

	}

}
