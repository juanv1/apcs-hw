import java.io.*;
import java.util.*;

public class MedianHeap {

    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    // having trouble understand how to use built in priority queue
    // so I tried to get help from online sources

    // I still don't really understand how this works
    // errors everywhere

    /*
    public class MyComparator implements Comparator<Integer> {
	public double compare (double x, double y) {
	    return y - x;
	}
    }

    public MedianHeap() {
	minHeap = new PriorityQueue();
	maxHeap = new PriorityQueue(1,new MyComparator());
    }

    public double getMedian() {
	int size = minHeap.size() + maxHeap.size();
	// if size is even, get average of middle two
	// if size is odd, get middle
	if (size%2 == 0) {
	    // peek() returns root
	    return (double) ((minHeap.peek() + maxHeap.peek()) / 2);
	}
	else {
	    if (maxHeap.size() > minHeap.size()) {
		return (double) maxHeap.peek();
	    }
	    else {
		return (double) minHeap.peek();
	    }
	}
    }
    
    public double findMedian(int[] array) {
	double median = Integer.MAX_VALUE;
	for (int i=0; i<array.length; i++) {
	    adjustHeaps(median);
	    if (array[i] <= median) {
		maxHeap.add(array[i]);
	    }
	    else {
		minHeap.add(array[i]);
	    }
	    median = getMedian();
	}
	return median;
    }
    */
}
