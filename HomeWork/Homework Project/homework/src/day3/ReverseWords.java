package day3;


//Question :  Write a program to reverse the words in a sentence

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
	    String s1 = s.nextLine();
	    
	    String[] s2 = s1.split(" ");
	    
	    
	    reverseword(s2);
	    
	    s.close();
	
	
	
	}

	private static String reverseword(String[] s2) {
		
		
		 for(int i=s2.length-1;i>=0;i--) {
		    	System.out.print(s2[i]+" ");
		    }
		return null;
	}

}
