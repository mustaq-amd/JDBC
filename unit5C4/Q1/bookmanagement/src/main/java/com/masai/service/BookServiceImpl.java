package com.masai.service;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.masai.dao.BookDAO;
import com.masai.dao.BookDAOImpl;
import com.masai.exception.BookNotFoundException;
import com.masai.model.Book;


@Service
public class BookServiceImpl implements BookService {

	@Override
	public boolean createBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Bean("blist")
	public List<Book> getAllBooks() {
		
		BookDAO dao=new BookDAOImpl();
		
		List<Book> books = dao.getAllBooks();
		
		
		
		return books;
	}

	@Override
	public Book findBook(int bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBookById(int bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
