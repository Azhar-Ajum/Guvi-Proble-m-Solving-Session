package day9;

//Question : Create a program to find all root-to-leaf paths in a binary tree

//Created separate class for node and Binary Tree data structure to store store , it has insert and print method

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class PathFinderTree {
    Node root;

    //method to find all root to leaf path
    public void findAllRootToLeafPaths(Node node) {
        List<Integer> path = new ArrayList<>();
        findPathsRecursive(node, path);
    }

    //helper method to recursively find paths from root to leaf nodes
    private void findPathsRecursive(Node node, List<Integer> path) {
        if (node == null) {
            return;
        }

        //add current node to the path
        path.add(node.data);

        //if its a leaf node print the path
        if (node.left == null && node.right == null) {
            System.out.println(path);
        } else {
            //recursively call for left and right children
            findPathsRecursive(node.left, new ArrayList<>(path));
            findPathsRecursive(node.right, new ArrayList<>(path));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();  // Your existing BinaryTree class
        PathFinderTree pathfinder = new PathFinderTree();
        

        System.out.print("Enter number of nodes: ");
        int n = scanner.nextInt();

        System.out.print("Enter value for node: ");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            tree.root = tree.insert(tree.root, value);
        }

        //print the in-order traversal of the tree(for referance)
        System.out.println("In order traversal of  binary tree:");
        tree.printinorder(tree.root);
        System.out.println();

        
        System.out.println("All root-to-leaf paths:");
        
        pathfinder.findAllRootToLeafPaths(tree.root); // Use the root from BinaryTree

        scanner.close();
    }
}
