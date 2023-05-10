package com.TestCase.Assert.AssertFalse;
import org.junit.jupiter.api.Test;
import com.junit.Aman.BookService.*;
import com.junit.Aman.Model.*;

import static org.junit.jupiter.api.Assertions.assertFalse;


import java.util.List;
public class AssertFalse {

	@Test
	public void assertFalseWithNoMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		
		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertFalse(listOfBooks.isEmpty());
		
	}
	
	@Test
	public void assertFalseWithBooleanSupplierAndNoMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		
		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertFalse(() -> listOfBooks.isEmpty());
		
	}
	
	@Test
	public void assertFalseWithMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		
		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertFalse(listOfBooks.isEmpty(), "List of books is empty!");
		
	}
	
	@Test
	public void assertFalseWithBooleanSupplierAndMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		
		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertFalse(() -> listOfBooks.isEmpty(), "List of books is not empty!");
		
	}
	
	@Test
	public void assertFalseWithMessageSupplier() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		
		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertFalse(listOfBooks.isEmpty(), () -> "List of books is empty!");
		
	}
	
	@Test
	public void assertFalseWithBooleanSupplierAndMessageSupplier() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		
		bookService.addBook(headFirstJavaBook);
		
		List<Book> listOfBooks = bookService.books();
		
		assertFalse(() -> listOfBooks.isEmpty(), () -> "List of books is empty!");
		
	}
}
