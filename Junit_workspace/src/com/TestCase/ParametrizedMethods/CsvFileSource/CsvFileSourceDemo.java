package com.TestCase.ParametrizedMethods.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.junit.ParametrizedExample.StringHelper;

public class CsvFileSourceDemo {
	
	
	 @ParameterizedTest
	 @CsvFileSource(resources = "reverse.csv" )
	 public void CsvFileSourceDemoTest(String input , String expact) {
    	 StringHelper stringHelper = new  StringHelper();
    	 assertEquals(expact,stringHelper.reverse(input));
     }
	 
	 @ParameterizedTest
	 @CsvFileSource(resources = "reverse.csv" , numLinesToSkip = 1 )
	 public void CsvFileSourceDemoWithNumberOfLinesSklipsTest(String input , String expact) {
    	 StringHelper stringHelper = new  StringHelper();
    	 assertEquals(expact,stringHelper.reverse(input));
     }
}
