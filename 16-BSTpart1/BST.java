public class BST {

    private Node root;

    public BST() {
	root = null;
    }

    public BST(Node n) {
	root = n;
    }

    public Node search(int x) {
	Node p = root;
	while (p!=null && p.getData()!=x) {
	    if (p.getData()>x)
		p = p.getLeft();
	    else
		p = p.getRight();
	}
	return p;    
    }

    // recursive search
    public Node search2(Node p, int x) {
	while (p != null && p.getData() != x) {
	    if (p.getData() > x) {
		search2(p.getLeft(),x);
	    }
	    else { //p.getData() < x
		search2(p.getRight(),x);
	    }
	}
	return p;
    }

    public void insert(int x) {
	Node p = root;
	Node piggy = null;
	while (p != null && p.getData() != x) {
	    piggy = p;
	    if (x < p.getData()) 
		p = p.getLeft();
	    else 
		p = p.getRight();
	}
	// prevents from inserting if there's a duplicate
	if (p.getData() != x) {
	    if (x < piggy.getData())
		piggy.setLeft(new Node(x));
	    else // (x > piggy.getData())
		piggy.setRight(new Node(x));
	}
    }

}
