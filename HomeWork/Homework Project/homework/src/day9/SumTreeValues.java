package day9;

//Question : Write a program to sum up all the elements in a tree

//Created separate class for node and Binary Tree data structure to store store , it has insert and print method


import java.util.Scanner;

public class SumTreeValues {
	
	 //method to sum up all elements in the tree
    public static int sumElements(Node node) {
        if (node == null) {
            return 0;
        }
        //sum of left subtree
        int leftSum = sumElements(node.left);
        
        // sum of right subtree
        int rightSum = sumElements(node.right);
        
        
        return node.data + leftSum + rightSum;
    }
    
    
	
    public static void main(String[] args) {
    	 Scanner s = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
       

        System.out.print("Enter the number of nodes: ");
        int n = s.nextInt();

        System.out.print("Enter values for nodes: ");
        for (int i = 0; i < n; i++) {
            int value = s.nextInt();
            tree.root = tree.insert(tree.root, value);
        }

        //print the in order traversal of the tree(for referance)
        System.out.println("In-order traversal of the binary tree:");
        tree.printinorder(tree.root);
        System.out.println();

        //calculate sum of all elements in the tree
        int sum = sumElements(tree.root);
        System.out.println("Sum of all elements in the binary tree: " + sum);

        s.close();
    }
}

