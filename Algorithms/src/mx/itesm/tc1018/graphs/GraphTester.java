package mx.itesm.tc1018.graphs;

public class GraphTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g = new Graph();
		Vertex v1 = new Vertex(1, "JCP");
		Vertex v2 = new Vertex(1, "ABC");
		g.addVertix(v1);
		g.addVertix(v2);
		
		g.addConnection(v1.ID, v2);
		
		System.out.println(g.myGraph.get(0).name );
		System.out.println(g.myGraph.get(0).next.name);
		
		// Print graph
		// Copy graph (you will need to use an extra data structure)
		// Remove connection 
		
	}

}
