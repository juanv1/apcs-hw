public class Driver {

    public static void main(String[] args) {
	MyStack ms = new MyStack();
	System.out.println(ms);
	ms.push("one");
	ms.push("two");
	ms.push("three");
	System.out.println(ms.peek());
	System.out.println(ms.toString());

	System.out.println(ms.pop());
	System.out.println(ms.peek());
	System.out.println(ms);

    }

}
