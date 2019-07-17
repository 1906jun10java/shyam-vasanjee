package com.revature.books.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.books.Book;

public class ObjectConverter {
	

	static ObjectMapper objectMapper = new ObjectMapper();
	
	public static String convertBook(String title, String author) {
		String bookAsString = "";
		Book book = new Book(title, author);
		try {
			bookAsString = objectMapper.writeValueAsString(book);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return bookAsString;
	}
}


