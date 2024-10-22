package day1;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b= s.nextInt();
		
		System.out.println(gcd(a,b));
		
		s.close();

	}
	
	public static int gcd(int a, int b) {
		int gcd = 1;
		for(int i=1;i<=Math.min(a, b);i++) {
			if((a%i==0)&&(b%i==0)) {
				gcd=i;
			}
		}
		return gcd;
	}
	
	//Time complexity = 0(n);
	//Space Complexity =o(1);

}
