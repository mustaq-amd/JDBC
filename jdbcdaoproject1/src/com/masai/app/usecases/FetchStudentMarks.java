package com.masai.app.usecases;

import java.util.Scanner;

import com.masai.app.dao.StudentDao;
import com.masai.app.dao.StudentDaoImpl;

public class FetchStudentMarks {
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Roll No");
		int roll=scn.nextInt();
		
		StudentDao dao=new StudentDaoImpl();
		
		int marks=dao.getStudentMarksByRoll(roll);
		
		System.out.println(marks);
	}

}
