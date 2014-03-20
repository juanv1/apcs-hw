public class LLDriver {

    public static void main(String[] args) {
	MyLinkedList L = new MyLinkedList();
	L.add("a");
	L.add("b");
	L.add("c");
	L.add("d");
	System.out.println("Testing toString()");
	System.out.println("Linked List: \n" + L);

	System.out.println("Testing add(int i, String s)");
	L.add(1,"e");
	System.out.println("Added e to index 1: \n" + L);
	// L.add(7,"f"); <-- causes exception

	System.out.println("Testing get(int i)");
	System.out.println("Index 3: " + L.get(3));

	System.out.println("Testing set(int i, String s)");
	System.out.println(L.set(3,"replacement"));
	System.out.println("Set something else for index 3: \n" + L);

	System.out.println("Testing remove(int i)");
	System.out.println(L.remove(3));
	System.out.println("Removed index 3: \n" + L);

	System.out.println();

	System.out.println("Testing find(String s)");
	System.out.println("Index of a: " + L.find("a"));
	System.out.println("Index of f: " + L.find("f"));
	System.out.println("Index of d: " + L.find("d"));

	System.out.println();

	System.out.println("Testing length()");
	System.out.println("Length of linked list: " + L.length());
	System.out.println(L);
    }
}
