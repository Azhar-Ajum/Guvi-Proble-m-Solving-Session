package task;

import java.util.Scanner;


//Finding Maximum Element of an array

public class Task_1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array = new int[n];
		
		for(int i =0;i<n;i++) {
			array[i]= s.nextInt();
		}
		
		int v = maximumnum(array,n);
		
		System.out.println(v +" is the maximum element in the array");

		s.close();
	}

	public static int maximumnum(int[] array, int n) {
		
		int v =array[0];
		
		for(int i=0;i<n;i++) {
			if(array[i]>v) {
				v=array[i];
			}
			
		}
		
		
		return v;
	}

}
