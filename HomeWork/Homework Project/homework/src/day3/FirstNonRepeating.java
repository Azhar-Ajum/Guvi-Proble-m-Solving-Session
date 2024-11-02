package day3;

//Question :  Given a string s, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.
//For example, for s= "leetcode", the output should be 0.

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeating {
	

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
	    String s1 = s.nextLine();
	    
	    int i = firstnonrepeatingchar(s1);
	    
	    if(i==-1) {
	    	System.out.println("0");
	    }else {
	    	System.out.println(i);
	    }
	    
	    s.close();
	    
	    
	}

	private static int firstnonrepeatingchar(String s1) {
		
		char[] c1 = s1.toCharArray();
		
		
	
	
		Map<Character,Integer> frequency = new LinkedHashMap<>();
		
		for(char c : c1) {
			frequency.put(c, frequency.getOrDefault(c, 0)+1);
		}
		
		for(int i=0;i<s1.length();i++) {
			if(frequency.get(s1.charAt(i))==1){
				return i;
			}
		}
		
		
		
		
		
		return -1;
	}

}
