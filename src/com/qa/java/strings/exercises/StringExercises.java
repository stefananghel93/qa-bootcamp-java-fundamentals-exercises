package com.qa.java.strings.exercises;

public class StringExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hello how are you";
		String[] strs = str.split(" ");
		
		//System.out.println(str.split(" ").length);
		
		int count = 0;
		for(String s : strs) {
			//System.out.println(s);
			count++;
			
		}
		System.out.println("Number of words: " +count);	

		
		
		
		
	}

}
