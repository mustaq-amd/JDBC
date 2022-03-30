package com.masai.assignment.mar30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int empId=scn.nextInt();
		
		System.out.println("Enter Employee Name");
		String name=scn.next();
		
		System.out.println("Enter Employee Salary");
		int salary=scn.nextInt();
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/db1";
		
	try(Connection conn=DriverManager.getConnection(url, "root", "root")) {
		
	PreparedStatement pstmt = conn.prepareStatement("insert into employee values(?,?,?,?)");
	
	
	pstmt.setInt(1, empId);
	pstmt.setString(2, name);
	pstmt.setString(3, null);
	pstmt.setInt(4, salary);
	
	int result=pstmt.executeUpdate();
	if(result>0) {
		System.out.println(result +" record inserted");
	}
	else {
		System.out.println("not inserted");
	}
	
	
	} catch (SQLException e) {
		e.printStackTrace();
	}

}


}


