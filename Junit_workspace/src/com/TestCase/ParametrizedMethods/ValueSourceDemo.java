package com.TestCase.ParametrizedMethods;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import com.junit.ParametrizedExample.*;


public class ValueSourceDemo {

@Test
public void  testEvenValue() {
	ParametrizedExamples  calculator = new ParametrizedExamples();
	assertTrue(calculator.isEvenNumber(2));
	assertTrue(calculator.isEvenNumber(4));
	assertTrue(calculator.isEvenNumber(6));
	assertTrue(calculator.isEvenNumber(8));
	assertTrue(calculator.isEvenNumber(10));
}

@ParameterizedTest
@ValueSource(ints = {2, 4, 6, 8, 12,7,10})
public void  testEvenValueParametrizedTest(int number) {
	ParametrizedExamples  calculator = new ParametrizedExamples();
	assertTrue(calculator.isEvenNumber(number));
}

}
