package com.masai.assignment.mar30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
	

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/db1";
		
	try(Connection conn=DriverManager.getConnection(url, "root", "root")) {
		
	PreparedStatement pstmt = conn.prepareStatement("select * from employee");
	
	
	ResultSet rs=pstmt.executeQuery();
	
	
	
	while(rs.next()) {
		int empId=rs.getInt(1);
		String name=rs.getString(2);
		String city=rs.getString(3);
		int salary=rs.getInt(4);
		
		System.out.println("Employee ID is : "+empId);
		System.out.println("Employee Name is : "+name);
		System.out.println("City is : "+city);
		System.out.println("Salary is : "+salary);
		
		System.out.println("===========================");
		
		
	}
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}

}


}


