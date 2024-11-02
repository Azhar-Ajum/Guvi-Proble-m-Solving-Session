package day4;

//Question : Implement a program to generate combinations of paredtheses

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParenthesisCombination {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		List<String> result = new ArrayList<>(n);
		
		generatecombination(result,"",0,0,n);
		
		System.out.println(result);
		
		s.close();

	}

	private static void generatecombination(List<String> result, String current, int open, int close, int max) {
		
		if(current.length()==max*2) {
			result.add(current);
			return;
		}
		
		if(open<max) {
			generatecombination(result, current+"(",open+1,close,max);
		}
		
		if(close<open) {
			generatecombination(result, current+")", open, close+1,max);
		}
		
		
		
		
	}

}
