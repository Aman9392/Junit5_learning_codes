package com.TestCase.Conditional.Jre;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class JavaRunTimeEnviromentCondidtionsDemo {

	
	@Test
	@EnabledOnJre({JRE.JAVA_8 , JRE.JAVA_10} )
	public void enableOnJava8() {
		System.out.println("Run on java 8");
	}
	
	@Test
	@DisabledOnJre(JRE.JAVA_8 )
	public void disableOnJav8() {
		System.out.println("Run on java 8");
	}
}
