package mx.itesm.tc1018.linkedlists;

public class LinkedListManager {

	Node head = null;
	
	public void addNode(Node n) {
		////The list is brand new
		if(head == null) {
			head = n;
			head.next = null;
		}
		else {   ///I already have a list with at least ONE node
			Node tmp = head;
			//// Searching for the last node
			while(tmp.next != null) {
				tmp = tmp.next;
			}
			/// I found it and I need to add it to the end
			tmp.next = n;
			//// move the tmp to the last one			
			tmp = tmp.next;
			//// next of last one should be NULL
			tmp.next = null;
		}
		
	}
	
	public int deleteFirstNode() {
		if(head == null) {
			return -1;
		}
		else {
			
			Node tmp = head;
			head = head.next;
			tmp.next =null;  ///This tmp was the head and we disconnect it from the rest of the list
			tmp = null;
			return 1;
		}		
	}
	
	public void updateNode(int ID, String author, String title) {
		
	}
	public void insertNode(int index, Node n) {
		
	}
	public void deleteNode(int ID) {
		
	}
	
	public boolean hasLoop(Node head) {
		return false;
	}
	
	
	public void printList() {
		Node tmp = head;
		while(tmp != null) {
			System.out.println(tmp.title);
			tmp = tmp.next;
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node test1 = new Node("Victor Hugo","Les Miserables",  1);
		Node test2 = new Node("Fiodor Dostoievski","Crime and Punishment",  2);
		Node book3 = new Node("Jordi Rosado","Quiubole Con",  3);
		
		LinkedListManager llMgr = new LinkedListManager();
		llMgr.addNode(test1);
		llMgr.addNode(test2);
		llMgr.addNode(book3);	
		llMgr.printList();
		System.out.println("-------------------------------------");
		llMgr.deleteFirstNode();
		llMgr.printList();
		

	}

}

class Node{
	
	public Node(String author, String title, int ID) {
		this.authorName = author;
		this.title = title;
		this.ID = ID;
	}
	
	String authorName;
	String title;
	int ID;
	Node next;	
}
