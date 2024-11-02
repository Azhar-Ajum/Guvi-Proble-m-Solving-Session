package day8;

//Question : Create a program to split a linked list into two halves

//Created separate class for node and LinkedList data structure to store store , it has insert and print method



import java.util.Scanner;

public class Split_LinkedList {

    //method to split  linked list into two halves
    public static void splitlist(LinkedList list, LinkedList firsthalf, LinkedList secondhalf) {
        if (list.head == null) {
            return;
        }

        Node slow = list.head;
        Node fast = list.head;

        //using two pointers to find the middle of the list  (tortoise and hare method)
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast != null) {
                slow = slow.next;
            }
        }

        //first half starts from the head of original list
        firsthalf.head = list.head;

        //second half starts from the node after middle
        secondhalf.head = slow.next;
        
        //end first half at the middle
        slow.next = null;
    }

    

    public static void main(String[] args) {
    	
        Scanner s = new Scanner(System.in);
        LinkedList list = new LinkedList();

        // Get number of nodes from the user
        System.out.print("Enter the number of nodes: ");
        int n = s.nextInt();

        // Adding nodes to the list based on user input
        System.out.println("Enter the values of the nodes:");
        for (int i = 0; i < n; i++) {
            list.addnode(s.nextInt());
        }

        // Lists to hold the two halves
        LinkedList firsthalf = new LinkedList();
        LinkedList secondhalf = new LinkedList();

        // Split the list into two halves
        splitlist(list, firsthalf, secondhalf);

        // Print the two halves
        System.out.println("First half of the list:");
        list.printlist(firsthalf);

        System.out.println("Second half of the list:");
        list.printlist(secondhalf);

        s.close();
    }
}

