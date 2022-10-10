package com.java.qa.exceptions;

import com.qa.java.exercises.Product;

public class UtilMain {

	public static void main(String[] args) {
		
//		try {
//			System.out.println(div(100,5));
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Exception occured..");
//		}
//		
//
//	
//
//	static int div(int no1, int no2) {
//		  
//		return no1/no2;    
//     }
	
    Product prod;
	try {
		prod = Util.findById(12);
		System.out.println(prod.price);
	}catch (ProductNotFoundException e) {
		System.out.println(e.getMessage());
	}
}

}
