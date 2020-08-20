package demo.datastructures;

public class LinkedList {
	
	class Node{
		private int data;
		private Node next;
	}
	
	private Node head;
	
	private int length;
	
	public LinkedList() {
		this.head = null;
		this.length = 0;
	}
	
	public void addFirst(int data) {
		Node addedNode = new Node();
		addedNode.data = data;
		addedNode.next = null;
		this.head = addedNode;
	}
	
}
