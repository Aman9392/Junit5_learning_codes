package com.TestCase.RepeatedTest.CustomDisplayName;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestDisplayName {

	
	 @RepeatedTest(value = 5 , name = "{displayName} - {currentRepetition} / {totalRepetitions}")
	 @DisplayName("SimpleReapetedTest")
		public void SimpleReapetedTest() {
			assertTrue(0<5);
	 }
	 
	 @RepeatedTest(value = 5 , name = RepeatedTest.LONG_DISPLAY_NAME )
		public void SimpleReapetedTestWithLongDisplayName() {
			assertTrue(0<5);
	 }
	 
	 @RepeatedTest(value = 5 , name = RepeatedTest.SHORT_DISPLAY_NAME)
		public void SimpleReapetedTestWithShortDisplayName() {
			assertTrue(0<5);
	 }
	 
}
