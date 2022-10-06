package com.qa.java.exercises;

public class DataTypeExercise {

	public static void main(String[] args) {
		int salary;
		salary = 35000;
		
		double incrementedSalary;
		incrementedSalary =  salary * (10.5/100);
		
		System.out.println("Incremented Salary: " + incrementedSalary) ;
		
		//double totalSalary;
		salary += incrementedSalary;
		
		System.out.println("Total salary is: " + salary) ;
		
		System.out.println("------------------------------------------");
		
		float apple;
		apple = 3.25f;
		
		float chickenFillets;
		chickenFillets = 7.25f;
		
		float banana;
		banana = 1.25f;
		
		float finalPriceApple;
		finalPriceApple =  apple - (apple * 10/100);
		
		System.out.println("Final apple price is: " + finalPriceApple + "£");
		
		float finalPriceChickenFillets;
		finalPriceChickenFillets = chickenFillets - (chickenFillets * 8/100);
		
		System.out.println("Final chicken fillets price is: " + finalPriceChickenFillets + "£");
		
		float finalPriceBanana;
		finalPriceBanana = banana - (banana * 3/100);
		
		System.out.println("Final banana price is: " + finalPriceBanana + "£");
		
		
		
		
		
		
		
		
		
		

	}

}
