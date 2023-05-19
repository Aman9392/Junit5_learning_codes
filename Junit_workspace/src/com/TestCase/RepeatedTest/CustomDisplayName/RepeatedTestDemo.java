package com.TestCase.RepeatedTest.CustomDisplayName;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;


public class RepeatedTestDemo {
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("BeforAll got executed");
	}
	public void RepeatedTestDemo() {
	   System.out.println("Constructor got executed");
	}
	
	@BeforeEach
	public  void beforeEach() {
		System.out.println("BforEach got executed");
	}
    @RepeatedTest(5)
	public void SimpleReapetedTest() {
		assertTrue(0<5);
	}
	@AfterEach
	public  void afterEach() {
		System.out.println("AfterEach got executed");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("AferAll got executed");
	}
	
}
