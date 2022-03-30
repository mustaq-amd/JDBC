package com.masai.app.dao;

import java.util.List;

import com.masai.app.exceptions.EmployeeException;
import com.masai.app.model.Employee;

public interface EmployeeDao {
	
	public Employee getEmployeeById(int empId)throws EmployeeException;

	public List<Employee> getAllEmployee();

	public String saveEmployeeDetails(Employee employee);

	public boolean deleteEmployeeById(int empId)throws EmployeeException;

	public String giveBonusToEmployee(int empId, int amount)throws EmployeeException;

}
