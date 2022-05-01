package com.masai.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.beans.Employee;
import com.masai.service.EmployeeService;
import com.masai.service.EmployeeServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext("AppConfig");
		
		EmployeeServiceImpl employeeService= ctx.getBean(EmployeeServiceImpl.class,"empservice");
		
		List<Employee> employees=employeeService.getAllEmployee();
		
		for (Employee employee : employees) {
			
			System.out.println(employee);
			
		}
		
		
	}

}
