import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	MyLinkedList<String> L = new MyLinkedList<String>();
	L.add("one");
	L.add("two");
	L.add("three");
	L.add("four");
	L.add("five",3);
	System.out.println(L);
	Iterator<String> it = L.iterator();
	while (it.hasNext())
	    System.out.println(it.next());
	System.out.println("Node at 3: " + L.getNode(3));
	System.out.println("Size of linked list: " + L.length());
	System.out.println("Set 'six' for index 4: " + L.set("six",4));
	System.out.println(L);
    }
}
