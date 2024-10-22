package day2;

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

