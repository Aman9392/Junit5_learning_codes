package com.TestCase.ParametrizedMethods.CsvSoursce;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import com.junit.ParametrizedExample.*;
public class CsvSourceDemo {
	
	@ParameterizedTest
	@CsvSource({
		"Aman , namA",
		"Car , raC"
		})
     public void CSVSourceDemo(String input , String expact) {
    	 StringHelper stringHelper = new  StringHelper();
    	 assertEquals(expact ,stringHelper.reverse(input) );
     }
	
	@ParameterizedTest
	@CsvSource({
		"Aman ,'namA'",
		"Car , 'raC'"
		})
     public void CSVSourceDemoWithSingleQuotes(String First , String Seound) {
    	assertNotNull(First);
    	assertNotNull(Seound);
     }
}
