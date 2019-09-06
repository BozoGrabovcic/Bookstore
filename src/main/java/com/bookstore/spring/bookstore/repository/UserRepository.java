package com.bookstore.spring.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.spring.bookstore.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);
	User findByEmail(String email);
}
