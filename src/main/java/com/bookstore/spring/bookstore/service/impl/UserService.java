package com.bookstore.spring.bookstore.service.impl;

import java.util.Set;

import com.bookstore.spring.bookstore.domain.PasswordResetToken;
import com.bookstore.spring.bookstore.domain.User;
import com.bookstore.spring.bookstore.domain.UserRole;

public interface UserService {

	PasswordResetToken getPasswordResetToken (final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);

	User findByUsername(String username);
	
	User findByEmail(String email);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
}
