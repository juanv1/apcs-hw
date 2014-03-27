import java.io.*;
import java.util.*;

public class MyLinkedList<E> implements Iterable<E>{

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public Iterator<E> iterator() {
	return new myLLIterator<E>(head);
    }

    public MyLinkedList() {
	head = null;
	tail = null;
	size = 0;
    }
    
    public void add(E d) {
	Node<E> tmp = new Node<E>(d);
	tmp.setNext(head);
	head = tmp;
	size++;
    }

    public void add(E d, int i) {
	Node<E> n = new Node(d);
	Node<E> front = getNode(i);
	Node<E> back = getNode(i-1);
	if (i == 0) {
	    add(d);
	}
	else if (i == length()) {
	    n.setNext(front);
	    n.setPrev(back);
	    back.setNext(n);
	    front.setPrev(n);
	}
	else {
	    back.setNext(n);
	    n.setNext(front);
	    n.setPrev(back);
	    front.setPrev(n);
	}
	size++;
    }

    public Node<E> set(E d, int i) {
	Node<E> n = new Node(d);
	Node<E> tmp = getNode(i);
	if (i == 0) {
	    n.setNext(tmp.getNext());
	    head = n;
	}
	else if (i == size-1) {
	    n.setNext(tail);
	    getNode(i-1).setNext(n);
	}
	else {
	    Node<E> prev = getNode(i-1);
	    prev.setNext(n);
	    n.setNext(tmp.getNext());
	}
	return tmp;
    }

    public int length() {
	return size;
    }

    public Node<E> getNode(int index) {
	Node<E> tmp = head;
	for (int i=0; i<index; i++) {
	    tmp = tmp.getNext();
	}
	return tmp;
    }

    public String toString() {
	String s= "";
	Node<E> tmp = head;
	while (tmp != null){
	    s = s + tmp.getData() + " ";
	    tmp = tmp.getNext();
	}
	return s;
    }
}
