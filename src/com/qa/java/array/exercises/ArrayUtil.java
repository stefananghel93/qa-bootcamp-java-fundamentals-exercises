package com.qa.java.array.exercises;


public class ArrayUtil {
	
	int sumOfArray(int[] list) {
		int sum=0;
		for(int i : list) {
			sum+= i ;	
			
		}
		return sum;
		
	}

	int smallestNumber(int[] list) {
		int smallest = list[0];
		for(int j = 0; j<list.length; j++) {
			if(list[j]< smallest) 
				smallest = list[j];
		}
		return smallest;
	}
	
	
	int largestNumber(int[] list) {
		int largest = list[0];
		for(int l =0; l<list.length; l++) {
			if (list[l]>largest)
				largest = list[l];
		}
	return largest;
	}
	
	Product highestPrice(Product[] prods) {
		Product product = prods[0];
		float highestPrice = prods[0].price;
		for(Product prod : prods) {
			if(prod.price > highestPrice) {
				product=prod;
				highestPrice = prod.price;
			}
			
		}
		return product;
	    
	    }
	    
		
		Product lowestPrice(Product[] prods) {
			Product product = prods[0];
			float lowestPrice = prods[0].price;
			for(Product prod : prods) {
				if(prod.price < lowestPrice) {
					product=prod;
					lowestPrice = prod.price;
				}
				
			}
			return product;	
		}
		
		Product highestRating(Product[] prods) {
			Product product = prods[0];
			float highestRating = prods[0].rating;
			for(Product prod : prods) {
				if(prod.rating > highestRating) {
					product=prod;
					highestRating = prod.price;
				
			}
			
		}
			return product;
    }
		Product lowestRating(Product[] prods) {
			Product product = prods[0];
			float lowestRating = prods[0].rating;
			for(Product prod : prods) {
				if(prod.rating < lowestRating) {
					product=prod;
					lowestRating = prod.price;
				
			}
			
		}
			return product;
    }
}

