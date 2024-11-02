package day2;

//Question : Implement a program to merge two sorted arrays

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

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
		
		
		int[] array3 = merge(array1,array2);
		
		Arrays.sort(array3);
		
		for(int a: array3) {
			System.out.print(a + " ");
		}
		s.close();

	}

	private static int[] merge(int[] array1, int[] array2) {
		int n = array1.length;
		int m = array2.length;
		
		int o =n+m;
		
		int[] array3 = new int[o];
		
        for(int i=0;i<n;i++) {
			array3[i]=array1[i];
		}
        
        for(int i=0;i<m;i++) {
        	array3[n+i]=array2[i];
        }
		return array3;
	}

}
