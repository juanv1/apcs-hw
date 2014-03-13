import java.io.*;
import java.util.*;

public class Quicksort {

    public static Integer[] quicksort(Integer[] A) {
	if (A.length <= 1) {
	    return A;
	}
	else {
	    // select pivot
	    int pivot = (int)(Math.random() * A.length);

	    // partition
	    ArrayList<Integer> lower = new ArrayList<Integer>();
	    ArrayList<Integer> upper = new ArrayList<Integer>();

	    for (int i=0; i<A.length; i++) {
		// splits everything except the pivot
		if (i != pivot) {
		    if (A[i] < A[pivot]) {
			lower.add(A[i]);
		    }
		    else { //if (A[i] >= A[pivot])
			upper.add(A[i]);
		    }
		}
	    }
	    Integer[] lowerA = lower.toArray(new Integer[]{});
	    Integer[] upperA = upper.toArray(new Integer[]{});
	    // recursive part
	    lowerA = quicksort(lowerA);
	    upperA = quicksort(upperA);

	    ArrayList<Integer> total = new ArrayList<Integer>();
	    for (int i=0; i<lowerA.length; i++) {
		total.add(lowerA[i]);
	    }
	    total.add(A[pivot]);
	    for (int i=0; i<upperA.length; i++) {
		total.add(upperA[i]);
	    }
	    Integer[] result = total.toArray(new Integer[]{});
	    return result;
	}
    }

    public static String toString(Integer[] a) {
	String s = "{ ";
	for (int i : a) {
	    s = s + i + " ";
	}
	s = s + "}";
	return s;
    }

    public static void main(String[] args) {
	Random r = new Random();
	Integer[] a = new Integer[50];
	for (int i=0; i<a.length; i++) {
	    a[i] = new Integer(r.nextInt(100));
	}
	System.out.println(toString(quicksort(a)));
    }
}
