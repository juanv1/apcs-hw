import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Node n1;
	n1 = new Node("Tommy");
	System.out.println(n1);
	Node n2 = new Node("Sammy");
	System.out.println(n2);
	n1.setNext(n2);
	System.out.println(n1.getNext());
	n2.setNext(new Node("Clyde"));
	System.out.println(n1.getNext().getNext());
	System.out.println(n2.getNext());
	/* example of removing a node
	n1.setNext(n2.getNext());
	// or n1.setNext(n1.getNext().getNext());
	System.out.println("After removing second node");
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	*/

	Node last = n1.getNext().getNext();
	last.setNext(n1); // creates a loop by connecting last to first

	System.out.println("Looping through the list");
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	System.out.println(n1.getNext().getNext().getNext());
	System.out.println(n1.getNext().getNext().getNext().getNext());

	System.out.println("Testing toString method");
	MyLinkedList m1 = new MyLinkedList();
	m1.add("A");
	m1.add("B");
	m1.add("C");
	System.out.println(m1);

	System.out.println("Testing add(int i, String s)");
	m1.add(1,"D");
	System.out.println(m1);

    }
}