package com.masai.app.main;

import javax.persistence.EntityManager;

import com.masai.app.utility.EMUtil;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Department dept=new Department();
		dept.setDname("HR");
		dept.setLocation("Bangalore");
		
		
		Employee emp1=new Employee();
		emp1.setName("Mustaq");
		emp1.setSalary(95000);
		emp1.setAddress("Bangalore");
		emp1.setDept(dept); 
		
		Employee emp2=new Employee();
		emp2.setName("Virat");
		emp2.setSalary(85000);
		emp2.setAddress("Delhi");
		emp2.setDept(dept); 
		
		Employee emp3=new Employee();
		emp3.setName("Dhoni");
		emp3.setSalary(105000);
		emp3.setAddress("Ranchi");
		emp3.setDept(dept); 
		
		dept.getEmps().add(emp1);
		dept.getEmps().add(emp2);
		dept.getEmps().add(emp3);
		
		
		em.getTransaction().begin();
		
		em.persist(dept);
		
		em.getTransaction().commit();
		
		System.out.println("Done...");

	}

}
