package Lists.demo;

public class Client {

	public static void main(String[] args) throws Exception {
	LinkedList list = new LinkedList();
	list.add(30);
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(30);
	list.add(30);
	list.addFirst(5);
	
	list.display();
	System.out.println();
	//System.out.println(list.getNodeAt(2).data);
	//System.out.println(list.getSize());
	System.out.println(list.getNthFromLast(1));
	System.out.println(list.getMidElementN());
	//list.tail.next = list.getNodeAt(2);
	System.out.println(list.isLoopPresent());
	
	}
}
