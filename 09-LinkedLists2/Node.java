import java.io.*;
import java.util.*;

public class Node {
    private String data;
    private Node next; // reference to another node inside this node

    public Node(String s) {
	data = s;
    }
    public void setData(String s) {
	data = s;
    }
    public String getData() {
	return data;
    }
    public void setNext(Node n) {
	next = n;
    }
    public Node getNext() {
	return next;
    }

    public String toString() {
	return "Data: " + data;
    }

}
