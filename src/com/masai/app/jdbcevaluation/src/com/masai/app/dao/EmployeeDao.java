package com.masai.app.dao;

import java.util.List;

import com.masai.app.bean.Employee;
import com.masai.app.exception.EmployeeException;

public interface EmployeeDao {
	
	public String saveEmployeeDetails(Employee employee);

	public Employee getEmployeeById(int empId) throws EmployeeException;

	public List<Employee> getAllEmployees();

	public String deleteEmployee(int empId) throws EmployeeException;

}
