package com.qa.java.oop.feature.inheritance;

public class BMW extends Car {
	int noOfCylinders;
	int maxTorque;

	public BMW(int id, String name, double price, int engineCC, String fuelType, int manufacturingYear,
			int noOfCylinders, int maxTorque) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.noOfCylinders = noOfCylinders;
		this.maxTorque = maxTorque;
	}

	void displayBmwCarInfo() {
		
		displayCarInfo();
		System.out.println("Number of Cylinders: " + noOfCylinders);
		System.out.println("Max Torque " + maxTorque);
		
			
		}
	
}
