package com.masai;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Demo demo=ctx.getBean(Demo.class,"demo");
		
		demo.printCitiesList();
		
		//demo.printStudentList();
		
		List<Student> students=(List<Student>) ctx.getBean("slist");
		
		System.out.println(students);
		
		
	
	
		
		((AnnotationConfigApplicationContext)ctx).close();
		
	}

}
