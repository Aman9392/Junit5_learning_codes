package com.TestCase.ParametrizedMethods.MethodSource;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.junit.ParametrizedExample.StringHelper;

public class MethodSourceDemo {
    
	@ParameterizedTest
	@MethodSource("SrtringPorivder")
	public void MethodSourceDemoTest(String value) {
	assertNotNull(value);
	}
	
	
	public static  Stream<String> SrtringPorivder() {
		return Stream.of("dog", "cat" , "Lion");
		
	}
	
	@ParameterizedTest
	@MethodSource("argumnetsPorivder")
	public void MethodSourceDemowithArgumentTest(String input ,  String expected) {
	 StringHelper  stringHelper  =  new  StringHelper ();
	 assertEquals(expected ,stringHelper.reverse(input));
	}
	
	
	public static  Stream<Arguments>argumnetsPorivder() {
		return Stream.of(
				Arguments.arguments("car" , "rac"),
				Arguments.arguments("test" , "tset")
				);
	}
}
