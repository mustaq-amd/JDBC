package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ctx.getBean(A.class,"a").funA();
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
