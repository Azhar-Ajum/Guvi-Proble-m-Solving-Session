package day5;

import java.util.Arrays;
import java.util.Scanner;

//Question : Implement a program to sort an array of strings by length


public class Array_of_String {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String s1 = s.nextLine();
		
		String[] array = s1.split(" ");
		
		Arrays.sort(array, (a,b)-> Integer.compare(a.length(), b.length()));
		
		for(String word : array) {
			System.out.println(word);
		}
		
		s.close();
		
		
		
	}

}
