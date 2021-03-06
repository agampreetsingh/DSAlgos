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
		// TODO Auto-generated method stub
		return null;
	}

	// O(1)
	@Override
	public Node removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	// O(n)
	@Override
	public Node removeAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void recDisplay() {
		// TODO Auto-generated method stub
	}
}
