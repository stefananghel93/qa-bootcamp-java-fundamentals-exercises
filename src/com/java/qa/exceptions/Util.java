package com.java.qa.exceptions;

import com.qa.java.exercises.Product;

public class Util {
	
	 static Product findById(int id) throws ProductNotFoundException {
		Product prod = null;
		
		Product[] prods = {
				new Product(123, "Apple", 3.25f, "Fruits", 4.7f, 10f, false),
				new Product(321, "Soap", 2.15f, "Body Care", 4.5f, 8f, true),
				new Product(456, "Pen", 1.29f, "Office Supplies", 4.6f, 5f, true),
				new Product(234, "Desk", 56f, "Furniture", 4.78f, 7f, false),
				new Product(678, "Sofa", 65.9f, "Household", 4.8f, 7.5f, true)
		};
		for (Product p:prods) {
			prod = p;
		}
		if(prod == null) {
			throw new ProductNotFoundException("No product found with this id");
		}
		return prod;	
		
	}
    
}
