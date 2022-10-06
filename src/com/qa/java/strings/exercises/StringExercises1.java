package com.qa.java.strings.exercises;

public class StringExercises1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs = {"abc_gmail.com", 
		         "abcd*()@gmail.com", 
		         "abcd@gmail.com", 
		         "test_123@gmail.com", 
		         "1234@#$@gmail.com"};

        for(String s : strs) {
	       // System.out.println(s);
	        //String[] ch = { "<", "(", "[", "{", "\\", "^", "-", "=", "$", "!", "|", "]", "}", ")", "?", "*", "+", ",", ">" ,"#"};
	        if(s.contains("()") ) {
	        	System.out.println(s);
	        	
	        }
	        	
	        	
       }
	}

}
