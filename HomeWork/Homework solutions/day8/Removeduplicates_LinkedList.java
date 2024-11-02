package day8;


//Question : Create a program to remove duplicates from a linked list
//Created separate class for node and LinkedList data structure to store store , it has insert and print method


import java.util.HashSet;
import java.util.Scanner;

public class Removeduplicates_LinkedList {



    //method to remove duplicates
    public static void removeduplicates(LinkedList list) {
        HashSet<Integer> set = new HashSet<>();
        
        
        Node current = list.head;
        Node previous = null;

        while (current != null) {
            if (set.contains(current.data)) {
                // Duplicate found remove it
                previous.next = current.next;
            } else {
                //not a duplicate add to the set
                set.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList list = new LinkedList();

       
        System.out.print("Enter the number of elements to insert: ");
        int n = s.nextInt();

        //insert elements from user input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.addnode(s.nextInt());
        }

        //printing original list  
        System.out.println("Original Linked List :");
        list.printlist();

        //removing duplicates by calling method
        removeduplicates(list);
        
        //printing List after Removing duplicates
        System.out.println("Linked List after removing duplicates: ");
        list.printlist();

        s.close(); 
    }
}