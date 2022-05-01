package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.DAO.EmployeeRepoImpl;
import com.masai.beans.Employee;
import com.masai.exception.EmployeeException;


@Service(value = "empservice")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepoImpl employeeRepoImpl;

	@Override
	public boolean saveEmployee(Employee emp) {
		return employeeRepoImpl.insertEmployeeDetails(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepoImpl.getAllEmployeeDetails();
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		
		return employeeRepoImpl.findEmployee(empId);
	}

	@Override
	public String deleteEmployeeById(int empId) throws EmployeeException {
		
		return employeeRepoImpl.deleteEmployeeDetailsById(empId);
	}

}
