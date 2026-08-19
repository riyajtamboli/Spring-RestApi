package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entity.Product;
import com.rt.service.ProductClientService;

@RestController
public class ClientController {
	@Autowired
	private ProductClientService clientService;
	
	@PostMapping("/products")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		Product prd = clientService.addProduct(product);
		return new ResponseEntity<Product>(prd, HttpStatus.OK);
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProduct(){
		List<Product> allProduct = clientService.getAllProduct();
		return new ResponseEntity<>(allProduct, HttpStatus.OK);
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id){
		Product product = clientService.getProductById(id);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<Product> updateProduct(
	        @PathVariable("id") Integer id,
	        @RequestBody Product product) {

	    Product newProduct = clientService.updateProduct(id, product);

	    return new ResponseEntity<>(newProduct, HttpStatus.OK);
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Integer id){
		String msg = clientService.deleteById(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
}
