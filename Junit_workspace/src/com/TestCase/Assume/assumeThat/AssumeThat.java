package com.TestCase.Assume.assumeThat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

public class AssumeThat {

	@Test
	 public void  assumeThatWithBooleanCondition() {
		
		assumingThat("DEV".equals(System.getProperty("ENV")), () -> {
			System.out.println("Dev Enviroment");
			assertEquals(5 ,2+3);
		});
		// below code gets exceuted in every enviroment
		System.out.println("Executed Every Enviroment");
		assertEquals(3 ,2+1);
	}
	
	@Test
	 public void  assumeThatWithBooleanSupplier() {
		
		assumingThat(()-> "DEV".equals(System.getProperty("ENV")), () -> {
			System.out.println("Dev Enviroment");
			assertEquals(5 ,2+3);
		});
		// below code gets exceuted in every enviroment
		System.out.println("Executed Every Enviroment");
		assertEquals(3 ,2+1);
	}
}
