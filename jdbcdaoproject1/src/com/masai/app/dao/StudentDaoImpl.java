package com.masai.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.app.model.Student;
import com.masai.app.utility.DBUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String insertStudentDetails(int roll, String name, int marks) {
		
		String message="Not inserted..";
		
		
		try(Connection conn=DBUtil.provideConnection()) {
		
		String sql="insert into student values(?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		
		ps.setInt(1, roll);
		ps.setString(2, name);
		ps.setInt(3, marks);
		
		int result=ps.executeUpdate();
		
		if(result>0)
			message="Inserted Successfully...!";
		
			
			
		} catch (Exception e) {
			message=e.getMessage();
		}
		
		
		return message;
	}

	@Override
	public int getStudentMarksByRoll(int roll) {
		
		int marks= -1 ;
		
		try(Connection conn=DBUtil.provideConnection()) {
			
			String sql="select marks from student where roll=?";
			
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setInt(1, roll);
			
			ResultSet rs=ps.executeQuery();
			
			
			if(rs.next())
				marks=rs.getInt("marks");
				
			} catch (SQLException e) {
				//marks=e.getMessage();
			
			}
			
		
		return marks;
	}

	@Override
	public String insertStudentDetails2(Student student) {
		
	String message="Not inserted..";
		
		
		try(Connection conn=DBUtil.provideConnection()) {
		
		String sql="insert into student values(?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		
		ps.setInt(1, student.getRollNo());
		ps.setString(2, student.getName());
		ps.setInt(3, student.getMarks());
		
		int result=ps.executeUpdate();
		
		if(result>0)
			message="Inserted Successfully...!";
		
			
			
		} catch (Exception e) {
			message=e.getMessage();
		}
		
		
		return message;
		
	}

}
