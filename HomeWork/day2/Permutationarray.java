package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Permutationarray {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
			//First Array
			int n = s.nextInt();
			
			int[] array1 = new int[n];
			
			for(int i =0;i<n;i++) {
				array1[i]=s.nextInt();
			}
			
			//Second Array
	        int m = s.nextInt();
			
			int[] array2 = new int[m];
			
			for(int i =0;i<m;i++) {
				array2[i]=s.nextInt();
			}
			
			if(ispermutation(array1,array2)) {
				System.out.println("it is permutation array");
			}else {
				System.out.println("Entered array is not permutation");
			}
			
			s.close();

	}

	public static boolean ispermutation(int[] array1, int[] array2) {
		
		if(array1.length!=array2.length) {
			return false;
		}
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		return Arrays.equals(array1, array2);
	}

}
