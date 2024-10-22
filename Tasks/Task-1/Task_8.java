package task;

import java.util.Scanner;


//applying discount for each price and adding total
public class Task_8 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] price =new int[n];
		
		for(int i=0;i<n;i++) {
			price[i]=s.nextInt();
		}
		
		
		int m =s.nextInt();
		int[] discount = new int[m];
		
		for(int i  =0;i<m;i++) {
			discount[i]=s.nextInt();
		}
		
		double sum = totalbill(price,discount);
		
		System.out.println("Total bill : "+ sum);
		s.close();
		
	}

	public static double totalbill(int[] price, int[] discount) {
		int n =price.length;
		
		double total =0;
		
		
		for(int i=0;i<n;i++) {
			double discountamount = (discount[i]/100.00)*price[i];
			total +=price[i]-discountamount;
		}
		
		
		return total;
	}

}
