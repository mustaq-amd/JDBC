package com.masai.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.app.bean.Employee;
import com.masai.app.exception.EmployeeException;
import com.masai.app.utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String saveEmployeeDetails(Employee employee) {
		
		String message="Not inserted...";
		
		
		try(Connection conn=DBUtil.provideConnection()) {
			
		String sql="insert into employee values(?,?,?,?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, employee.getEmpId());
		ps.setString(2, employee.getName());
		ps.setString(3, employee.getAddress());
		ps.setInt(4, employee.getSalary());
		
		int result = ps.executeUpdate();
		
		if(result>0) {
			message="Inserted Successfully....";
		}
		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return message;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		
		Employee employee=null;
		
		try(Connection conn=DBUtil.provideConnection()) {
			
			String sql="select * from employee where empId=?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, empId);
		
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int eid=rs.getInt(1);
				String name=rs.getString(2);
				String address=rs.getString(3);
				int salary=rs.getInt(4);
				
				employee=new Employee(eid,name,address,salary);
				
				employee.setEmpId(eid);
				employee.setName(name);
				employee.setAddress(address);
				employee.setSalary(salary);
				
			}else {
				throw new EmployeeException("Employee doesn't exist with empId : "+empId);
			}
			
				
			} catch (SQLException e) {
				throw new EmployeeException("Employee doesn't exist with empId : "+empId);
			}
		
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		
		List<Employee> list=new ArrayList<>();
		
		try(Connection conn=DBUtil.provideConnection()) {
			
			String sql="select * from employee";
			
			PreparedStatement ps = conn.prepareStatement(sql);
		
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int eid=rs.getInt(1);
				String name=rs.getString(2);
				String address=rs.getString(3);
				int salary=rs.getInt(4);
				
				Employee employee=new Employee(eid,name,address,salary);
				
				employee.setEmpId(eid);
				employee.setName(name);
				employee.setAddress(address);
				employee.setSalary(salary);
				
				list.add(employee);
				
			}
			
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		
		return list;
	}

	@Override
	public String deleteEmployee(int empId) throws EmployeeException {
		
		String message="Not Deleted...";
		
		
		try(Connection conn=DBUtil.provideConnection()) {
			
		String sql="delete from employee where empId=?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		
		ps.setInt(1, empId);
	
		
		int result = ps.executeUpdate();
		
		if(result>0) {
			message="Deleted Successfully....";
		}else {
			throw new EmployeeException("Employee doesn't exist with empId : "+empId);
			
		}
		
			
		} catch (SQLException e) {
			throw new EmployeeException("Employee doesn't exist with empId : "+empId);
		}
		
		
		return message;

	}

}
