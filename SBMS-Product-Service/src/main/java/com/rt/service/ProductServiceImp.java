package com.rt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.entity.Product;
import com.rt.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {
	@Autowired
	private ProductRepository repository;
	
	@Override
	public Product addProduct(Product product) {
		return repository.save(product);
	}

	@Override
	public List<Product> getAllProdcut() {
		return repository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		Product product = null;
		try {
			product = repository.findById(id).orElseThrow(() -> new IllegalAccessException("Product Not Found"));
		} catch (IllegalAccessException e) {
		
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public Product updateProduct(Integer id) {
		Product product = getProductById(id);
		return repository.save(product);
	}

	@Override
	public String deleteProductById(Integer id) {
		repository.deleteById(id);
		return "Product deleted which having id = "+id ;
	}

}
