package day9;

//Question : Create a program to find the lowest common ancestor (LCA) of two nodes in a binary tree

//Created separate class for node and Binary Tree data structure to store store , it has insert and print method

//LCA- lowest common ancestor

import java.util.Scanner;

public class LCABinaryTree {
	
	
	 //method to find  LCA of two nodes
    public static Node findLCA(Node node, int n1, int n2) {
       
        if (node == null) {
            return null;
        }

        //if either n1 or n2 matches with the root's data return root
        if (node.data == n1 || node.data == n2) {
            return node;
        }

        //look for keys in left and right subtrees
        Node leftLCA = findLCA(node.left, n1, n2);
        Node rightLCA = findLCA(node.right, n1, n2);

        //if both of the above calls return non-null this node is the LCA
        if (leftLCA != null && rightLCA != null) {
            return node;
        }

        //otherwise return the non-null child
        if (leftLCA != null) {
            return leftLCA; //return left LCA if it is non-null
        } else {
            return rightLCA; //otherwise return right LCA
        }
    }
	
	
	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        Node root = null;

        
        System.out.print("Enter the number of nodes : ");
        int n = s.nextInt();

        System.out.print("Enter value for node : ");
        for (int i = 0; i < n; i++) {
            int value = s.nextInt();
            root = tree.insert(root, value);
        }

        //print the in-order traversal of the tree
        System.out.println("In-order traversal of the binary tree: ");
        tree.printinorder(root);
        System.out.println();

        // the two nodes to find their LCA
        System.out.print("Enter the first node for LCA: ");
        int n1 = s.nextInt();
        System.out.print("Enter the second node for LCA: ");
        int n2 = s.nextInt();

        //find the LCA of two nodes
        Node lca = findLCA(root, n1, n2);
        
        if (lca != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lca.data);
        } else {
            System.out.println("LCA does not exist.");
        }

        s.close(); 
    }

   
}

