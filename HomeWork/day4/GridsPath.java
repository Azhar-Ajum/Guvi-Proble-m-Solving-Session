package day4;

//Question :  Write a program to print all possible paths in a grid


import java.util.Scanner;

public class GridsPath {
	
    public static void main(String[] args) {
    	
    	
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the size of the grid (n x n): ");
        int n = s.nextInt();
        
        int[][] matrix = new int[n][n];
        
        
        //Getting input from user
        System.out.println("Enter matrix 0s and 1s only : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        
        

        System.out.println("Possible paths:");
        int[][] possiblepath = new int[n][n];
        boolean pathfound = false; 
        
        pathfound = findpossiblepaths(matrix, 0, 0, possiblepath, n, pathfound);
        
        if (!pathfound) {
            System.out.println("There is no possible path");
        }
        
        s.close();
    }
    
    
    

    private static boolean findpossiblepaths(int[][] matrix, int row, int column, int[][] possiblepath, int n, boolean pathfound) {
    	
    	
        // condition for invalid path
        if (row >= n || column >= n || matrix[row][column] == 0) {
        	
        	return pathfound;
        }
        
        // Mark the current cell as part of the path
        possiblepath[row][column] = 1;
        

        // if we reached the bottom right cell print the path
        if (row == n - 1 && column == n - 1) {
        	printmatrix(possiblepath, n);
            pathfound = true; // Mark that a path has been found
            
        } else {
            // Move down
        	pathfound = findpossiblepaths(matrix, row + 1, column, possiblepath, n, pathfound);
            // Move right
        	pathfound = findpossiblepaths(matrix, row, column + 1, possiblepath, n, pathfound);
        }
        
        // Backtrack and make 0 for the current cell
        possiblepath[row][column] = 0;
        
        return pathfound;
    }
    
    

   private static void printmatrix(int[][] possiblepath, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(possiblepath[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}















//package Day4;
//
//import java.util.Scanner;
//
//public class GridsPath {
//    static int[][] matrix;
//    static int n;
//    static boolean pathFound = false; // To check if any path is found
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.print("Enter the size of the grid (n x n): ");
//        n = scanner.nextInt();
//        
//        matrix = new int[n][n];
//        System.out.println("Enter the matrix (0s and 1s only): ");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = scanner.nextInt();
//            }
//        }
//        
//        System.out.println("Possible paths:");
//        int[][] pathMatrix = new int[n][n];
//        findPaths(0, 0, pathMatrix);
//        
//        if (!pathFound) {
//            System.out.println("There is no possible path");
//        }
//        
//        scanner.close();
//    }
//
//    static void findPaths(int row, int col, int[][] pathMatrix) {
//        // Base conditions for invalid path
//        if (row >= n || col >= n || matrix[row][col] == 0) return;
//        
//        // Mark the current cell as part of the path
//        pathMatrix[row][col] = 1;
//
//        // If we reached the bottom-right cell, print the path
//        if (row == n - 1 && col == n - 1) {
//            printMatrix(pathMatrix);
//            pathFound = true; // Mark that a path has been found
//        } else {
//            // Move down
//            findPaths(row + 1, col, pathMatrix);
//            // Move right
//            findPaths(row, col + 1, pathMatrix);
//        }
//        
//        // Backtrack: unmark the current cell
//        pathMatrix[row][col] = 0;
//    }
//
//    static void printMatrix(int[][] pathMatrix) {
//    	
//    	
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(pathMatrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//}
