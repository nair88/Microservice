package com.user.model;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name="PRODUCT-SERVICE")
public interface UserConsumer {
	
	@GetMapping("/products")
	public List<Product> listAllProducts();
	
	@GetMapping("/products/{id}")
	public Product listProductById(@PathVariable("id") Integer id);

}
