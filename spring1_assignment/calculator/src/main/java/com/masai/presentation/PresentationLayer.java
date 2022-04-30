package com.masai.presentation;

import com.masai.service.Calculator;

public class PresentationLayer {
	
	private Calculator calculator;

	public void setCalculaor(Calculator calcultaor) {
		this.calculator = calcultaor;
	}
	
	public int getSum(int a,int b) {
		
		return calculator.sum(a, b);
	}
	
	public int multiply(int a,int b) {
		
		return calculator.multiply(a, b);
	}
	
	public int substract(int a,int b) {
		
		return calculator.substract(a, b);
	}
	
	

}
