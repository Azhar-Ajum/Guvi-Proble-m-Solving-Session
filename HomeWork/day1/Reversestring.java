package day1;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String s1 = s.next();
		
		System.out.println(reverse(s1));
		
		
		System.out.println(reversestring(s1));
		
	    s.close();

	}
	
	//Using default Method to reverse string
	public static String reverse(String s1) {
		
		String s2= new StringBuilder(s1).reverse().toString();
		
		return s2;
	}
	
	//Time complexity = o(1)
	//SPace complexity =o(1)
	
	
	
	//Changing to character array to reverse
	public static char[] reversestring(String s1) {
		char[] c = s1.toCharArray();
		
		char[] cr = new char[c.length];
		int j =0;
		
		for(int i=c.length-1;i>=0;i--) {
            cr[j]=c[i];
			j++;
		}
		
		return cr;
	}
	
	//Time complexity= o(n)
	//Space complexity=  o(1)

}
