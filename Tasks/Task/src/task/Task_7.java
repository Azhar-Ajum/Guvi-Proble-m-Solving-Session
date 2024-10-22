package task;

import java.util.Scanner;


//count number of words in a given sentence
public class Task_7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String s1 = s.nextLine();
		
		String[] s2 = s1.split(" ");
		
		System.out.println(s2.length);
		
		s.close();

	}

}
