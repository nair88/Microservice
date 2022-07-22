package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.Product;
import com.user.model.UserConsumer;

@RestController
public class UserController {
	@Autowired
	UserConsumer userConsumer;

	@GetMapping("/user/all")
	public List<Product> getAllProducts() {
		return userConsumer.listAllProducts();
	}

	@GetMapping("/user/{id}")
	public Product getProductById(@PathVariable Integer id) {
		return userConsumer.listProductById(id);
	}
}
