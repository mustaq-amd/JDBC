package com.masai.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.presentation.PresentationLayer;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PresentationLayer pl= ctx.getBean(PresentationLayer.class,"pl");
		
		int sum=pl.getSum(4,5);
		int mul=pl.multiply(7, 10);
		int minus=pl.substract(54, 10);
		
		System.out.println("sum is :"+sum);
		System.out.println("product is :"+mul);
		System.out.println("Substraction is :"+minus);
		
		
		
		

	}

}
