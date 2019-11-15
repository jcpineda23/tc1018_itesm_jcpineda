package mx.itesm.tc1018.graphs;

import java.util.LinkedList;

public class GraphAdjList {
	
	int n; //Size of the array stored in a primitive int
	
	//
	LinkedList<Integer> adjListArray[];  
	//
	LinkedList<LinkedList> adjList;
	
	
	@SuppressWarnings("unchecked")
	public GraphAdjList(int i) {
		
		this.n= i;
		
		adjListArray = new LinkedList[i];
		
		for(int j =0; j < n; j++) {
			adjListArray[j] = new LinkedList<Integer>();
		}
					
	}
	//////
	// Create an undirected graph
	// [0] -> 1
	// [1] -> 0 -> 2
	// [2] -> 1
	
	public void addEdge(int source, int destination) {
		///Create the connection from-to each other
		adjListArray[source].add(destination);		
		adjListArray[destination].add(source);
	}
	
	public void printGraph() { 
		System.out.println("Printing the graph");
		System.out.println("----------------------------------------------");
		for(int i = 0; i < this.n; i++) {			
			System.out.println("Connections for vertix :" + i);
			
			for(Integer current: adjListArray[i]) {
				System.out.print(current + " ->");
			}
		}
	}
	
	public static void main(String[] args) {
		
		GraphAdjList g = new GraphAdjList(10);
		g.addEdge(0,1);
		g.addEdge(1,3);
		
	}
}
