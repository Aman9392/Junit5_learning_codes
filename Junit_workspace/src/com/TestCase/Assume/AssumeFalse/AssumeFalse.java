package com.TestCase.Assume.AssumeFalse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;


import org.junit.jupiter.api.Test;

public class AssumeFalse {
	@Test
	 public void  assumeFalseWithNoMeassage() {
		
		assumeFalse("DEV".equals(System.getProperty("ENV")));
		
		System.out.println("Assumption Passed!");
		assertEquals(3 ,2+1);
	}
	@Test
	public void  assumeFalseWithMeassage() {
		
		assumeFalse("DEV".equals(System.getProperty("ENV")), "Assumtion Faild !!!");
		
		System.out.println("Assumption Passed!");
		assertEquals(3 ,2+1);
	}
	@Test
	public void  assumeFalseWithMeassageSupplier() {
		
		assumeFalse("DEV".equals(System.getProperty("ENV")), () ->"Assumtion Faild !!!");
		
		System.out.println("Assumption Passed!");
		assertEquals(3 ,2+1);
	}

	@Test
	public void  assumeFalseWithBooleanSupplierAndNoMessage() {
		
		assumeFalse(() ->"DEV".equals(System.getProperty("ENV")));
		
		System.out.println("Assumption Passed!");
		assertEquals(3 ,2+1);
	}
	@Test
	public void  assumeFalseWithBooleanSupplierAndMessage() {
		
		assumeFalse(() ->"DEV".equals(System.getProperty("ENV")), "Assumtion Faild !!!");
		
		System.out.println("Assumption Passed!");
		assertEquals(3 ,2+1);
	}
	@Test
	public void assumeFalseWithBooleanSupplierAndMessageSupplier() {
		
		assumeFalse(() ->"DEV".equals(System.getProperty("ENV")), () ->"Assumtion Faild !!!");
		
		System.out.println("Assumption Passed!");
		assertEquals(3 ,2+1);
	}
}

