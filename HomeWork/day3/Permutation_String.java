package day3;

import java.util.Scanner;

public class Permutation_String {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
	    String s1 = s.nextLine();
	    
	    generatepermutation(s1,"");
	    
	    s.close();

	}

	private static void generatepermutation(String s1, String prefix) {
		
		if(s1.length()==0) {
			System.out.println(prefix);
		}
		
		
		else {
			for(int i=0;i<s1.length();i++) {
				char currentchar = s1.charAt(i);
				String remainingchar = s1.substring(0, i)+s1.substring(i+1);
				
				generatepermutation(remainingchar, prefix+currentchar);
			}
		}
		
	}

}
