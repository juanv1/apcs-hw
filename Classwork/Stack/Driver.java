public class Driver {

    public static void main(String[] args) {
	MyStack stack = new MyStack();
	System.out.println(stack);
	stack.push("one");
	stack.push("two");
	stack.push("three");
	System.out.println(stack);
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());

	stack.push("hello");
	stack.push("world");
	System.out.println(stack.peek());
    }
}
