package com.ty.bookapp.book_boot_app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.bookapp.book_boot_app.dto.Book;
import com.ty.bookapp.book_boot_app.repo.BookRepository;

@Repository
public class BookDao {
	@Autowired
	BookRepository repository;
	
	public Book saveBook(Book book) {
		return repository.save(book);
	}
	
	public Book getBookById(int id) {
		return repository.findById(id).get();
	}
	
	public String deleteBookById(int id) {
		repository.deleteById(id);
		return "deleted";
	}

}
