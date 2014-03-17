import java.io.*;
import java.util.*;

public class Quicksort2 {

    // quicksort that groups duplicate pivots together
    // faster than original quicksort routine

    public int partition(int[] a, int left, int right) {
	int pivot = (int)(Math.random() * (right - left) + left);
	// switch pivot with the farthest right value
	// to get the pivot out of the way
	int temp=a[pivot];
	a[pivot] = a[right];
	a[right] = temp;

	int wall=left;
	for (int i=left; i<right; i++) {
	    if (a[i] < a[right]) {
	    //if (a[i] == a[pivot]) {
		temp = a[wall];
		a[wall] = a[i];
		a[i] = temp;
		wall++;
	    }
	}
	temp = a[wall];
	a[wall] = a[right];
	a[right] = temp;
	return wall;
    }

    public void quicksort(int[] a, int low, int high) {
	if (low < high) {
	    int pivot = partition(a,low,high);
	    quicksort(a,low,pivot-1);
	    quicksort(a,pivot+1,high);
	}
    }  

    public static void main(String[] args) {
	Random r = new Random();
	int[] a = new int[50];
	for (int i=0; i<a.length; i++) {
	    a[i] = r.nextInt(100);
	}
	Quicksort2 qs = new Quicksort2();
	System.out.println(Arrays.toString(a));
	qs.quicksort(a,0,a.length-1);
	System.out.println(Arrays.toString(a));
    }
}
