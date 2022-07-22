package com.product.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepo productRepo;
	Product p1 = new Product(101, "galaxy", 1200);
	Product p2 = new Product(202, "iphone13", 1300);
	Product p3 = new Product(303, "pixel", 900);

	private List<Product> products = new ArrayList<>(Arrays.asList(p1, p2, p3));

	@Override
	public void addProduct() {

		// TODO Auto-generated method stub
		productRepo.saveAll(products);

	}

	@Override
	public List<Product> listAllProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Product listProductById(Integer id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).get();
	}

}
