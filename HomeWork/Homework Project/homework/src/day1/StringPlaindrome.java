package day1;

//Question : Develop a program to check if a string is a palindrome

import java.util.Scanner;

public class StringPlaindrome {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		
		String s1 = s.next();
		
        palindrome(s1);		
        
		s.close();

	}
	
	public static void palindrome(String s1) {
       String s2 = new StringBuilder(s1).reverse().toString();
		
		if(s1.equals(s2)) {
			System.out.println("Its Palindrome");
		}else {
			System.out.println("Its Not Palindrome");
		}
	}
	
	//Time Complexity = o(1);
	//Space Complexity = o(1);

}
