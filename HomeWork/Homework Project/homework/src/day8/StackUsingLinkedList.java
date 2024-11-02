package day8;


//Question : Write a program to implement a stack using a linked list

//Created separate class for node and LinkedList data structure to store store , it has insert and print method

import java.util.Scanner;

class Stack {
	
    LinkedList list = new LinkedList();

    //method to push an element into the stack
    public void push(int data) {
        //adding  new node at the beginning of  linked list
        Node newnode = new Node(data);
        newnode.next = list.head;
        list.head = newnode;
    }

    //method to pop  element from the stack
    public int pop() {
        if (list.head == null) {
            System.out.println("Stack is empty");
            return -1; 
        }
        int poppedata = list.head.data;
        list.head = list.head.next;
        return poppedata;
    }

    //method to peek at top element of  stack
    public int peek() {
        if (list.head == null) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return list.head.data;
    }

    //method to print stack
    public void printStack() {
        list.printlist();
    }
}

public class StackUsingLinkedList {
	
	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack stack = new Stack();

        System.out.print("Enter number of elements to push into stack: ");
        int n = s.nextInt();

        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            stack.push(s.nextInt());
        }

        System.out.println("Current Stack:");
        stack.printStack();

        System.out.println("Top element is: " + stack.peek());

        //example of popping an element
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after popping:");
        stack.printStack();
        
        System.out.println("Top element is: " + stack.peek());

        s.close();
    }
}
