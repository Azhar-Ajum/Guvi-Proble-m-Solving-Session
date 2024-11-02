package day10;

//Question :Implement a program to find the minimum spanning tree using Kruskal's algorithm

//MST - Minimum Spanning Tree

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Edge {
    int source, destination, weight;

    Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

class Graph_ {
    int vertices, edges;
    Edge[] edge;

    Graph_(int v, int e) {
        vertices = v;
        edges = e;
        edge = new Edge[e];
    }

    //find set of an element
    int find(int parent[], int i) {
        if (parent[i] == -1) {
            return i;
        }
        return find(parent, parent[i]);
    }

    //union of two sets
    void union(int parent[], int x, int y) {
        parent[x] = y;
    }

    //Kruskal's algorithm to find the MST - minimum spanning tree
    void kruskalMST() {
        Edge[] result = new Edge[vertices]; //this will store the resultant MST
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1); //initialize all vertices as separate sets

        //sort all edges in non-decreasing order of their weight
        Arrays.sort(edge, Comparator.comparingInt(e -> e.weight));

        int e = 0; // Count of edges in the MST
        int i = 0; // Index variable for sorted edges
        
        while (e < vertices - 1) {
            //pick  smallest edge and increment the index
            Edge nextedge = edge[i++];

            //find the sets of vertices of picked edge
            int x = find(parent, nextedge.source);
            int y = find(parent, nextedge.destination);

            //if including this edge does not cause a cycle
            if (x != y) {
                result[e++] = nextedge; //include it in the result
                union(parent, x, y); //union the sets
            }
        }

        //print the resulting MST
        System.out.println("Edges in the Minimum Spanning Tree:");
        for (int j = 0; j < e; j++) {
            System.out.println("("+result[j].source + " , " + result[j].destination+")" + " - " + result[j].weight);
        }
    }
}

public class KruskalAlgorith_MST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();

        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        Graph_ graph = new Graph_(vertices, edges);

        System.out.println("Enter the edges source, destination,  weight:");
        for (int i = 0; i < edges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            int weight = scanner.nextInt();
            graph.edge[i] = new Edge(source, destination, weight);
        }

        //Kruskal's algorithm method
        graph.kruskalMST();

        scanner.close();
    }
}

