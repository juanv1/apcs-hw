import java.io.*;
import java.util.*;

public class SpeedTest {

    public static void main(String[] args) {
	HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
	TreeMap<Integer,Integer> tree = new TreeMap<Integer,Integer>();

	long startHash = System.currentTimeMillis();
	for (int i=0; i<1000000; i++)
	    hash.put(i, (int)Math.random()*1000000);
	long stopHash = System.currentTimeMillis();

	long startTree = System.currentTimeMillis();
	for (int i=0; i<1000000; i++)
	    tree.put(i, (int)Math.random()*1000000);
	long stopTree = System.currentTimeMillis();

	System.out.println("Adding 1,000,000 Integers into HashMap and TreeMap:");
	System.out.println("HashMap: " + (stopHash - startHash));
	System.out.println("TreeMap: " + (stopTree - startTree));

    }

}
