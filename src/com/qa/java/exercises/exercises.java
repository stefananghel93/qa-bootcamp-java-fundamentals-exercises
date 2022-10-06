package com.qa.java.exercises;

public class exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int array[] = {12, 56, 78, 5, -1, 18};
		
		int largest = array[0];
		
		for (int i = 0; i<array.length; i++) {
			if(array[i]>largest) {
				largest = array[i];
					
			}
		}
		
		System.out.println(largest);
	}

}
