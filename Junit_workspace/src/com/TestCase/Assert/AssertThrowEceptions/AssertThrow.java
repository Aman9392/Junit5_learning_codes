package com.TestCase.Assert.AssertThrowEceptions;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.junit.Aman.BookService.BookService;
import com.junit.Aman.BookService.BookNotFound.BookNotFoundException;
import com.junit.Aman.Model.Book;

public class AssertThrow {
	@Test
	public void assertEqualsWithNoMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		//assertThrows(BookNotFoundException.class,() -> bookService.getBookByTitle("Head First Design"));
		BookNotFoundException bookNotFoundException  = assertThrows(BookNotFoundException.class,() -> bookService.getBookByTitle("Head First Design"));
		assertEquals("Book Not Found In Book Store" , bookNotFoundException.getMessage());
		
	}
	
	
	
	@Test
	public void assertEqualsWithMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		
		assertThrows(BookNotFoundException.class, () -> bookService.getBookByTitle("Head First Design") , "Different Exception throw");
	}
	
	
	
	@Test
	public void assertEqualsWithMessageSupplier() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		
		assertThrows(BookNotFoundException.class, () -> bookService.getBookByTitle("Head First Design") , () ->"Different Exception throw");
	}
}
