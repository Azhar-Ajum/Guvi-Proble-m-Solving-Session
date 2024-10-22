package task;

import java.util.Scanner;

//summing only even numbers in array

public class Task_4 {

	public static void main(String[] args) {
      
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array = new int[n];
		
		for(int i =0;i<n;i++) {
			array[i]= s.nextInt();
		}
		
		int v = sumevennumbers(array,n);
		
		System.out.println("The sum of Even numbers in array : "+ v);
		
		s.close();

	}
	

	public static int sumevennumbers(int[] array, int n) {
		
		int sum=0;
		for(int i=0;i<n;i++) {
			if(array[i]%2==0) {
				sum+=array[i];
			}
		}
		
		return sum;
	}

}
