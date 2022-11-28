package com.ty.bookapp.book_boot_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.bookapp.book_boot_app.dao.BookDao;
import com.ty.bookapp.book_boot_app.dto.Book;

@RestController
public class BookController {
	@Autowired
	BookDao dao;


	@PostMapping("/save")
	public Book saveBook(@RequestBody Book book) {
		return dao.saveBook(book);
	}
	@GetMapping("get")
	public Book getBook(@RequestParam int id) {
		return dao.getBookById(id);
	}

	@DeleteMapping("delete/{id}")
	public String deleteStudent(@PathVariable int id)	{
		return dao.deleteBookById(id);
	}

}
