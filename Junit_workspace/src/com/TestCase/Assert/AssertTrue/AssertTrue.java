package com.TestCase.Assert.AssertTrue;
import org.junit.jupiter.api.Test;
import com.junit.Aman.BookService.*;
import com.junit.Aman.Model.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;


public class AssertTrue {
	
	@Test
	public void assertTrueWithNoMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		
		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertTrue(listOfBooks.isEmpty());
		
	} 
	
	
	@Test
	public void assertTrueWithBooleanSupplierAndNoMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		
     	bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertTrue(() -> listOfBooks.isEmpty());
		
	}
	
	@Test
	public void assertTrueWithMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		
	    bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertTrue(listOfBooks.isEmpty(), "List of Books Is not Empty");
		
	} 
	
	@Test
	public void assertTrueWithBooleanSupplierAndMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		
		bookService.addBook(headFirstJavaBook);
	
		List<Book> listOfBooks = bookService.books();
		
		assertTrue(() -> listOfBooks.isEmpty(), "List of books is not empty!");
		
	}
	
	@Test
	public void assertTrueWithMessageSupplier() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		
 		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertTrue(listOfBooks.isEmpty(), () -> "List of books is not empty!");
		
	}
	
	@Test
	public void assertTrueWithBooleanSupplierAndMessageSupplier() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		
      	bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertTrue(() -> listOfBooks.isEmpty(), () -> "List of books is not empty!");
		
	}
	
}
