package com.springboot.service;


import java.util.List;

import com.springboot.model.User;

public interface UserService {
	
	List<User> findAllUsers();
		
	void saveUser(User user);
	
	User findById(long id);
	void updateUser(User user);
	
	void deleteUserById(long id);

	
	boolean isUserExist(User user);
	User findByEmail(String email);
	
}
