// Jane Chen and Cardy Wei
// DoubleLL with the ends node connected to form a loop

public class DoubleLL<E> {

    private class Node<E> {
        E data;
        Node<E> next, prev;
	public Node(E d) {
	    data = d; 
	}
        public String toString() { 
	    return "" + data; 
	}
        
        public void setData(E d) { data = d; }
        public E getData() { return data; }
        
        public void setNext(Node<E> n) { next = n; }
        public Node<E> getNext() { return next; }
        
        public void setPrev(Node<E> p) { prev = p; }
        public Node<E> getPrev() { return prev; }
    }
    
    private Node<E> current;
    
    public void insert(E d) {
        Node<E> n = new Node<E>(d);        
        if (current == null) {
            current = n;
	    n.next = n;
	    n.prev = n;
	}
        else {
            n.next = current;
	    n.prev = current.prev;
            if (current.prev != null) {
                current.prev.next = n;
	    }
            current.prev = n;
            current = n;
        }
    }

    public void remove() {
	if (current == null || current.next == current.prev) {
	    current = null;
	}
	else {
	    current.next.prev = current.prev;
	    current.prev.next = current.next;
	    current = current.next;
	}
    }

    public int find(E d) {
	if (current == null) {
	    return -1;
	}
	else if (current.getData() == d) {
	    return 0;
	}
	else {
	    Node <E> tmp = current.getNext();
	    int i=1;
	    while (tmp != current) {
		if (tmp.getData() == d) {
		    return i;
		}
		i++;
		tmp = tmp.getNext();
	    }
	    return -1;
	}
    }
    
    public E getCurrent() { 
	return current.getData(); 
    }
    
    public void forward() {
        if ( current.getNext() != null )
            current = current.getNext();
    }
    
    public void back() {
        if ( current.getPrev() != null )
            current = current.getPrev();
    }
    
    public String toString() {
        if ( current == null )
            return "";        
	Node<E> tmp = current;
	String s = current.getData() + " ";
	tmp = tmp.getNext();
	while (tmp != current) {
	    s = s + tmp.getData() + " ";
	    tmp = tmp.getNext();
	}
	return s;
    }

    /*
    public String toString() {
	if ( current == null )
	    return "";
        while ( current.getPrev() != null )
            current = current.getPrev();
        
        Node<E> tmp = current;
        String s = "";
	while ( tmp != null ) {
            s = s + tmp.getData() + " ";
            tmp = tmp.getNext();
        }        
        return s;
    }
    */
    
    public static void main(String[] args) {
        DoubleLL<String> L = new DoubleLL<String>();
        System.out.println(L);
        L.insert("hello");
        System.out.println(L);
        L.insert("world");
        System.out.println(L);
        L.insert("three");
        System.out.println(L);

        System.out.println(L.getCurrent());
        L.forward();
        System.out.println(L.getCurrent());

        L.insert("inserted");
	System.out.println(L.getCurrent());
        System.out.println(L);

	L.back();
	System.out.println(L.getCurrent());
	System.out.println(L);
	L.remove();
	System.out.println(L.getCurrent());
	System.out.println(L);
	System.out.println(L.find("inserted"));
	System.out.println(L.find("world"));
	System.out.println(L.find("hello"));
	System.out.println(L.find("three"));


    }
}
