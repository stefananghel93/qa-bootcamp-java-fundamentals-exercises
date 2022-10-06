package com.qa.java.array.exercises;

public class ArrayMain {

	public static void main(String[] args) {
		
		int list[]= {1,6,2,8,3,9,15,-1};

		ArrayUtil util;
		util = new ArrayUtil();
		
		//int arraySum = util.sumOfArray(list);
		System.out.println("Sum of array: " + util.sumOfArray(list));
		
		System.out.println("Smalest number is: " + util.smallestNumber(list));
		
		System.out.println("Largest number is: " + util.largestNumber(list));
	
		Product[] prods = {
				new Product(123, "Apple", 3.25f, "Fruits", 4.7f, 10f, false),
				new Product(321, "Soap", 2.15f, "Body Care", 4.5f, 8f, true),
				new Product(456, "Pen", 1.29f, "Office Supplies", 4.6f, 5f, true),
				new Product(234, "Desk", 56f, "Furniture", 4.78f, 7f, false),
				new Product(678, "Sofa", 65.9f, "Household", 4.8f, 7.5f, true)
		};
		
		System.out.println("-----------------");
		
		Product highestPriceProduct = util.highestPrice(prods);
		System.out.println("Highest Priced Product is: " + highestPriceProduct.name + " for " + highestPriceProduct.price +"£");
		
        System.out.println("-----------------");
		
		Product lowestPriceProduct = util.lowestPrice(prods);
		System.out.println("Lowest Priced Product is: " + lowestPriceProduct.name + " for " + lowestPriceProduct.price +"£");
		
        System.out.println("-----------------");
		
		Product highestRatingProduct = util.highestRating(prods);
		System.out.println("Highest Rated Product is: " + highestRatingProduct.name + " for " + highestRatingProduct.rating +" out of 5");
	
        System.out.println("-----------------");
		
		Product lowestRatingProduct = util.lowestRating(prods);
		System.out.println("Lowest Rated Product is: " + lowestRatingProduct.name + " for " + lowestRatingProduct.rating +" out of 5");
	}

}
