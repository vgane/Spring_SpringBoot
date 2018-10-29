package com.spring.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.junit.test2.Calculator;

public class TestCalc {

	Calculator c=new Calculator();
	
	@Test
	
	public void testAdd() {
		assertEquals(5, c.add(2, 3));
	}
}
