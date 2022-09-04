package assignment01_03_LinkedList;

public class Node {
	public String data;
	public Node link;
	
	//Constructors
	public Node() {
		this.data = null;
		this.link = null;
	}
	public Node(String str) {
		this.data = str;
		this.link = null;
	}
	public Node(String str, Node node) {
		this.data = str;
		this.link = node;
	}
	
}
