public class ArrayQueue {

    private int head;
    private int tail;
    private int[] queue;
    private int len; // holds number of items in queue

    public ArrayQueue() {
	queue = new int[10];
	head = 0;
	tail = 0;
	len = 0;
    }

    public void enqueue(int a) {
	if (len == queue.length) {
	    System.out.println("Queue is full.");
	}
	else if (tail < queue.length) {
	    queue[tail] = a;
	    tail++;
	    len++;
	}
	else {
	    tail = tail%queue.length;
	    queue[tail] = a;
	    tail++;
	    len++;
	}
    }

    public int dequeue() {
	int tmp = queue[head];
	head++;
	len--;
	return tmp;
    }

    public boolean isEmpty() {
	return len == 0;
    }

    public int front() {
	return queue[head];
    }

    // working on toString()
    // probably doesn't work
    public String toString() {
	String s = "head --> ";
	for (int i=0; i<len; i++) {
	    if (head + i > queue.length) {
	    s = s + queue[head+i] + "--> ";
	    }
	}
    }

}