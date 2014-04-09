public class MyStack {

    private static Double[] stack;
    private static int top;
    private static int maxSize;

    public MyStack() {
        stack = new Double[10];
	top = -1; // -1 since stack is empty
	maxSize = 10;
    }

    public void push(Double s) {
	top++;
	if (top >= maxSize) {
	    growStack();
	}
	stack[top] = s;
    }

    public Double pop() {
	Double s = stack[top];
	top--;
	return s;
    }

    public Double peek() {
	return stack[top];
    }

    public boolean isEmpty() {
	return top == -1;
    }

    public void growStack() {
	maxSize = maxSize + 10;
	Double[] tmp = new Double[maxSize];
	for (int i=0; i<stack.length; i++) {
	    tmp[i] = stack[i];
	}
	stack = tmp;
    }

    public int getSize() {
	return top + 1;
    }

    public String toString() {
	String s = "";
	if (isEmpty()) {
	    return null;
	}
	for (int i=top; i>=0; i--) {
	    s = s + stack[i] + " ";
	}
	return s;
    }

}
