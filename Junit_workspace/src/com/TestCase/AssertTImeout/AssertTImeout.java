package com.TestCase.AssertTImeout;

import org.junit.jupiter.api.Test;
import com.junit.Aman.BookService.*;
import com.junit.Aman.Model.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;


public class AssertTImeout {

	@Test
	public void assertTimeoutWithNoMessage() {
		BookService bookService = new BookService();
		
		for(int i = 1; i <= 1000; i++) {
			bookService.addBook(new Book(String.valueOf(i), "Head First Java", "Wrox"));
		}
		
		List<String> actualTitles = new ArrayList<>();
		
		assertTimeout(Duration.ofMillis(1), () -> {
			actualTitles.addAll(bookService.getBookTitlesByPublisher("Wrox"));
		});
		
		assertEquals(1000, actualTitles.size());
		
	}
	
	@Test
	public void assertTimeoutWithMessage() {
		BookService bookService = new BookService();
		
		for(int i = 1; i <= 1000; i++) {
			bookService.addBook(new Book(String.valueOf(i), "Head First Java", "Wrox"));
		}
		
		List<String> actualTitles = new ArrayList<>();
		
		assertTimeout(Duration.ofMillis(1), () -> {
			actualTitles.addAll(bookService.getBookTitlesByPublisher("Wrox"));
		}, "Performance issues with getBookTitlesByPublisher() method !");
		
		assertEquals(1000, actualTitles.size());
		
	}
	
	@Test
	public void assertTimeoutWithMessageSupplier() {
		BookService bookService = new BookService();
		
		for(int i = 1; i <= 1000; i++) {
			bookService.addBook(new Book(String.valueOf(i), "Head First Java", "Wrox"));
		}
		
		List<String> actualTitles = new ArrayList<>();
		
		assertTimeout(Duration.ofMillis(1), () -> {
			actualTitles.addAll(bookService.getBookTitlesByPublisher("Wrox"));
		}, () -> "Performance issues with getBookTitlesByPublisher() method !");
		
		assertEquals(1000, actualTitles.size());
		
	}
}
