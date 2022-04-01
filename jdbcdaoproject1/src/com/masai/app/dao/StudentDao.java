package com.masai.app.dao;

import com.masai.app.model.Student;

public interface StudentDao {
	
	public String insertStudentDetails(int roll,String name,int marks);
	
	public String insertStudentDetails2(Student student);
	
	public int getStudentMarksByRoll(int roll);
	
	

}
