package day8;

import java.util.HashSet;
import java.util.Scanner;

// Question: Write a program to find the intersection point of two linked lists

//Method to find intersection by shared nodes (reference-based)
//Intersection occurs only if list2 shares a node in memory with list1.


//Created separate class for node and LinkedList data structure to store store , it has insert and print method

// class linked list to add a new node



public class Intersection_LinkedList {
	
	//main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        // Input for list1
        System.out.print("Enter no. of nodes for List1 : ");
        int node1 = s.nextInt();
        System.out.println("Enter nodes for List 1:");
        for (int i = 0; i < node1; i++) {
            list1.addnode(s.nextInt());
        }

        // Input for list2
        System.out.print("Enter no. of nodes for List2 : ");
        int node2 = s.nextInt();
        System.out.println("Enter nodes for List 2:");
        for (int i = 0; i < node2; i++) {
            list2.addnode(s.nextInt());
        }

        // Create an intersection manually
        // the last 2 nodes of list1 are 4 and 5 and we want list2 to intersect at 4
         list2.head.next.next = list1.head.next.next; //this will create an intersection at node with value 4

        // Find intersection
        Node intersectionnode = findintersectionpoint(list1, list2);
        if (intersectionnode != null) {
            System.out.println("Intersection point : " + intersectionnode.data);
        } else {
            System.out.println("No intersection point");
        }

        s.close();
    }

    // method to find the intersection point of two linked lists
   private static Node findintersectionpoint(LinkedList list1, LinkedList list2) {
        HashSet<Node> nodeset = new HashSet<>();
        Node currentnode1 = list1.head;

        // store all nodes of the first linked list in a set
        while (currentnode1 != null) {
            nodeset.add(currentnode1);
            currentnode1 = currentnode1.next;
        }

        Node currentnode2 = list2.head;

        // traverse the second linked list and check for intersection by reference
        while (currentnode2 != null) {
            if (nodeset.contains(currentnode2)) {
                return currentnode2; // Intersection found
            }
            currentnode2 = currentnode2.next;
        }

        return null; // No intersection
    }
}