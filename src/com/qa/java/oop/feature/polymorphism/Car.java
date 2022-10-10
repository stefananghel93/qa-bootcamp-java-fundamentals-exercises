package com.qa.java.oop.feature.polymorphism;

public class Car {
	
	int id;
	String name;
	double price;
	int engineCC;
	String fuelType;
	int manufacturingYear;
	



public Car(int id, String name, double price, int engineCC, String fuelType, int manufacturingYear) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manufacturingYear = manufacturingYear;
	}




void displayCarInfo() {
	

	System.out.println("ID: " + id);
	System.out.println("Name: " + name);
	System.out.println("Price: " + price + "£");
	System.out.println("Engine capacity: " + engineCC + "cm³");
	System.out.println("Fuel Type: " + fuelType);
	System.out.println("Manufacturing Year: " + manufacturingYear);
}
}