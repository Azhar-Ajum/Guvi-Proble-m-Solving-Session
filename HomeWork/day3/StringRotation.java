package day3;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
	    String s1 = s.nextLine();
	    
	    String s2 = s.nextLine();
	    
	    if((s1.length()==s2.length())&&((s1+s1).contains(s2))){
	    	
	    	
	    	System.out.println("It is String Rotation");
	    }else {
	    	System.out.println("It is not String Rotation");
	    }
	    
	    s.close();

	}

}
