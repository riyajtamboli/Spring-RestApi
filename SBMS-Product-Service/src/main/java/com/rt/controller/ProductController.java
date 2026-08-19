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
import com.rt.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/products")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		Product prdt = productService.addProduct(product);
		return new ResponseEntity<>(prdt,HttpStatus.OK);
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProduct(){
		List<Product> allProduct = productService.getAllProdcut();
		return new ResponseEntity<>(allProduct, HttpStatus.OK);
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id){
		Product product = productService.getProductById(id);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable("id") Integer id){
		Product product = productService.updateProduct(id);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Integer id){
		String msg = productService.deleteProductById(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
