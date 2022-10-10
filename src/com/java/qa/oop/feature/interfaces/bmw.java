package com.java.qa.oop.feature.interfaces;

public class bmw extends CarDetails implements Car {
	int noOfCylinders;
	int maxTorque;
	
	
	
	

	public bmw(int id, String name, double price, int engineCC, int noOfCylinders, int maxTorque) {
		super(id, name, price, engineCC);
		this.noOfCylinders = noOfCylinders;
		this.maxTorque = maxTorque;
	}





	@Override
	public void displayCar() {
		System.out.println("ID: " + id);		
		System.out.println("Name: " + name);
		System.out.println("Price: " + price + "£");
		System.out.println("Engine capacity: " + engineCC + "cm³");
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Manufacturing Year: " + manufacturingYear);
		System.out.println("Number of Cylinders: " + noOfCylinders);
		System.out.println("Max Torque " + maxTorque);
	}

	

	

}
