package day1;

//Question : Write a program to find the maximum and minimum of an array

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int size = s.nextInt();
		
		int[] a = new int[size];
		
		for(int i =0; i<a.length;i++) {
			a[i]= s.nextInt();
		}
		
		maxmin(a);
		
		s.close();

	}
	
	public static void maxmin(int[] a) {
		
		int max=a[0], min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}else if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(max + " "+min);
		
	}
	
	//Time complexity =o(n);
	//Space complexity =o(1);

}
