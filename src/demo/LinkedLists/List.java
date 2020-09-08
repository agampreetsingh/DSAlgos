package demo.LinkedLists;

public interface List {
	Node add(int data);
	Node addFirst(int data);
	Node addAtIndex(int data, int index) throws Exception;
	void display();
	int getSize();
	Node removeFirst();
	Node removeLast();
	Node removeAt(int index) throws Exception;
	void recDisplay();
}
