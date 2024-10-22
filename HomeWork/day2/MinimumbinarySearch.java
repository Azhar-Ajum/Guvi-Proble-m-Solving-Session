package day2;

import java.util.Scanner;

public class MinimumbinarySearch {

	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array = new int[n];
		
		for(int i =0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
		int v = minimumvaluebybinary(array,n);
		
		System.out.println("minimum value : "+ v);
		
		s.close();
	}

	public static int minimumvaluebybinary(int[] array, int n) {
		
		int left = 0;
		int right = n-1;
		
		
		
		while(left<right) {
			int mid = left+(right-left)/2;
			
			
			//minimum is in right side
			if(array[mid]>array[right]) {
				left=mid+1;
			}
			else {
				right=mid;
			}
			
			
		}
		
		return  array[left];
	}

}
