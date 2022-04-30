package com.masai;

public class A {
	
	private String message;
	
	
	
	public void setMessage(String message) {
		this.message = message;
	}



	public void setUp() {
		
		System.out.println("object is Intialized");
		System.out.println("message : "+message);
	}
	
	public void shutdown() {
		
		System.out.println("object is Destroyed");
		System.out.println("message : "+message);
		
	}
	
	public void funA() {
		
		System.out.println("inside A : funA() ");
		
	}

}
