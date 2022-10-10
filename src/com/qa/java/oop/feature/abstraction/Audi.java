package com.qa.java.oop.feature.abstraction;

public class Audi extends Car {
	String model;
	boolean isAvailable;
	
	

	public Audi(int id, String name, double price, int engineCC, String fuelType, int manufacturingYear, String model,
			boolean isAvailable) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.model = model;
		this.isAvailable = isAvailable;
	}
	
	void displayCarInfo() {
	}
		
//		super.displayCarInfo();
//		System.out.println("Model: " + model);
//		System.out.println("Availability: " + isAvailable);
//		
//	}
	

}
