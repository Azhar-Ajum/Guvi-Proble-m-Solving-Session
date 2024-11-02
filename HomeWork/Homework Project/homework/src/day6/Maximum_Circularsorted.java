package day6;

import java.util.Scanner;

//Question : Implement a program to find the maximum element in a circular sorted array.


public class Maximum_Circularsorted {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] array = new int[n];

		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
		int max = maximumelement(array,n);
		
		if(max==-1) {
			System.out.println("No elements");
		}else {
			System.out.println(max);
		}
		
		s.close();

	}

	private static int maximumelement(int[] array, int n) {
		
		int left = 0;
		int right = n-1;
		
	
		
		//binary search
		while(left<=right) {
			
			//checking if array is not  rotated simply return right
			if(array[left]<=array[right]) {
				return array[right];
			}
			 int mid =left+(right-left)/2;
			 
			 //checking if mid is equal
			 if((mid==0||array[mid]>array[mid-1]) && ((mid==n-1)||array[mid]>array[mid+1])) {
				 return array[mid];
			 }
			 
			 if(array[left]<=array[mid]) {
				 left = mid +1;
			 }
			 
			 else {
				 right = mid-1;
			 }
			
			
			
		}
		
		
		return -1;
	}

}
