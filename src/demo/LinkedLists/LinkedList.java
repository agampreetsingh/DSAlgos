package demo.LinkedLists;

public class LinkedList implements List {
	
	private Node head;
	
	private int size;
	
	private Node tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	@Override
	public Node add(int data) {
		if(this.head == null) {
			Node node = new Node();
			node.setData(data);
			node.setNext(null);
			this.head = node;
			this.tail = node;
			this.size = 1;
			return node;
		}
		
		Node node = new Node();
		node.setData(data);
		node.setNext(null);
		this.tail.setNext(node);
		this.tail = node;
		this.size++;
		return node;
	}

	@Override
	public Node addFirst(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(this.head);
		this.head = node;
		this.size++;
		return node;
	}

	@Override
	public Node addAtIndex(int data, int index) throws Exception {
		if(this.size<index) {
			throw new Exception("LinkedList Index Out Of Bounds: "+ index);
		}
		if(index<0) {
			throw new Exception("Invalid Index: "+ index);
		}
		if(index == 0) {
			return this.addFirst(data);
		}
		
		Node node = new Node();
		node.setData(data);
		int indexCounter = 1;
		Node iteratorNode = this.head;
		while(indexCounter!=index) {
			iteratorNode = iteratorNode.getNext();
			indexCounter++;
		}
		Node iteratorsNext = iteratorNode.getNext();
		node.setNext(iteratorsNext);
		iteratorNode.setNext(node);
		return node;
	}

	@Override
	public void display() {
		Node iteratorNode = this.head;
		while(iteratorNode!=null) {
			System.out.print(iteratorNode.getData()+" ");
			iteratorNode = iteratorNode.getNext();
		}
	}
	
	@Override
	public int getSize() {
		return this.size;
	}

	
	// O(1)
	@Override
	public Node removeFirst() {
		Node iteratorNode= head;
		head = iteratorNode.getNext();
		return head;
	}

	// O(1)
	@Override
	public Node removeLast() {
		Node prev= null;
		Node iteratorNode = head;
		
		while(iteratorNode.getNext() != null) {
			prev= iteratorNode;
			iteratorNode = iteratorNode.getNext();
		}
		prev.setNext(null);  
		return head;
	}

	// O(n)
	@Override
	public Node removeAt(int index) throws Exception {
		if(this.size<index) {
			throw new Exception("LinkedList Index Out Of Bounds: "+ index);
		}
		if(index<0) {
			throw new Exception("Invalid Index: "+ index);
		}
		if(index ==0){
			return removeFirst();
		}
		if(this.size == index) {
			return removeLast();
		}
		Node iteratorNode = head;
		
		for(int i =1; iteratorNode != null && i<index -1 ;i++)
		{
			iteratorNode = iteratorNode.getNext();
		}
		Node nextAdd = iteratorNode.getNext().getNext();
		iteratorNode.setNext(nextAdd);
		return head;
	}
	
	@Override
	public void recDisplay() {
		
		reccDisplay(tail);
		
	}

	private void reccDisplay(Node tail) {
		
		
	}
}
