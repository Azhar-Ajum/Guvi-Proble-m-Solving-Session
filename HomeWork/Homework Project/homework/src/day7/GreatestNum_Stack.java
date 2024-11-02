package day7;

import java.util.Scanner;
import java.util.Stack;

//Question : Implement a program to find the next greater element for each element in an array using a stack


public class GreatestNum_Stack {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
		findnextgreatest(array,n);
		
		s.close();
		
	}

	private static void findnextgreatest(int[] array, int n) {
		
		
		int[] result = new int[n];
		
		for(int i=0;i<n;i++) {
			result[i]=-1;
		}
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<n;i++) {
			
			while(!stack.isEmpty() && array[i]>array[stack.peek()]){
				int index =stack.pop();
				result[index]=array[i];
			}
			stack.push(i);
		}
		
		
		for(int num : result) {
			System.out.println(num);
		}
		
	}

}
