 package com.TestCase.Assert.ArrayIterable;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import com.junit.Aman.BookService.*;
import com.junit.Aman.Model.*;

public class ArrayIterable {
	@Test
	public void assertIterableEqualsWithNoMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		Book headFirstJavascriptBook = new Book("3", "Head First Javascript", "Wrox");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		bookService.addBook(headFirstJavascriptBook);
		
		List<String> actualTitles = bookService.getBookTitlesByPublisher("Wrox");
		
		List<String> expectedTitles = new ArrayList<>();
		expectedTitles.add("Head First Java");
		expectedTitles.add("Head First Javascript");
		
		assertIterableEquals(expectedTitles, actualTitles);
		
	}
	
	@Test
	public void assertIterableEqualsWithMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		Book headFirstJavascriptBook = new Book("3", "Head First Javascript", "Wrox");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		bookService.addBook(headFirstJavascriptBook);
		
		List<String> actualTitles = bookService.getBookTitlesByPublisher("Wrox");
		
		List<String> expectedTitles = new ArrayList<>();
		expectedTitles.add("Head First Java");
		expectedTitles.add("Head First Javascript");
		
		assertIterableEquals(expectedTitles, actualTitles, "Book titles didnt match !");
	}
	
	@Test
	public void assertIterableEqualsWithMessageSupplier() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		Book headFirstJavascriptBook = new Book("3", "Head First Javascript", "Wrox");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		bookService.addBook(headFirstJavascriptBook);
		
		List<String> actualTitles = bookService.getBookTitlesByPublisher("Wrox");
		
		List<String> expectedTitles = new ArrayList<>();
		expectedTitles.add("Head First Java");
		expectedTitles.add("Head First Javascript");
		
		assertIterableEquals(expectedTitles, actualTitles, () -> "Book titles didnt match !");
	}
}