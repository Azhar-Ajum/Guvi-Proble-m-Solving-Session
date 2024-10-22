package day2;

import java.util.Scanner;

public class Minimumvalue {

	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array = new int[n];
		
		for(int i =0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
		int v = minimumvalue(array,n);
		
		System.out.println("minimum value : "+ v);
		
		s.close();

	}

	public static int minimumvalue(int[] array, int n) {
		
		int v=array[0];
		
		for(int i =0;i<n;i++) {
			if(array[i]<v) {
				v=array[i];
			}
			
		}
		
		return v;
	}

}
