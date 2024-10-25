package day3;

import java.util.Scanner;

public class TileCase {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
	    String s1 = s.nextLine();
	    
	    String[] s2 = s1.split(" ");
	    
	    StringBuilder tile = new StringBuilder();
	    
	    for(String word : s2) {
	    	
	    	tile.append(Character.toUpperCase(word.charAt(0)))
	    	.append(word.substring(1).toLowerCase())
	    	.append(" ");
	    	
	    	}
	    
	    String result = tile.toString();
	    
	    System.out.println(result);
	    
	    s.close();
	    
	    
	    
	}

}
