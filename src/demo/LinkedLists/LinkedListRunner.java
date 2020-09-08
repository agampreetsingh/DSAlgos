package demo.LinkedLists;

public class LinkedListRunner {

	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll.getSize());
		ll.add(50);
		ll.add(60);
		System.out.println(ll.getSize());
		ll.display();
		ll.addAtIndex(5, 6);
		ll.display();
	}

}
