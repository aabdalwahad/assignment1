package com.exam.oop.java.oop.exam.onlineshop.menu.impl;

import com.exam.oop.java.oop.exam.onlineshop.configs.ApplicationContext;
import com.exam.oop.java.oop.exam.onlineshop.enteties.User;
import com.exam.oop.java.oop.exam.onlineshop.menu.Menu;
import com.exam.oop.java.oop.exam.onlineshop.services.UserManagementService;
import com.exam.oop.java.oop.exam.onlineshop.services.impl.DefaultUserManagementService;

public class CustomerListMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;
	
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		printMenuHeader();
		User[] users = userManagementService.getUsers();
		
		if (users.length == 0) {
			System.out.println("Unfortunately, there are no customers.");
		} else {
			for (User user : users) {
				System.out.println(user);
			}
		}
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** USERS *****");		
	}

}
