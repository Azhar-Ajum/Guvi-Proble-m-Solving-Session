package day9;

//Question : Write a program to convert a binary search tree to a sorted doubly linked list.

//Created separate class for node and Binary Tree data structure to store store , it has insert and print method



import java.util.Scanner;


public class BinarysearchtoDoublyLinkedList {
    Node root;
    Node head = null; 
    Node prev = null; 

    //method to convert binary search tree to a sorted doubly linked list
    public void convertToDoublyLinkedList(Node node) {
        if (node == null) {
            return;
        }

        //recurse on the left subtree
        convertToDoublyLinkedList(node.left);

        //process current node
        if (prev == null) {
            head = node; //left most node becomes head of the dll
        } else {
            node.left = prev;
            prev.right = node;
        }
        prev = node; // Update previous node

        //recurse on right subtree
        convertToDoublyLinkedList(node.right);
    }

    
    //method to print doubly linked list from left to right
    public void printDoublyLinkedList() {
        Node current = head;
        System.out.println("Doubly Linked List (Left to Right):");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.right;
        }
        System.out.println();
    }

    
    //main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       BinaryTree tree = new BinaryTree();
       
       BinarysearchtoDoublyLinkedList dll = new BinarysearchtoDoublyLinkedList();

        
        System.out.print("Enter number of nodes : ");
        int n = s.nextInt();

        System.out.print("Enter value for node : ");
        for (int i = 0; i < n; i++) {
            int value = s.nextInt();
            tree.root = tree.insert(tree.root, value);
        }

        // Print the tree in-order (for referance)
        System.out.println("In order traversal of  binary tree:");
        tree.printinorder(tree.root);
        System.out.println();

        //method to convert BST to Doubly Linked List
        dll.convertToDoublyLinkedList(tree.root);

        //print  Doubly Linked List
        dll.printDoublyLinkedList();

        s.close();
    }

   
}


