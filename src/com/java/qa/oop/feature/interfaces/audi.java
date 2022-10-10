package com.java.qa.oop.feature.interfaces;

public class audi extends CarDetails implements Car {
	String model;
	boolean isAvailable;
	
	
	
	

	public audi(int id, String name, double price, int engineCC, String model, boolean isAvailable) {
		super(id, name, price, engineCC);
		this.model = model;
		this.isAvailable = isAvailable;
	}





	@Override
	public void displayCar() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price + "£");
		System.out.println("Engine capacity: " + engineCC + "cm³");
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Manufacturing Year: " + manufacturingYear);
		System.out.println("Model: " + model);
		System.out.println("Availability: " + isAvailable);
	}


	}


