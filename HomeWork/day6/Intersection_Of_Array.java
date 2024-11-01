package day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Question :  Create a program to find the intersection of two sorted arrays.


public class Intersection_Of_Array {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array1 = new int[n];
		
		for(int i=0;i<n;i++) {
			array1[i]=s.nextInt();
		}
		
		int m = s.nextInt();

		int[] array2 = new int[m];

		for(int i=0;i<m;i++) {
			array2[i]=s.nextInt();
		}
		
		 isintersection(array1,array2,n,m);
		 
		 s.close();
		

	}

	private static void isintersection(int[] array1, int[] array2, int n, int m) {
		
		List<Integer> result = new ArrayList<>();
		
		//Two Pointer Approach,  instead of using two for loop , to improve time complexity
		int i=0,j=0;
		
		while(i<n && j<m) {
			
			if(array1[i]<array2[j]) {
				i++;
			}
			else if(array1[i]>array2[j]) {
				j++;
			}
			
			else {
				//To avoid the duplicates element to enter
				if(result.isEmpty()|| result.get(result.size()-1)!=array1[i]) {
					result.add(array1[i]);
					
				}
				i++;
				j++;
				
			}
			
			
		}
		
		
		
		for(int num : result) {
			System.out.println(num);
		}
		
		
		
	}

}
