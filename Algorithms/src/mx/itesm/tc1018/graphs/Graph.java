package mx.itesm.tc1018.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Graph {
	
	List<Vertex> myGraph = new ArrayList<Vertex>();
	
	
	public void addVertix(Vertex v) {
		// Hash number comparison
		if(! myGraph.contains(v)) {
			myGraph.add(v);
		}
	}
	
	
	
	public void addConnection(int origin, Vertex v) {
		// First add to the main list
		if(myGraph.contains(v)) {
			// IF this element is NOT in the graph I am adding it 
			//myGraph.add(v);
			// I am going through the list of vertices (graph)
			ListIterator<Vertex> it = myGraph.listIterator();
			Vertex tmp = null;
			Vertex tmp_connection = null;
			// Once found Add to that list	
			
			// while my graph has vertices
			while(it.hasNext()) {
				//Take the current Vertex
				tmp = (Vertex) it.next();
				// If I find the vertex
				if(tmp.ID == origin) {
					/// Add the connection like a regular linked list
					tmp_connection = tmp;
					while(tmp_connection.next != null) {
						tmp_connection = tmp_connection.next;						
					}
					tmp_connection.next = v;
					break;			
				}
			}
			
			
		}
	}
	
}
