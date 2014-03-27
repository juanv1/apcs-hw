import java.io.*;
import java.util.*;

public class myLLIterator<E> implements Iterator<E> {

    private Node<E> currentNode;

    public myLLIterator(Node<E> n) {
	currentNode = n;
    }

    public boolean hasNext() {
	return currentNode!=null;
    }

    public E next() {
	E r = currentNode.getData();
	currentNode=currentNode.getNext();
	return r;
    }

    // removes currentNode
    // I understand the concept but I'm not sure how to implement it
    public void remove() {
	/*
	if (getPrev() != null) {
	    getPrev().setNext(getNext());
	}
	if (getNext() != null) {
	    getNext().setPrev(getPrev);
	}
	next();
	*/
    }
    
}
