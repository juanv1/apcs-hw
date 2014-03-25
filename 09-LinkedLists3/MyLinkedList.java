// worked with Emily Liao
public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
	head = new Node("0");
	tail = head;
	size = 0;
    }

    // adds to end of list
    public void add(String s) {
	Node n = new Node(s);
	tail.setNext(n);
	tail = n;
	size++;
    }

    // adds to index i
    public void add(int i, String s) {
	Node temp = new Node(s);
	Node current = head;
	for (int index=0; index < i; index++) {
	    current = current.getNext();
	}
	temp.setNext(current.getNext());
	current.setNext(temp);
	size++;
    }

    // returns node at index i
    public String get(int i) {
	Node current = head.getNext();
	if (i < 0) {
	    return null;
	}
	for (int index=0; index < i; index++) {
	    current = current.getNext();
	}
	return current.getData();
    }

    // returns old value
    public String set(int i, String s) {
	Node temp = new Node(s);
	Node current = head;
	for (int index = 0; index < i ; index++) {
	    current = current.getNext();
	}
	temp.setNext(current.getNext().getNext());
	Node replaced = current.getNext();
	current.setNext(temp);
	return replaced.getData();
    }

    // return the string at i
    public String remove(int i) {
	Node current = head;
	for (int index=0; index<i; index++) {
	    current = current.getNext();
	}
	// skips over the node after current
	Node temp = current.getNext();
	current.setNext(current.getNext().getNext());
	return temp.getData();
    }

    // returns location of first string in list with value s
    public int find(String s) {
	Node current = head;
	for (int i=0; i<length(); i++) {
	    if (current.getData() == s) {
		return i-1;
	    }
	    current = current.getNext();
	}
	return -1;
    }

    public int length() {
	return size;
    }

    // prints out linked list
    public String toString() {
	String s = head + "\n";
	Node temp = head;
	while (temp.getNext() != null) {
	    s = s + "Data: " + temp.getNext().getData() + "\n";
	    temp = temp.getNext();
	}
	return s;
    }
}
