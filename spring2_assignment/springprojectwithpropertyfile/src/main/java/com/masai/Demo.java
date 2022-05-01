package com.masai;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Demo {
	
	@Autowired
	private List<String> cities;
	
	
//	@Autowired
//	private List<Student> students;
	
	@PostConstruct
	public void setUp() {
	System.out.println("inside set up method");
	}
	
	
	@PreDestroy
	public void tearDown(){
	System.out.println("inside shut down method");
	}
	
	public void printCitiesList() {
		System.out.println(cities);
	}
	
//	public void printStudentList() {
//		System.out.println(students);
//		
//	
//	}
	
	

}
