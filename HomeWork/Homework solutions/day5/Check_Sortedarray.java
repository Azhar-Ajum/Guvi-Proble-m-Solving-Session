package day5;

import java.util.Arrays;
import java.util.Scanner;

//Question : Write a program to check if an array is sorted.


public class Check_Sortedarray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] array = new int[n];

		for(int i=0;i<n;i++) {
			array[i]= s.nextInt();
		}
		
		int[] array2 = new int[n];
		
		for(int i=0;i<n;i++) {
			array2[i]=array[i];
		}
		
		Arrays.sort(array2);
		
		boolean issort = true;
		
		for(int i=0;i<n;i++) {
			if(array2[i]!=array[i]) {
				issort=false;
			}
		}
		
		if(issort) {
			System.out.println("It is sorted array");
		}
		else {
			System.out.println("It is Not Sorted Array");
		}
		
		s.close();
		

	}

}
