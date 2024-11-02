package day2;

//Question : Write a program to left rotate an array by one position

import java.util.Scanner;

public class LeftRotate {

	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array = new int[n];
		
		for(int i =0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
		int k = s.nextInt();
		
		 leftrotate(array,k,n);
		 
		 s.close();

	}

	public static void leftrotate(int[] array, int k, int n) {
		
		
		
		k=k%n;
		
		for(int i=0;i<k;i++) {
			rotateone(array, n);
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+ " ");
		}
		
		
		
	}

	private static void rotateone(int[] array, int n) {
		int first = array[0];
		
		
		for(int i=0;i<n-1;i++) {
			array[i]=array[i+1];
		}
		
		array[n-1]=first;
		
	}

	

}
