package com.TestCase.Annotaitons.Disabaled;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.junit.Aman.BookService.BookService;
import com.junit.Aman.Model.Book;
@Disabled
public class Disabled_Method {
	@Test
	
	public void assertEqualsWithNoMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		Book actualBook = bookService.getBookById("1");
		
		assertEquals("1", actualBook.getBookId());
		assertEquals("Head First Java", actualBook.getTitle());
	}
	@Test
	public void assertEqualsWithMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		Book actualBook = bookService.getBookById("1");
		
		assertEquals("1", actualBook.getBookId());
		assertEquals("Head First Java", actualBook.getTitle(), "Book title didnt match!");
	}
	
	@Test
	public void assertEqualsWithMessageSupplier() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		Book actualBook = bookService.getBookById("1");
		
		assertEquals("1", actualBook.getBookId());
		assertEquals("Head First Java", actualBook.getTitle(), () -> "Book title didnt match!");
	}
}
