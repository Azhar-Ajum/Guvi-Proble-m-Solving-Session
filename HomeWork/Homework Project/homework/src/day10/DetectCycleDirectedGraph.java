package day10;

//Question : Create a program to detect a cycle in a directed graph.



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Graph {
	
    private int vertices;
    private List<List<Integer>> adjacencylist; 


    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencylist = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencylist.add(new ArrayList<>());
        }
    }

    //method  add an edge from source to destination
    public void addEdge(int source, int destination) {
        adjacencylist.get(source).add(destination);
    }

    //method to detect cycle in directed graph
    public boolean iscycle() {
        boolean[] visited = new boolean[vertices];
        boolean[] recstack = new boolean[vertices]; //track nodes in the recursion stack

        for (int i = 0; i < vertices; i++) {
            if (dfs(i, visited, recstack)) {
                return true; //cycle detected
            }
        }
        return false; //no cycle found
    }

    //helper method for DFS  - depth first search
    private boolean dfs(int node, boolean[] visited, boolean[] recstack) {
        if (recstack[node]) {
            return true; //cycle detected
        }
        if (visited[node]) {
            return false; //already visited this node
        }

        //mark node as visited and add it to the recursion stack
        visited[node] = true;
        recstack[node] = true;

        //recursion for all adjacent vertices
        for (int neighbor : adjacencylist.get(node)) {
            if (dfs(neighbor, visited, recstack)) {
                return true; //cycle detected in recursion
            }
        }

        //remove node from recursion stack
        recstack[node] = false;
        return false; //no cycle found
    }
}

public class DetectCycleDirectedGraph {
	
	//main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertices = s.nextInt();
        
        Graph graph = new Graph(vertices);

        System.out.print("Enter number of edges: ");
        int edges = s.nextInt();

        System.out.println("Enter the edges source, destination: ");
        for (int i = 0; i < edges; i++) {
            int source = s.nextInt();
            int destination = s.nextInt();
            graph.addEdge(source, destination);
        }

        //check for cycles
        if (graph.iscycle()) {
            System.out.println("Cycle detected in the directed graph");
        } else {
            System.out.println("No cycle found in the directed graph");
        }

        s.close();
    }
}
