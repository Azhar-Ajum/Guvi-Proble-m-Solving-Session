package day7;

import java.util.Scanner;
import java.util.Stack;

//Question : Write a program to evaluate postfix expressions using a stack

public class Perform_Postfix {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String s1 = s.nextLine();
		
		int result = performpostfix(s1);
		
		System.out.println(result);
		s.close();

	}

	private static int performpostfix(String s1) {
		
		Stack<Integer> stack = new Stack<>();
		
		String[] array = s1.split(" ");
		
		for(String value : array) {
			
			
			if(value.equals("+")||value.equals("-")||value.equals("*")||value.equals("/")) {
				int a = stack.pop();
				int b = stack.pop();
				
				switch(value) {
				case "+":
					stack.push(b+a);
					break;
				case "-":
					stack.push(b-a);
					break;
				case "*":
					stack.push(b*a);
					break;
				case "/":
					stack.push(b/a);
					break;
				}
			}
			else {
				stack.push(Integer.parseInt(value));
			}
			
			
		}
		
		int result = stack.pop();
		
		
		return result;
	}

}
