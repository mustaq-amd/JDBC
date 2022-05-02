package com.masai.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookNotFoundException extends Exception{
	
		@Autowired
		public BookNotFoundException(String message) {
			super(message);
		}

	

}
