public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
	head = null; // by default, class variables refer to null
    }

    public void add(String s) {
	Node temp = new Node(s);
	// inserts at front of the list
	temp.setNext(head);
	head = temp;
    }

    /*
      we need some sort of loop to go through the list
      then print the elements out
     */
    public String toString() {
	String s = "" + head;
	Node temp = head;
	while (temp.getNext() != null) {
	    s = s + temp.getNext().getData();
	    temp = temp.getNext();
	}
	return s;
    }

    
    public void add(int i, String s) {
	int j=0;
	Node temp = head;
	while (temp.getNext() != null) {
	    if (j!=i) {
		temp = head.getNext();
		j++;
	    }
	    else { // j == i
		Node temp2 = new Node(s);
		temp2.setNext(temp);
		break;
	    }
	}
    }

    public String get(int i) {
	Node temp = head;
	for (int j=0; temp.hasNext(); j++) {


	}
    }

}