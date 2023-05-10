package com.TestCase.Assume.assumeTrue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class AssumeTrue {
	
@Test
 public void  assumeTrueWithNoMeassage() {
	
	assumeTrue("DEV".equals(System.getProperty("ENV")));
	
	System.out.println("Assumption Passed!");
	assertEquals(3 ,2+1);
}
@Test
public void  assumeTrueWithMeassage() {
	
	assumeTrue("DEV".equals(System.getProperty("ENV")), "Assumtion Faild !!!");
	
	System.out.println("Assumption Passed!");
	assertEquals(3 ,2+1);
}
@Test
public void  assumeTrueWithMeassageSupplier() {
	
	assumeTrue("DEV".equals(System.getProperty("ENV")), () ->"Assumtion Faild !!!");
	
	System.out.println("Assumption Passed!");
	assertEquals(3 ,2+1);
}

@Test
public void  assumeTrueWithBooleanSupplierAndNoMessage() {
	
	assumeTrue(() ->"DEV".equals(System.getProperty("ENV")));
	
	System.out.println("Assumption Passed!");
	assertEquals(3 ,2+1);
}
@Test
public void  assumeTrueWithBooleanSupplierAndMessage() {
	
	assumeTrue(() ->"DEV".equals(System.getProperty("ENV")), "Assumtion Faild !!!");
	
	System.out.println("Assumption Passed!");
	assertEquals(3 ,2+1);
}
@Test
public void assumeTrueWithBooleanSupplierAndMessageSupplier() {
	
	assumeTrue(() ->"DEV".equals(System.getProperty("ENV")), () ->"Assumtion Faild !!!");
	
	System.out.println("Assumption Passed!");
	assertEquals(3 ,2+1);
}
}
