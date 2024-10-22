package task;

import java.util.Scanner;


//sum of two arrays

public class Task_2 {

	public static void main(String[] args) {
		
       Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array1 = new int[n];
		
		for(int i =0;i<n;i++) {
			array1[i]= s.nextInt();
		}
		
		int[] array2 = new int[n];
		
		for(int i=0;i<n;i++) {
			array2[i]=s.nextInt();
		}
		
		
		int[] array3 = summof(array1,array2,n);
		
		for(int v :array3) {
			System.out.println(v);
		}
		
		s.close();
		
	}
	
	

	public static int[] summof(int[] array1, int[] array2, int n) {
		
		int[] array3 = new int[n];
		
		for(int i=0;i<n;i++) {
			array3[i]=array1[i]+array2[i];
		}
		
		return array3;
		
		
	}

}
