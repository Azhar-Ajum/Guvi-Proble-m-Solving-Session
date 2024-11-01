package day5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class KthLargestElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		Integer[] array = new Integer[n];
		
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
		int k = s.nextInt();
		
		Arrays.sort(array, Collections.reverseOrder());
		
		int kthlarge = array[k-1];
		
		System.out.println(kthlarge);
		
		s.close();

	}

}
