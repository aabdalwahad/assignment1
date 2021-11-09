package com.exam.oop.java.oop.exam.onlineshop.services;

import com.exam.oop.java.oop.exam.onlineshop.enteties.Product;

public interface ProductManagementService {

	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}
