package com.ty.bookapp.book_boot_app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.bookapp.book_boot_app.dto.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
