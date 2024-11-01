package day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MostFrequency {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] array = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i]= s.nextInt();
		}
		
		int k = s.nextInt();
		
		List<Integer> result = mostfrequency(array,n,k);
		
		if(result.isEmpty()) {
			System.out.println("No repeating elements");
		}else {
			for(int num : result) {
				System.out.println(num);
			}
		}
		
		s.close();
		
	}

	private static List<Integer> mostfrequency(int[] array, int n, int k) {
		
		Map<Integer,Integer> frequency = new HashMap<>();
		
		
		for(int num : array) {
			frequency.put(num, frequency.getOrDefault(num, 0)+1);
			
		}
		
		
		List<Map.Entry<Integer,Integer>> frequencylist = new ArrayList<>(frequency.entrySet());
		
		
		frequencylist.sort((a,b)-> b.getValue().compareTo(a.getValue()));
		
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0;i<k;i++) {
			result.add(frequencylist.get(i).getKey());
		}
		
		return result;
	}

}
