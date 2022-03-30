package com.masai.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.app.dao.utility.DBUtil;
import com.masai.app.exceptions.EmployeeException;
import com.masai.app.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		
		Employee employee=null;
		
		try(Connection conn=DBUtil.provideConnection()) {
			
			String query="select * from employee where eid=?";
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setInt(1, empId);
			
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			
			int eid=rs.getInt(1);
			String name=rs.getString(2);
			String address=rs.getString(3);
			int salary=rs.getInt(4);
			
			employee=new Employee();
			
			employee.setEmpId(eid);
			employee.setName(name);
			employee.setAddress(address);
			employee.setSalary(salary);
				
		}else {
			throw new EmployeeException("Employee doesn't exist with empId :"+empId);
		}
			
			
			
		} catch (Exception e) {
			throw new EmployeeException("Employee doesn't exist with empId :"+empId);
		}
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee> employees=new ArrayList<>();
		
		try(Connection conn=DBUtil.provideConnection()) {
			
			String query="select * from employee";
			
			PreparedStatement ps = conn.prepareStatement(query);
		
			ResultSet rs = ps.executeQuery();
		
			while(rs.next()) {
			
				int eid=rs.getInt(1);
				String name=rs.getString(2);
				String address=rs.getString(3);
				int salary=rs.getInt(4);
				
				Employee employee=new Employee();
				
				employee.setEmpId(eid);
				employee.setName(name);
				employee.setAddress(address);
				employee.setSalary(salary);
				
				employees.add(employee);
				
			}
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return employees;
	}

	@Override
	public String saveEmployeeDetails(Employee employee) {
		
		String message="Employee not added";
		
		
		try(Connection conn=DBUtil.provideConnection()) {
			
		String query="insert into employee values(?,?,?,?)";
				
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setInt(1, employee.getEmpId());
		ps.setString(2, employee.getName());
		ps.setString(3, employee.getAddress());
		ps.setInt(4, employee.getSalary());
		
		int result = ps.executeUpdate();
		
		if(result>0) {
			
			message="Employee added Successfully";
			
		}
		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return message;
	}

	@Override
	public boolean deleteEmployeeById(int empId) throws EmployeeException {
		
		boolean flag=false;
		

		try(Connection conn=DBUtil.provideConnection()) {
			
		String query="delete from employee where eid=?";
				
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setInt(1, empId);
		
		int result = ps.executeUpdate();
		
		if(result>0) 	
			flag=true;
		else
			throw new EmployeeException("Employee doesn't exist with empID :"+empId);
		
		} catch (SQLException e) {
			throw new EmployeeException("Employee doesn't exist with empID :"+empId);
		}
		
		
		
		return flag;
	}

	@Override
	public String giveBonusToEmployee(int empId, int amount) throws EmployeeException {
		
		String message="Bonus Not added";
		
		try(Connection conn=DBUtil.provideConnection()) {
			
			String query="update employee set salary=salary+? where eid=?";
					
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setInt(1, amount);
			ps.setInt(2, empId);
			
			int result = ps.executeUpdate();
			
			if(result>0) 	
				message="Bonus Added Successfully...";
			else
				throw new EmployeeException("Employee doesn't exist with empID :"+empId);
			
			} catch (SQLException e) {
				throw new EmployeeException("Employee doesn't exist with empID :"+empId);
			}
		
		
		return message;
	}

}
