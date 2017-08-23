package edu.pd.ds;

//Java program to print DFS traversal from a given given graph
import java.io.*;
import java.util.*;

//This class represents a directed graph using adjacency list
//representation
class GraphGeeksForGeeksImpl {
	private int V; // No. of vertices
	static int ans=0;
	// Array of lists for Adjacency List Representation
	private LinkedList<Integer> adj[];

	// Constructor
	GraphGeeksForGeeksImpl(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList<>();
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) {
		adj[v].add(w); // Add w to v's list.
	}

	// A function used by DFS
	void DFSUtil(int v, boolean visited[]) {
		// Mark the current node as visited and print it
		visited[v] = true;
			
		//System.out.print(v + " ");

		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> i = adj[v].listIterator();
		
		
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n]){
				DFSUtil(n, visited);
			}
			if(v!=1 && adj[v].size()%2!=0){
				System.out.println(v);
				ans++;
			}
		}
		
//		if(v!=1 && count%2!=0){
//			ans++;
//		}
	}

	// The function to do DFS traversal. It uses recursive DFSUtil()
	void DFS(int v) {
		// Mark all the vertices as not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[V];
        
		// Call the recursive helper function to print DFS traversal
		DFSUtil(v, visited);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		GraphGeeksForGeeksImpl g = new GraphGeeksForGeeksImpl(N+1);
		for (int i = 0; i < M; i++) {
			int c = sc.nextInt();
			int r = sc.nextInt();
			g.addEdge(r , c );
		}
		// 2 1
		// 3 1
		// 4 3
		// 5 2
		// 6 1
		// 7 2
		// 8 6
		// 9 8
		// 10 8
		System.out.println("Following is Depth First Traversal "
				+ "(starting from vertex 2)");

		g.DFS(1);
		System.out.println();
		System.out.println("ans:"+ans);
	}
}