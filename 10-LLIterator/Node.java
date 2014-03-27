public class Node<E> {

    private E data;
    private Node<E> next;
    private Node<E> prev;

    public Node(E d) {
	data = d;
	next = null; // null by default
	prev = null;
    }

    public void setData(E d) {
	data = d;
    }

    public E getData() {
	return data;
    }

    public void setNext(Node<E> n){
	next = n;
    }

    public Node<E> getNext() {
	return next;
    }

    public void setPrev(Node<E> p) {
	prev = p;
    }

    public Node<E> getPrev() {
	return prev;
    }

    public String toString() {
	return ""+data;
    }
}
