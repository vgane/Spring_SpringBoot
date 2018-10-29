package com.spring.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import com.junit.test2.Calculator;
import com.junit.test2.CalculatorService;

public class TestCalculator {

	Calculator c=null;
	CalculatorService service=Mockito.mock(CalculatorService.class);
	@Before 
	public void setUp() {
		c= new Calculator(service);
	}
	
	@Test
	public void testPerform() {
		when(service.add(2,3)).thenReturn(5);
		assertEquals(10, c.add(2,3));
		verify(service.add(2,3));
	}
}
