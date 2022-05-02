package com.masai.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class BookNotFoundException extends Exception{
	
		
		public BookNotFoundException(String message) {
			super(message);
		}

	

}
