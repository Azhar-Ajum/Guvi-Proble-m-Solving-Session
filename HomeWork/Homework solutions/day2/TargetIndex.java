package day2;

//Question : Given a rotated sorted array and a target element, find the index of the target. If the target is not present,
//return -1. For example, in the array [4. 5, 6. 7, 0, 1, 2], for the target 0, the index should be 4.

//using Binary search

import java.util.Scanner;

public class TargetIndex {

	public static void main(String[] args) {


      Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array = new int[n];
		
		for(int i =0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
		int t = s.nextInt();
		
		int v = targhetindex(array, n, t);
		
		if(v==-1) {
			System.out.println("there no target element found");
		}else {
			System.out.println("Target element index : "+ v);
		}
		
		s.close();

	}

	 static int targhetindex(int[] array, int n, int t) {
		
		 int left = 0;
		 int right = n-1;
		 
		 while(left<=right) {
			 
			 int mid= left +(right-left)/2;
			 if(array[mid]==t) {
				 return mid;
			 }
			 
			 if(array[left]<=array[mid]) {
			 if((array[left]<=t)&&(t<array[mid])) {
				 right=mid-1;
			 }else {
				 left=mid+1;
			 }
			 }
		 
			 
			 else {
			 if((array[mid]<t)&&(t<=array[right])) {
				left=mid+1;
			 }else {
				 right=mid-1;
			 }
		 }
		 }
		 
		 
		return -1;
	}

	 }

