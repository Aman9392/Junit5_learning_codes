package com.TestCase.Annotaitons.DispalyName;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Display Name Annotation Method")

public class DisplayName_Mtethod {	
@Test
@DisplayName("Display Name Test")
 public void displayNameDemo(){
	assertEquals(3 ,2+1);
}

@Test
@DisplayName("Display Name Spaces")
 public void displayNameDemoWithSpace(){
	assertEquals(3 ,2+1);
}

@Test
@DisplayName("Display Name special charchter like !@#%")
 public void displayNameDemoWithSpeacialCharachter(){
	assertEquals(3 ,2+1);
}

@Test
@DisplayName("Display Name Emojies 😂 ")
 public void displayNameDemoWithEmojies(){
	assertEquals(3 ,2+1);
}
}
