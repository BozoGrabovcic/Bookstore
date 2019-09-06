package com.bookstore.spring.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.spring.bookstore.domain.*;

public interface RoleRepository extends CrudRepository<Role,Long>{
	Role findByName(String name);

}
