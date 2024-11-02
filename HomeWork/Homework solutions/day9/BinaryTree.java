package day9;

 class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}


public class BinaryTree {
	
	
	    Node root;

	    //method to insert a new node in binary tree
	    public Node insert(Node node, int data) {
	        if (node == null) {
	            return new Node(data);
	        }
	        if (data < node.data) {
	            node.left = insert(node.left, data);
	        } else {
	            node.right = insert(node.right, data);
	        }
	        return node;
	    }

	    //method to print tree in-order 
	    public void printinorder(Node node) {
	        if (node == null) {
	            return;
	        }
	        printinorder(node.left);
	        System.out.print(node.data + " ");
	        printinorder(node.right);
	    }
}



