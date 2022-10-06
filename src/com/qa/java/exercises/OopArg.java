package com.qa.java.exercises;

public class OopArg {

	public static void main(String[] args) {
		
		Product prod1;
		prod1 = new Product(123, "Apple", 3.25f, "Fruits", 4.7f, 10f, false);
		
		System.out.println("---------First Product---------");
		
		prod1.displayProductInfo();
		
		System.out.println("Discount price is: " + prod1.discountPrice()); 
		System.out.println("Final price is: " + prod1.finalPrice());
		
//		System.out.println("ID: " + prod1.id);
//		System.out.println("Name: " + prod1.name);
//		System.out.println("Price: " + prod1.price);
//		System.out.println("Category: " + prod1.category);
//		System.out.println("Rating: " + prod1.rating);
//		System.out.println("Discount: " + prod1.discountPercentage + "%");
//		System.out.println("Availability: " + prod1.isAvailable);
        System.out.println();	
        
        Product prod2;
		prod2 = new Product(321, "Soap", 2.15f, "Body Care", 4.5f, 8f, true);
		
		System.out.println("---------Second Product---------");
		
		prod2.displayProductInfo();
		
		System.out.println("Discount price is: " + prod2.discountPrice());
		System.out.println("Final price is: " + prod2.finalPrice());
		
//		System.out.println("ID: " + prod2.id);
//		System.out.println("Name: " + prod2.name);
//		System.out.println("Price: " + prod2.price);
//		System.out.println("Category: " + prod2.category);
//		System.out.println("Rating: " + prod2.rating);
//		System.out.println("Discount: " + prod2.discountPercentage + "%");
//		System.out.println("Availability: " + prod2.isAvailable);
		System.out.println();	
		
		Product prod3;
		prod3 = new Product(456, "Pen", 1.29f, "office Supplies", 4.6f, 5f, true);
		
		System.out.println("---------Third Product---------");
		
		prod3.displayProductInfo();
		
		System.out.println("Discount price is: " + prod3.discountPrice());
		System.out.println("Final price is: " + prod3.finalPrice());
		
//		System.out.println("ID: " + prod3.id);
//		System.out.println("Name: " + prod3.name);
//		System.out.println("Price: " + prod3.price);
//		System.out.println("Category: " + prod3.category);
//		System.out.println("Rating: " + prod3.rating);
//		System.out.println("Discount: " + prod3.discountPercentage + "%");
//		System.out.println("Availability: " + prod3.isAvailable);
		
		System.out.println();
	
		Product.sellerContactDetails();
		
		

	}

}
