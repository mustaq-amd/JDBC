package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.beans.Employee;
import com.masai.exception.EmployeeException;


public interface EmployeeService {
	
	public boolean saveEmployee(Employee emp);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int empId)throws EmployeeException;
	public String deleteEmployeeById(int empId)throws EmployeeException;


}
