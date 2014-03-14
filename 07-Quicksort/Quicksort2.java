import java.io.*;
import java.util.*;

public class Quicksort2 {

    public int partition(int[] a, int left, int right) {
	int pivot = left + Math.Random() * (right - low);
	// swap pivot with right value
	int temp=a[pivot];
	a[pivot] = a[right];
	a[right] = temp;
	int wall=left;
	for (int i=left; i<right-1; i++) {
	    if (a[i] > a[right]) { // note: a[right] now holds the pivot value
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

    public int[] quicksort(int[] a) {
	if (a.length <= 1) {
	    return a;
	}
    }

}