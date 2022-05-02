package com.masai.persistence;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.model.Book;
import com.masai.service.BookService;
import com.masai.service.BookServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		BookService bs = ctx.getBean("bookServiceImpl",BookServiceImpl.class);
		
		
		List<Book> books=(List<Book>) ctx.getBean("blist");
		
		if(books==null) {
			System.out.println("Book table is empty");
		}
		else {
			for (Book book : books) {
				
				System.out.println("Book ID : "+book.getBookId());
				System.out.println("Book Name : "+book.getBookName());
				System.out.println("Book Author : "+book.getAuthor());
				System.out.println("Book Price : "+book.getPrice());
				
				System.out.println("======================");
				
				
			}
		}
	}

}
