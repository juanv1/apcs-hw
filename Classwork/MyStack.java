public class MyStack {

    private Node top;
    private int numElts;

    // constructor 1
    public MyStack() {
	top = null;
	numElts = 0;
    }

    // push 2 
    public void push(String s) {
	Node n = new Node(s);
	n.setNext(top);
	top = n;
	numElts++;
    }
    // pop
    public String pop() {
	String s;
	s = top.getData();
	top = top.getNext();
	return s;
	numElts --;
    }
    // peek
    public String peek() {
	return top.getData();
    }

    // isEmpty
    public boolean isEmpty() {
	return top == null;
    }

    // toString 3
    public String toString() {
	String tmp = "";
	Node currentNode = top;
	while (currentNode != null) {
	    tmp = tmp + currentNode.getData() + ", ";
	    currentNode = currentNode.getNext();
	}
	return tmp;
    }
}