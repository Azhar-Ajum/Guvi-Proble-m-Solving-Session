package day2;

import java.util.Scanner;

public class ArraySecondLargest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array = new int[n];
		
		for(int i =0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
		int res = secondlargest(array, n);
		
		if(res==0) {
			System.out.println("There is no number");
		}
		else {
			System.out.println("Second Largest num "+ res);
		}
		
		s.close();

	}

	private static int secondlargest(int[] array, int n) {
		
		int lar=0;
		int secondlar=0;
		for(int i=0;i<n;i++) {
			if(array[i]>lar) {
				secondlar=lar;// 0 1 2 3 4
				lar = array[i];//1 2 3 4 5
			}else if(array[i]>secondlar&&array[i]!=lar) {
				secondlar=array[i];
			}
		}
		
		
		return secondlar;
	}

}
