package com.masai.dao;

import java.util.List;

import com.masai.exception.BookNotFoundException;
import com.masai.model.Book;

public interface BookDAO {
	
	public boolean createBook(Book book);
	public List<Book> getAllBooks();
	public Book findBook(int bookId) throws BookNotFoundException;
	public String deleteBookById(int bookId) throws BookNotFoundException;
	
	

}
