// version of MyLinkedList with dummy node as head
// changed so head does not count as index 0
public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
	head = new Node("0");
    }

    // adds to front of list
    public void add(String s) {
	Node temp = new Node(s);
	temp.setNext(head.getNext());
	head.setNext(temp);
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

    // adds to index i
    public void add(int i, String s) {
	Node temp = new Node(s);
	Node current = head;
	for (int index=0; index < i; index++) {
	    current = current.getNext();
	}
	temp.setNext(current.getNext());
	current.setNext(temp);
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
	for (int i=0; i<length()+1; i++) {
	    if (current.getData() == s) {
		return i-1;
	    }
	    current = current.getNext();
	}
	return -1;
    }

    public int length() {
	int count = 0;
	Node current = head;
	while (current.getNext() != null) {
	    count++;
	    current = current.getNext();
	}
	return count;
    }

}
