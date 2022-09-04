package assignment01_03_LinkedList;

public class LinkedList {
	private Node head;  // first node of the list
	private Node tail;  // last node of the list
	private int length = 0;
	
	public LinkedList() {
		head = tail = null;
	}
	
	/** Insert after the last node
	 * @param data data in the new node
	 */
	public void insert(String data) {
		Node insertNode = new Node();
		insertNode.data = data;
		
		if (tail == null) {
			head = tail = insertNode;
		}
		else {
			tail.link = insertNode;
			tail = insertNode;
		}
		
		length += 1;
	}
	
	/*
	/** Insert between the nodes(incomplete)
	 * @param data data in the new node
	 * @param previousNode The node immediately before the new node being inserted
	 
	public void insert(String data, Node previousNode) {
		Node insertNode = new Node();
	}
	*/
	
	/** Delete the last node
	 * 
	 */
	public void delete() {
		Node preNode = new Node();
		
		if (length == 0) {
			System.out.println("The list is empty.");
			return;
		} else {
			for (int i = 0; i < length -2; i++)
				preNode = preNode.link;
			
			preNode.link = null;
			tail = preNode;
			length -= 1;
		}
	}
	
	/*
	/** Delete between the nodes(incomplete)
	 * 
	 * @param data data in the deleted node
	 
	public void delete(String data) {
		
	}
	*/
	
	/** Show the full view of the linked list
	 * 
	 */
	public void print() {
		if (head == null) {
			System.out.println("The list is Empty.");
		} else {
			for (Node i = head; i!= null; i = i.link)
				System.out.print(i.data + " ");
			System.out.println();
		}
	}
}
