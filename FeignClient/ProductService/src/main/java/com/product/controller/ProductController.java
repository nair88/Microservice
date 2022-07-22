package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.service.ProductService;


@RestController
public class ProductController {
	@Autowired
ProductService productService;
	@GetMapping("/products")
	public List<Product> listAllProducts(){
		return productService.listAllProducts();
	}
	@GetMapping("/products/{id}")
	public Product listProductById(@PathVariable("id") Integer id) {
		return productService.listProductById(id);
	}
	
	  @RequestMapping(method = RequestMethod.POST,value="/products") 
	  public void addProduct() {
	  productService.addProduct(); }
	 
}
