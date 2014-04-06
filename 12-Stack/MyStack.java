public class MyStack {

    private String[] stack;
    private int top;
    private int maxSize;

    public MyStack() {
        stack = new String[10];
	top = -1; // -1 since stack is empty
	maxSize = 10;
    }

    public void push(String s) {
	top++;
	if (top >= maxSize) {
	    growStack();
	}
	stack[top] = s;
    }

    public String pop() {
	String s = stack[top];
	stack[top] = null;
	top--;
	return s;
    }

    public String peek() {
	return stack[top];
    }

    public boolean isEmpty() {
	return top == -1;
    }

    public void growStack() {
	maxSize = maxSize + 10;
	String[] tmp = new String[maxSize];
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
