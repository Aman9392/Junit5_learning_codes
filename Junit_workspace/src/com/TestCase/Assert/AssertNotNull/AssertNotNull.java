package com.TestCase.Assert.AssertNotNull;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import com.junit.Aman.BookService.*;
import com.junit.Aman.Model.*;

public class AssertNotNull {

	@Test
	public void assertNotNullWithNoMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		Book actualBook = bookService.getBookById("1");
		assertNotNull(actualBook);
	}
	
	@Test
	public void assertNotNullWithMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		Book actualBook = bookService.getBookById("1");
		assertNotNull(actualBook, "Book is null !");
	}
	
	@Test
	public void assertNotNullWithMessageSupplier() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		Book actualBook = bookService.getBookById("1");
		assertNotNull(actualBook, () -> "Book is null !");
	}
}
