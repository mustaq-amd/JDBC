package com.masai.app.usecases;

import java.util.Scanner;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;

public class FetchEmployeeeNameAndAddress {

	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Please Enter Employee ID");
		int empId=scn.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		String[] result=dao.getNameAndAddress(empId);
		
		
		
		if(result!=null) {
			System.out.println("Name is : "+result[0]);
			System.out.println("Address is : "+result[1]);
		}else {
			System.out.println("Employee does not exist");
		}

	}

}
