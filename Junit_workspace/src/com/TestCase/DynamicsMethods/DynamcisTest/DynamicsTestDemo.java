package com.TestCase.DynamicsMethods.DynamcisTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import com.junit.ParametrizedExample.StringHelper;

public class DynamicsTestDemo {
    StringHelper  stringHelper = new  StringHelper();
    
	@TestFactory
	public DynamicTest testReverse() {
		return dynamicTest("Dynamics Test for Reverse Method" , () -> {
			assertEquals("god", stringHelper.reverse("dog"));
		});
	}
	
	@TestFactory
	public String testReverseWithString() {
		return "dynamic test";
	}
	
	@TestFactory
	public Collection<DynamicTest> dynamicTestFromCollection(){
		List<String> inputList = createInputList();
		List<String> outputList = createOutputList();
		
		Collection<DynamicTest> dynamicTests = new ArrayList<>();
		
		for(int i=0 ; i <inputList.size(); i++) {
			String input = inputList.get(i);
			String output = outputList.get(i);
			
			DynamicTest dynamicTest = dynamicTest ("Dynamics Test for reverse() : input - " + input, () -> {
				assertEquals(output, stringHelper.reverse(input));
			});
			
			dynamicTests.add(dynamicTest);
		}
		return dynamicTests;
	}

	
	@TestFactory
	public Iterable<DynamicTest> dynamicTestFromIterable(){
		List<String> inputList = createInputList();
		List<String> outputList = createOutputList();
		
		Collection<DynamicTest> dynamicTests = new ArrayList<>();
		
		for(int i=0 ; i <inputList.size(); i++) {
			String input = inputList.get(i);
			String output = outputList.get(i);
			
			DynamicTest dynamicTest = dynamicTest ("Dynamics Test for reverse() : input - " + input, () -> {
				assertEquals(output, stringHelper.reverse(input));
			});
			
			dynamicTests.add(dynamicTest);
		}
		return dynamicTests;
	}

	
	@TestFactory
	public Iterator<DynamicTest> dynamicTestFromIterator(){
		List<String> inputList = createInputList();
		List<String> outputList = createOutputList();
		
		Collection<DynamicTest> dynamicTests = new ArrayList<>();
		
		for(int i=0 ; i <inputList.size(); i++) {
			String input = inputList.get(i);
			String output = outputList.get(i);
			
			DynamicTest dynamicTest = dynamicTest ("Dynamics Test for reverse() : input - " + input, () -> {
				assertEquals(output, stringHelper.reverse(input));
			});
			
			dynamicTests.add(dynamicTest);
		}
		return dynamicTests.iterator();
	}

	
	@TestFactory
	public Stream<DynamicTest> dynamicTestFromStream(){
		List<String> inputList = createInputList();
		List<String> outputList = createOutputList();
		
		Collection<DynamicTest> dynamicTests = new ArrayList<>();
		
		for(int i=0 ; i <inputList.size(); i++) {
			String input = inputList.get(i);
			String output = outputList.get(i);
			
			DynamicTest dynamicTest = dynamicTest ("Dynamics Test for reverse() : input - " + input, () -> {
				assertEquals(output, stringHelper.reverse(input));
			});
			
			dynamicTests.add(dynamicTest);
		}
		return dynamicTests.stream();
	}

	
	@TestFactory
	public DynamicTest[] dynamicTestFromArray(){
		List<String> inputList = createInputList();
		List<String> outputList = createOutputList();
		
		Collection<DynamicTest> dynamicTests = new ArrayList<>();
		
		for(int i=0 ; i <inputList.size(); i++) {
			String input = inputList.get(i);
			String output = outputList.get(i);
			
			DynamicTest dynamicTest = dynamicTest ("Dynamics Test for reverse() : input - " + input, () -> {
				assertEquals(output, stringHelper.reverse(input));
			});
			
			dynamicTests.add(dynamicTest);
		}
		return dynamicTests.toArray(new DynamicTest[dynamicTests.size()]);
	}
	
	
	@TestFactory
	public Stream<DynamicNode> dynamicTestWithDynamicDemoContainers(){
		return createInputList().stream()
				.map(input -> 
				dynamicContainer("Container for " + input,Stream.of(
				dynamicTest("not null" , () -> assertNotNull(input)),
				dynamicContainer("propertiesTest", Stream.of(
					//dynamicTest("length > 0", () -> assertFalse(input.length() > 0 )),
					dynamicTest("length > 0", () -> assertTrue(input.length() > 0 )),
					dynamicTest("not empty", () -> assertFalse(input.isEmpty()))
					))
				))
			);
	}
	
	private List<String> createOutputList() {
		
		return Arrays.asList("ecar" , "mom" , "dad" , "tset");
	}

	private List<String> createInputList() {
		
		return Arrays.asList("race" , "mom" , "dad", "test");
	}
}
