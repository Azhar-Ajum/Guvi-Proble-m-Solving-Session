package day1;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		evennum(a);
		
		s.close();

	}
	
	public static void evennum(int n) {
		
		for(int i=1;i<=n;i++) {
			System.out.print(i*2+" ");
		}
	}
	
	//Time complexity = o(n)
	//SPace complexity = o(1)

}
