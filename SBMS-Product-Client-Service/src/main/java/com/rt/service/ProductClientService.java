package com.rt.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rt.entity.Product;

@FeignClient("SBMS-Product-Service")
public interface ProductClientService {

    @PostMapping("/products")
    Product addProduct(@RequestBody Product product);

    @GetMapping("/products")
    List<Product> getAllProduct();

    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable("id") Integer id);

    @PutMapping("/products/{id}")
    Product updateProduct(
            @PathVariable("id") Integer id,
            @RequestBody Product product);

    @DeleteMapping("/products/{id}")
    String deleteById(@PathVariable("id") Integer id);
}