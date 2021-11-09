package com.exam.oop.java.oop.exam.onlineshop.services;

import com.exam.oop.java.oop.exam.onlineshop.enteties.Order;

public interface OrderManagementService {

	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);
	
	Order[] getOrders();

}
