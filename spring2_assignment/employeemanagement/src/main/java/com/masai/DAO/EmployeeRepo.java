package com.masai.DAO;

import java.util.List;

import com.masai.beans.Employee;

public interface EmployeeRepo {
	
	public boolean insertEmployeeDetails(Employee emp);
	public List<Employee> getAllEmployeeDetails();
	public Employee findEmployee(int empId);
	public String deleteEmployeeDetailsById(int empId);

	
	

}
