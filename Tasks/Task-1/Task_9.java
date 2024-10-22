package task;

import java.util.Arrays;
import java.util.Scanner;

//print first half of array in ascending and second half of array in descending

public class Task_9 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array= new int[n];
		
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
		ascendinganddescendingarray(array,n);
		
		s.close();

	}

	public static void ascendinganddescendingarray(int[] array, int n) {
		
		Arrays.sort(array, 0 ,n/2);//sorting Ascending first part
		
		
		
		for(int i=n/2;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i]<array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
		
	}

}
