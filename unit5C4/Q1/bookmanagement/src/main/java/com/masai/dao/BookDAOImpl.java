package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.masai.EMUtil.EMUtil;
import com.masai.exception.BookNotFoundException;
import com.masai.model.Book;


@Repository
public class BookDAOImpl implements BookDAO {

	@Override
	public boolean createBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> getAllBooks() {
		
		List<Book> books=null;
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String query="from Book";
		
		TypedQuery<Book> tq=em.createQuery(query,Book.class);
		
		books=	tq.getResultList();
		
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
