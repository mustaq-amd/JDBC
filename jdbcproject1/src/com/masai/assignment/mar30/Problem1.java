package com.masai.assignment.mar30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter employee id");
		int empId=scn.nextInt();
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/db1";
		
	try(Connection conn=DriverManager.getConnection(url, "root", "root")) {
		
	PreparedStatement pstmt = conn.prepareStatement("select salary from employee where eid=?");
	
	pstmt.setInt(1, empId);
	
	ResultSet rs=pstmt.executeQuery();
	
	
	
	if(rs.next()) {
		System.out.println("Salary is : "+rs.getInt(1));
		
	}else {
		System.out.println("No employee exist");
	}
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}

}


}


