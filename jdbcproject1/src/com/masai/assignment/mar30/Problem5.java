package com.masai.assignment.mar30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Problem5 {

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
		
	PreparedStatement pstmt = conn.prepareStatement("select * from employee where eid=?");
	
	pstmt.setInt(1, empId);
	
	ResultSet rs=pstmt.executeQuery();
	
	
	
	if(rs.next()) {
		System.out.println("Employee Id is : "+rs.getInt(1));
		System.out.println("Employee Name is : "+rs.getString(2));
		System.out.println("Employee address is : "+rs.getString(3));
		System.out.println("Employee salary is : "+rs.getInt(4));
		
	}
	else {
		System.out.println("No Employee exist");
	}
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}

}


}


