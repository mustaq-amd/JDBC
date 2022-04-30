package com.masai.app.usecases;

import java.util.Scanner;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;

public class FetchEmployeeAddress {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Please Enter Employee ID");
		int empId=scn.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		String result=dao.getAddressOfEmployee(empId);
		
		if(result!=null) {
			System.out.println("Adress is : "+result);
		}else {
			System.out.println("Employee does not exist");
		}

	}

}
