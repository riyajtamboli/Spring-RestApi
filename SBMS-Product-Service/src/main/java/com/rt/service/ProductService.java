package com.rt.service;

import java.util.List;

import com.rt.entity.Product;

public interface ProductService {
	Product addProduct(Product product);
	List<Product> getAllProdcut();
	Product getProductById(Integer id);
	Product updateProduct(Integer id);
	String deleteProductById(Integer id);
}
