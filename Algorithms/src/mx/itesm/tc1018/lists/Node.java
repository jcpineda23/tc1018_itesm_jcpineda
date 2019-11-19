package mx.itesm.tc1018.lists;

public class Node {

	public Node(String name, int id) {
		this.name = name;
		this.ID = id;		
	}
	
	String name;
	int ID;
	
	Node next;
	Node prev;
	
}
