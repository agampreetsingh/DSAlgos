package Lists;

import java.util.HashMap;
import java.util.Map;

public class LinkedList {

	class Node {
		int data;
		Node next;
	}

	public Node head;
	public Node tail;
	public int size;

	public LinkedList() {
		this.head = null;
		this.tail = this.head;
		this.size = 0;
	}

	public void add(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (this.head == null || this.size == 0) {
			this.head = node;
			this.tail = this.head;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
		this.size++;
	}

	public void addFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = this.head;
		this.head = node;
	}

	public void display() throws Exception {
		this.display(this.head);
	}

	private void display(Node head) throws Exception {
		if (this.size == 0) {
			throw new Exception("Empty List");
		}
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	public Node getNodeAt(int index) throws Exception {
		return getNodeAt(index, this.head);
	}

	private Node getNodeAt(int index, Node head) throws Exception {
		if (this.size < index || 0 > index) {
			throw new Exception("Invalid arguments");
		}
		int i = 0;
		Node curr = head;
		while (index != i) {
			curr = curr.next;
			i++;
		}
		return curr;
	}
	
	public int getSize() {
		return this.getSize(this.head);
	}
	
	public int getSize(Node node) {
		if(node.next==null) {
			return 1;
		}
		int size = getSize(node.next)+1;
		return size;
	}
	
	public int getNthFromLast(int n) throws Exception {
		return this.getNthFromLast(n, this.head);
	}
	
	private int getNthFromLast(int n, Node head) throws Exception {
		if(n<=0 || n>size) {
			throw new Exception("Invalid Arguments");
		}
		
		if(head == null) {
			throw new Exception("Empty List");
		}
		Node mainNode = this.head;
		Node refNode = this.head;
		int count = 0;
		
		while(count!=n) {
			refNode=refNode.next;
			count++;
		}
		
		while(refNode!=null) {
			mainNode=mainNode.next;
			refNode=refNode.next;
		}
		return mainNode.data;
	}
	
	public int getMidElement() throws Exception {
		return this.getMidElement(this.head);
	}
	
	private int getMidElement(Node head) throws Exception {
		if(head==null) {
			throw new Exception("Empty List");
		}
		Node slow = head;
		Node fast = head;
		while(fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow.data;
	}
	
	public int getMidElementN() throws Exception {
		return this.getMidElementN(this.head);
	}
	
	private int getMidElementN(Node head) throws Exception {
		if(head==null) {
			throw new Exception("Empty List");
		}
		int count=0;
		Node curr = head;
		while(count!=this.size) {
			if(count%2==0) {
				curr = curr.next;
			}
			count++;
		}
		return curr.data;
	}
		
	public int getOccurences(int key) throws Exception {
		if(this.size == 0) {
			throw new Exception("Invlaid Index");
		}
		Node curr = this.head;
		int count = 0;
		while(curr!=null) {
			if(curr.data == key) {
				count++;
			}
			curr = curr.next;
		}
		return count;
	}

	int count = 0;
	
	public void getOccurencesR(int key) {
		//return this.getOccurences(key,this.head);
	}
	
	private int getOccurences(int key, Node node) {
		if(node == null) {
			return 0;
		}
		if(node.data == key) {
			return 1 + getOccurences(key,node.next);
		}
		else {
			return getOccurences(key,node.next);
		}
	}
	
	public boolean isLoopPresent() {
		Node curr = this.head;
		Node currFast = this.head;
		while(curr != null && currFast!=null && currFast.next != null) {
			curr = curr.next;
			currFast = currFast.next.next;
			if(currFast == curr) {
				return true;
			}
		}
		return false;
	}
	
	
}
