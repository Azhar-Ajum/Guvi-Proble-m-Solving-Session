package day5;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingHalfArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
		
		Arrays.sort(array, 0, n/2);
		
		
		for(int num : array) {
			System.out.println(num);
		}
		
		s.close();

	}

}
