package com.qa.java.oop.feature.polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Audi audi = new Audi(123, "Audi", 45.999, 2995, "Petrol" , 2022 , "A3 Sallon", true);
		
		audi.displayAudiCarInfo();
		
		System.out.println();
		
		BMW bmw = new BMW(223, "BMW", 29.999, 1995, "Diesel", 2019, 4 , 5000);
		
		bmw.displayBmwCarInfo();
	
	
	
	
	
	}
	
	
	
	

}
