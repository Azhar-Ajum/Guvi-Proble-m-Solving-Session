package task;

import java.util.HashSet;
import java.util.Scanner;

//to find repeating element in array
public class Task_10 {

	public static void main(String[] args) {
		
		
      Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array= new int[n];
		
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
		repeatingelement(array,n);
		
		s.close();

	}

	public static void repeatingelement(int[] array, int n) {
		
		HashSet<Integer> s1 = new HashSet<Integer>();//unique
		HashSet<Integer> s2 = new HashSet<Integer>();//repeated
		
		for(int i=0;i<n;i++) {
			if(s1.contains(array[i])) {
				s2.add(array[i]);
			}else {
				s1.add((array[i]));
			}
		}
		
		
		for(int a : s2) {
			System.out.println(a);
		}
		
	}

}
