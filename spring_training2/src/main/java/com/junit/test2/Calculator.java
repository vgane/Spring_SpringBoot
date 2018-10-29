package com.junit.test2;

public class Calculator {
	
CalculatorService service;
public Calculator(CalculatorService service) {
	this.service=service;
}
	
	public Object add(int i, int j) {
		return service.add(i,j)*i;
	}

	
	

	
}
