package task;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


//frequency of each lower case letters

public class Task_6 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		String s1 = s.nextLine();
		
		sqeuenceofletter(s1);
		
		s.close();

	}

	public static void sqeuenceofletter(String s1) {
		
		char[] c1 = s1.toCharArray();
		
		
		Map<Character,Integer> frequency = new TreeMap<>();
		
		for(char c : c1) {
			if(Character.isLowerCase(c)) {
				frequency.put(c, frequency.getOrDefault(c, 0)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : frequency.entrySet()) {
			System.out.print(entry.getKey()+""+entry.getValue()+"");
		}
		
		System.out.println("----------------");
		
		frequency.forEach((key, value) -> System.out.print(key+""+value+" "));
		
	}

}
