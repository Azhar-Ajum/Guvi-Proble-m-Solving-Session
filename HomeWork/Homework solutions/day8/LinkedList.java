package day8;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

	 Node head;

	    // method to add a new node to linked list
	    public void addnode(int data) {
	        Node newnode = new Node(data);
	        if (head == null) {
	            head = newnode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newnode;
	        }
	    }
	    
	    public  void printlist(LinkedList list) {
	        Node current = list.head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	    
	    
	    
	    public void printlist() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

}
