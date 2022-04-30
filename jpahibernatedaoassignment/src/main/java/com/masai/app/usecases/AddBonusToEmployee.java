package com.masai.app.usecases;

import java.util.Scanner;

import com.masai.app.dao.EmployeeDao;
import com.masai.app.dao.EmployeeDaoImpl;

public class AddBonusToEmployee {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Please Enter Employee ID");
		int empId=scn.nextInt();
		
		System.out.println("Please Enter Bonus amount");
		int amount=scn.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		String result=dao.giveBonusToEmployee(empId, amount);
		
		if(result != null) {
			System.out.println(result);
		}
		else {
			System.out.println("Employee does not exist");
		}

	}

}
