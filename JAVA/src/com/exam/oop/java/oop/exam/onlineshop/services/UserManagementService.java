package com.exam.oop.java.oop.exam.onlineshop.services;

import com.exam.oop.java.oop.exam.onlineshop.enteties.User;

public interface UserManagementService {

	String registerUser(User user);
	
	User[] getUsers();

	User getUserByEmail(String userEmail);

}
