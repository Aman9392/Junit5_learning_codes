package com.TestCase.Conditional.OS;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class OperatingSystemConditionalDemo {
   
@Test
@EnabledOnOs(value = {OS.WINDOWS , OS.MAC})
 public void  enableOnWindowsAndMac() {
	System.out.println("Only Execution On Windows And Mac");
 }


@Test
@DisabledOnOs(value =  OS.MAC)
 public void  disabledOnMac() {
	System.out.println("Only Disabled on Mac");
 }
}
