package day4;

//Question :  Write a program to print all possible paths in a grid


import java.util.Scanner;

public class GridsPath {
	
    public static void main(String[] args) {
    	
    	
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the size of the grid (n x n): ");
        int n = s.nextInt();
        
        int[][] matrix = new int[n][n];
        
        
        //getting input from user
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
    	
     //condition for invalid path
        if (row >= n || column >= n || matrix[row][column] == 0) {
        	
        	return pathfound;
        }
        
        //mark the current cell as part of the path
        possiblepath[row][column] = 1;
        

        //if we reached the bottom right cell print the path
        if (row == n - 1 && column == n - 1) {
        	printmatrix(possiblepath, n);
            pathfound = true; // Mark that a path has been found
            
        } else {
            //move down
        	pathfound = findpossiblepaths(matrix, row + 1, column, possiblepath, n, pathfound);
            //move right
        	pathfound = findpossiblepaths(matrix, row, column + 1, possiblepath, n, pathfound);
        }
        
        //backtrack and make 0 for the current cell
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