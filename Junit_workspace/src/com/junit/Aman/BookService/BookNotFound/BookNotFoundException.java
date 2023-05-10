package com.junit.Aman.BookService.BookNotFound;


public class BookNotFoundException extends RuntimeException{
	
  public BookNotFoundException(String message) {
	  super(message);
  }
}
