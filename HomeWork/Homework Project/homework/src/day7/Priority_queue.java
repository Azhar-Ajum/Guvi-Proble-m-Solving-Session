package day7;

import java.util.Scanner;

//Question : Create a program to implement a priority queue.

public class Priority_queue {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n= s.nextInt();
		s.nextLine();
		
		String[] task = new String[n];
		int[] priority = new int[n];
		
		for(int i=0;i<n;i++) {
			task[i]=s.nextLine();
			priority[i]=s.nextInt();
			s.nextLine();
		}
		
		sortpriority(task,priority,n);
		
		for(int i=0;i<n;i++) {
			System.out.println("Task Name : "+task[i]+" priority : " + priority[i]);
		}
		
		s.close();
		

	}

	private static void sortpriority(String[] task, int[] priority, int n) {
		
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				
				if(priority[j]<priority[j+1]) {
					//swap priority
					int temp = priority[j];
					priority[j]=priority[j+1];
					priority[j+1]=temp;
					
					//swap task
					String tempname = task[j];
					task[j]=task[j+1];
					task[j+1]=tempname;
					
				}
				
				
			}
		}
		
	}

}
