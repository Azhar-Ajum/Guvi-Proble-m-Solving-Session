package day8;

//Question : Implement a program to rotate a linked list by k nodes

//Created separate class for node and LinkedList data structure to store store , it has insert and print method


import java.util.Scanner;

public class Rotate_LinkedList {

    //method to rotate linked list by k nodes
    public static void rotateByK(LinkedList list, int k) {
    	//Checking if list is empty or null
        if (list.head == null || k == 0) {
            return;
        }

        //find length of  linked list
        Node current = list.head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }

        //connect last node to head making it circular
        current.next = list.head;

        //calculate position of  new head after rotation
        k = k % length;
        int skip = length - k;
        Node newtail = list.head;

        //move to (length - k)th node
        for (int i = 1; i < skip; i++) {
            newtail = newtail.next;
        }

        //the new head is next node after new tail and we break the loop here
        list.head = newtail.next;
        newtail.next = null;
    }

   
    
    
    
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        
        System.out.print("Enter number of nodes: ");
        int n = scanner.nextInt();

        // Adding nodes 
        System.out.println("Enter values :");
        for (int i = 0; i < n; i++) {
            list.addnode(scanner.nextInt());
        }

        //get rotation K count from user
        System.out.print("Enter value of k : ");
        int k = scanner.nextInt();

        //print  original list for reference
        System.out.println("Original List:");
        list.printlist(list);

        // Rotate the list by k nodes by calling method
        rotateByK(list, k);

        //print the list after rotation
        System.out.println("List after rotating by " + k + " nodes:");
        list.printlist(list);

        scanner.close();
    }
}
