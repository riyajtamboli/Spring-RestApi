package com.rt.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product{
	private Integer id;
	private String name;
	private String category;
	private Double price;
	private Integer quantity;

}
