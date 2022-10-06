package com.qa.java.exercises;

public class OopProduct {

	public static void main(String[] args) {
		Product prod1;
		prod1 = new Product();
		
		prod1.id = 123;
		prod1.name = "Apple";
		prod1.price = 3.25f;
		prod1.category = "Fruits";
		prod1.rating = 4.7f;
		prod1.discountPercentage = 10;
		prod1.isAvailable = false;
		
		
		System.out.println("---------First Product---------");
		System.out.println("ID: " + prod1.id);
		System.out.println("Name: " + prod1.name);
		System.out.println("Price: " + prod1.price);
		System.out.println("Category: " + prod1.category);
		System.out.println("Rating: " + prod1.rating);
		System.out.println("Discount: " + prod1.discountPercentage + "%");
		System.out.println("Availability: " + prod1.isAvailable);
        System.out.println();	
	
		
		Product prod2;
		prod2 = new Product();
		
		prod2.id = 321;
		prod2.name = "Soap";
		prod2.price = 2.15f;
		prod2.category = "Body Care";
		prod2.rating = 4.9f;
		prod2.discountPercentage = 12;
		prod2.isAvailable = true;
		
		
		System.out.println("---------Second Product---------");
		System.out.println("ID: " + prod2.id);
		System.out.println("Name: " + prod2.name);
		System.out.println("Price: " + prod2.price);
		System.out.println("Category: " + prod2.category);
		System.out.println("Rating: " + prod2.rating);
		System.out.println("Discount: " + prod2.discountPercentage + "%");
		System.out.println("Availability: " + prod2.isAvailable);
		System.out.println();	
	
		Product prod3;
		prod3 = new Product();
		
		prod3.id = 456;
		prod3.name = "Pen";
		prod3.price = 1.49f;
		prod3.category = "Office Supplies";
		prod3.rating = 4.5f;
		prod3.discountPercentage = 7.5f;
		prod3.isAvailable = true;
			
		System.out.println("---------Third Product---------");
		System.out.println("ID: " + prod3.id);
		System.out.println("Name: " + prod3.name);
		System.out.println("Price: " + prod3.price);
		System.out.println("Category: " + prod3.category);
		System.out.println("Rating: " + prod3.rating);
		System.out.println("Discount: " + prod3.discountPercentage + "%");
		System.out.println("Availability: " + prod3.isAvailable);
		

	}

}
