package com.masai.app.usecases;

import java.util.Scanner;

import com.masai.app.dao.StudentDao;
import com.masai.app.dao.StudentDaoImpl;
import com.masai.app.model.Student;

public class InsertStudentUseCase {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Roll No");
		int roll=scn.nextInt();
		
		System.out.println("Enter Name");
		String name=scn.next();
		
		System.out.println("Enter Marks");
		int marks=scn.nextInt();
		
		
		//tight coupling
		//StudentDaoImpl dao=new StudentDaoImpl();
		
		StudentDao dao=new StudentDaoImpl();
		
		//String result=dao.insertStudentDetails(roll, name,marks);
		
		Student student=new Student();
		
		student.setRollNo(roll);
		student.setName(name);
		student.setMarks(marks);
		
		
		String result=dao.insertStudentDetails2(student);
		
		System.out.println(result);

	}

}
