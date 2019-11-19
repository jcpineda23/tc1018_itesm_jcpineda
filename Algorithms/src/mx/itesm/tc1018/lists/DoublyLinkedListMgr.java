package mx.itesm.tc1018.lists;



/**
 * @author jcpin
 * This class will be used to manage all operations on the list
 *
 */
public class DoublyLinkedListMgr {

	Node head;
	
	// Adding a node to the end of the list
	// This is making the list behave as queue	
	public void addNodeAtEnd(Node n) {		
		//checking if head is null, meaning there is nothing in the list yet
		if(head == null) {
			head = n;
			head.prev = null;
			head.next = null;
		}		
		// comes here if there is at least one node in the list 
		else {
			Node tmp = head;
			// this could be the 2nd or n-th node in the list, so we go to the edge of the list, with this while
			while(tmp.next != null)
				tmp = tmp.next;		
			// connect the node n to the end of the list
			tmp.next = n;
			n.prev = tmp;
			n.next = null;
		}
	}	
	
	/// Insert in O(1)
	
	// Insert based on the ID Value
	
	// Insert at the nth position

	public void deleteNodeAtFront() {
		// checking that the head is not null, otherwise, the list is empty
		// This will continue making the list behave as a queue
		if(head != null) {			
			// moving the head to the next one because the current will deleted
			head = head.next;
			if(head != null)
				head.prev = null;
		}		
	}
	
	
	/// Getting a reference to the first node
	public Node getFront() {		
		if(head != null) {			
			return head;
		}		
		else {
			return null;
		}
	}
	
	// This method will remove the node at the index received in the parameter
	public void removeByIndex(int index) {
		
		Node tmp = head;
		int idx = 0;
		
		while( tmp != null & idx != index ) {
				tmp = tmp.next;
				idx++;
		}		
		//if tmp is not null this means I actually got to the index
		if(tmp != null) {			
			tmp.prev.next = tmp.next;			
			if(tmp.next != null) {
				tmp.next.prev = tmp.prev;
			}	
		}
		// if it is null then we got to the end of the list (there were less elements than the index)
		// e.g. I wanted to remove the 4th element from a list with 3 elements
		else {
			System.out.println("Element non existent");
		}
		
	}
	
	
	
	
	public void printList() {
		Node tmp = head;
		if(tmp == null) {
			System.out.println("The list is empty");
		}
		
		while(tmp != null) {
			System.out.println(tmp.name);
			tmp = tmp.next;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAX_NODES = 5;
		
		DoublyLinkedListMgr mgr = new DoublyLinkedListMgr();
		Node tmp = null;
		
		//Creating nodes in a loop
		for(int i = 0; i < MAX_NODES; i++ ) {
			
			tmp = new Node("Node " + i, i );
			mgr.addNodeAtEnd(tmp);
			
		}
		
		mgr.printList();
		System.out.println("-----------------------------------------------------");
		mgr.removeByIndex(3);
		
		
		mgr.printList();
		

	}

}








