import java.io.*;
import java.util.*;

public class Quickselect {

    public static int quickselect(Integer[] a, int k, int low, int high) {
	if (low >= high) {
	    return a[low];
	}
	else {
	    // select pivot
	    int pivot = low + (int)(Math.random() * (high - low));

	    // parition
	    ArrayList<Integer> lower = new ArrayList<Integer>();
	    ArrayList<Integer> upper = new ArrayList<Integer>();

	    for (int i=low; i<=high; i++) {
		// does not include pivot 
		if (i != pivot) {
		    if (a[i] < a[pivot]) {
			lower.add(a[i]);
		    }
		    else {
			upper.add(a[i]);
		    }
		}
	    }

	    // copy somewhat ordered numbers into new arraylist
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    for (int i=0; i<lower.size(); i++) {
		result.add(lower.get(i));
	    }
	    result.add(a[pivot]);
	    for (int i=0; i<upper.size(); i++) {
		result.add(upper.get(i));
	    }
	    Integer[] temp = result.toArray(new Integer[]{});

	    // if the pivot chosen earlier is the kth number
	    // note: lower.size() is where the pivot is
	    if (k == lower.size()) {
		return result.get(lower.size());
	    }
	    else if (k < lower.size()) {
		return quickselect(temp,k,low,lower.size()-1);
	    }
	    else if (k > lower.size()) {
		return quickselect(temp,k,lower.size()+1,high);
	    }
	    return -1;
	}
    }

    // compiles but doesn't work
    // having trouble with this
    public static void main(String[] args) {
	Integer[] a = {8,3,1,6,8,2,2,6,8,9,0,3};
	System.out.println(quickselect(a,1,0,a.length-1));	
	System.out.println(quickselect(a,2,0,a.length-1));	
	System.out.println(quickselect(a,3,0,a.length-1));	
	System.out.println(quickselect(a,4,0,a.length-1));
	
    }
}
