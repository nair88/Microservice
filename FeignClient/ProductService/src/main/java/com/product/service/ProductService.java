package com.product.service;

import java.util.List;

import com.product.model.Product;

public interface ProductService {
	public void addProduct();

	public List<Product> listAllProducts();
	public Product listProductById(Integer id);
}
