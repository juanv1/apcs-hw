public class LLDriver {

    public static void main(String[] args) {
	MyLinkedList L = new MyLinkedList();
	System.out.println("When initialized:\n" + L);
	L.add("a");
	L.add("b");
	L.add("c");
	L.add("d");

	System.out.println("---------------------");

	System.out.println("Testing toString()");
	System.out.println("Linked List: \n" + L);

	System.out.println("---------------------");

	System.out.println("Testing add(int i, String s)");
	L.add(2,"e");
	System.out.println("Added e to index 2: \n" + L);
	// L.add(7,"f"); <-- causes exception

	System.out.println("---------------------");

	System.out.println("Testing get(int i)");
	System.out.println("Index 0: " + L.get(0));
	System.out.println("Index 1: " + L.get(1));
	System.out.println("Index 2: " + L.get(2));
	System.out.println("Index 3: " + L.get(3));
	System.out.println("Index 4: " + L.get(4));

	System.out.println("---------------------");

	System.out.println("Testing set(int i, String s)");
	System.out.println(L.set(3,"replacement"));
	System.out.println("Set replacement for index 3: \n" + L);

	System.out.println("---------------------");

	System.out.println("Testing remove(int i)");
	System.out.println(L.remove(3));
	System.out.println("Removed index 3: \n" + L);

	System.out.println("---------------------\n");

	System.out.println("Testing find(String s)");
	System.out.println("Index of a: " + L.find("a"));
	System.out.println("Index of b: " + L.find("b"));
	System.out.println("Index of c: " + L.find("c"));
	System.out.println("Index of d: " + L.find("d"));
	System.out.println("Index of e: " + L.find("e"));

	System.out.println("---------------------\n");

	System.out.println("Testing length()");
	System.out.println("Length of linked list: " + L.length());
	System.out.println(L);
    }
}
