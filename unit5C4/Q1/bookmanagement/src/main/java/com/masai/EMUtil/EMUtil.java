package com.masai.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

@Component
public class EMUtil {
	
	private static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("bookmanagement");
	}
	
	public static EntityManager provideEntityManager() {
		
		return emf.createEntityManager();
		
		
	}

}
