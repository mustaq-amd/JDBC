package com.masai.app.main;

import javax.persistence.EntityManager;

import com.masai.app.utility.EMUtil;

public class Main {

	public static void main(String[] args) {
		
	EntityManager em = EMUtil.provideEntityManager();
	
	Employee emp=new Employee();
	
	emp.setName("Mustaq");
	emp.setSalary(95000);
	emp.setHomeAddress(new Address("Ap", "Atp", "515871"));
	emp.setOfficeAddress(new Address("Karnataka", "Bangalore", "560037"));
	
	em.getTransaction().begin();
	
	em.persist(emp);
	
	
	em.getTransaction().commit();
	
	em.close();
	
	System.out.println("Done...");
	

	

	

	}

}
