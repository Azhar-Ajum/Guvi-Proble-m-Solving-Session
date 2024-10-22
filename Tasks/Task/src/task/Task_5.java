package task;

import java.util.Scanner;

//insert new number in between array

public class Task_5 {

	public static void main(String[] args) {
		
		
       Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array = new int[n];
		
		for(int i =0;i<n;i++) {
			array[i]= s.nextInt();
		}
		
		int p =s.nextInt();//position
		int num = s.nextInt();
		
		insertnum(array,p,num);
		
		s.close();

	}

	public static void insertnum(int[] array, int p, int num) {
		
		int[] array2 = new int[array.length+1];
		int j=0;
		for(int i=0;i<array2.length;i++) {
			if(i==(p-1)) {
				array2[i]=num;
			}else{
				array2[i]=array[j];
				j++;
			}
		}
		
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+" ");
		}
		
	}

}
