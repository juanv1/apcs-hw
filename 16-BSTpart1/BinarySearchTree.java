public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(Node n) {
	root = n;
    }

    public Node search(Node p, int x) {
	while (p != null && p.getData() != x) {
	    if (p.getData() > x) {
		search(p.getLeft(),x);
	    }
	    else { //p.getData() < x
		search(p.getData(),x);
	    }
	}
	return Node;
    }

    public void insert(Node n) {
	Node p = root;
	Node tag = new Node();

    }

}