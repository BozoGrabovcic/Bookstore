package com.bookstore.spring.bookstore.service.impl;

import java.util.List;


import com.bookstore.spring.bookstore.domain.Book;

public interface BookService {

	List<Book> findAll();
	Book findById(Long id);
	
	
}
