package task;

import java.util.Scanner;

//two arrays compatible or not , array1 elements should greater or equal

public class Task_3 {

	public static void main(String[] args) {
		
		
		 Scanner s = new Scanner(System.in);
			
			int n = s.nextInt();
			
			int[] array1 = new int[n];
			
			for(int i =0;i<n;i++) {
				array1[i]= s.nextInt();
			}
			
			int m =s.nextInt();
			
			int[] array2 = new int[m];
			
			for(int i=0;i<m;i++) {
				array2[i]=s.nextInt();
			}
			
			if(iscompatible(array1,array2)) {
				System.out.println("compatible");
			}else {
				System.out.println("Not Compatible");
			}
			s.close();

	}

	public static boolean iscompatible(int[] array1, int[] array2) {
		
		if(array1.length!=array2.length) {
			return false;
		}
		
		int n = array1.length;
		
		boolean value = true;
		
		for(int i=0;i<n;i++) {
			if(array1[i]<array2[i]) {
				value= false;
			}
		}
		
		
		return value;
	}

}
