package day6;


import java.util.Scanner;

//Question : Write a program to search for a range of indices of an element in a sorted array.

public class Serach_Range {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] array = new int[n];

		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
		int t = s.nextInt();
		
		int[] result = firstandlastrange(array,t);
		
		if(result[0]==-1) {
			System.out.println("There is no target element");
		}else if(result[1]==-1) {
			System.out.println("Target occured only one time in index : "+ result[0] );
		}else {
			System.out.println("Range : "+ result[0]  +" "+ result[1]);
		}
		
		s.close();

	}

	private static int[] firstandlastrange(int[] array, int t) {
		
		
		
		
		
		int[] result = new int[2];
		
		result[0]=-1;
		result[1]=-1;
		
		
		int n = array.length;
		
		
		int left = 0, right = n-1;
		
		
		//First occurance
		while(left<=right) {
			
			
			int mid = left+ (right-left)/2;
			
			if(array[mid]==t) {
				result[0]=mid;
				right = mid-1;
				
				
			}
			
			else if(array[mid]<t) {
				left = mid +1;
			}
			else {
		        right = mid-1;
			}
			
		}
		
		if(result[0]==-1) {
			return result;
		}
		
		
		
		left=result[0]+1;
		right = n-1;
		
		//Last occurance
		while(left<=right) {


			int mid = left+ (right-left)/2;

			if(array[mid]==t) {
				result[1]=mid;
				left = mid+1;

			}

			else if(array[mid]<t) {
				left = mid +1;
			}
			else {
				right = mid-1;
			}

		}
		
		 
		
		return result;
	}

}
