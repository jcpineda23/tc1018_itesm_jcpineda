package mx.itesm.tc1018.linkedlists;

public class CircularLinkedListManager {
	
	CircularNode head;
	CircularNode last;
	
	public CircularLinkedListManager() {
		head = null;
		last = null;
	}
	
	public void printList() {
		//Creating a temp reference
		CircularNode tmp;
		
		tmp = head;
		
		while(tmp != last) {
			System.out.println("Name :" + tmp.name);
			tmp = tmp.next;
		}
		if(tmp == last) {
			System.out.println("Name :" + tmp.name);
		}		
	}
	
	public void insertNodeAtEnd(CircularNode n) {
		//// Inserting for the first time, head and last will be null
		if(head == null) {
			head =n;
			last = n;
		}
		// When we already have at least one node, we can insert assuming
		// the pointers have already been initiated with a value (therefore we 
		// won't have null pointer exceptions)
		else {
			n.next = head;
			last.next = n;	
			last = n;
		}
	}
	
	public void deleteNodeAtBeginning() {
		CircularNode tmp = head;
		if(last != null & head != null) {
			head = head.next;
			last.next = tmp.next;
			
			tmp.next = null;
			tmp = null;			
		}
		
	}

	public void insertTestNodes(CircularLinkedListManager mgr, int n) {
		CircularNode node = null;
		for(int i =0; i < n; i++) {
			 node = new CircularNode("Test " + i);
			mgr.insertNodeAtEnd(node);
		}
	}
	
	public static void main(String[] args) {
		
		CircularLinkedListManager mgr = new CircularLinkedListManager();
		mgr.insertTestNodes(mgr, 10);

		mgr.printList();
		
		mgr.deleteNodeAtBeginning();
		mgr.deleteNodeAtBeginning();
		mgr.deleteNodeAtBeginning();
		mgr.deleteNodeAtBeginning();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		mgr.printList();
	}
}
class CircularNode{
		
		public CircularNode(String n) {
			this.name = n;
		}
		
		
		String name = "";
		CircularNode next;
	}

class Song{
	int ID;
	String songName;
	String artist;
	String album;
	String year;
}


