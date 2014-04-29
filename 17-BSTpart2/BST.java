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

    public void delete(int x) {
	Node p = root;
	Node piggy = null;
	while (p != null && p.getData() != x) {
	    piggy = p;
	    if (x < p.getData())
		p = p.getLeft();
	    else
		p = p.getRight();
	}
	//leaf
	if (p.isLeaf()) {
	    if (p.getData() < piggy.getData())
		piggy.setLeft(null);
	    else 
		piggy.setRight(null);
	}
	// one child
	else if (p.getLeft() != null && p.getRight() == null) {
	    if (p.getData() < piggy.getData()) 
		piggy.setLeft(p.getLeft());
	    else
		piggy.setRight(p.getLeft());
	}
	else if (p.getRight() != null && p.getLeft() == null) {
	    if (p.getData() < piggy.getData()) 
		piggy.setLeft(p.getRight());
	    else
		piggy.setRight(p.getRight());
	}
	// two children
	else if (p.getLeft() != null && p.getRight() != null) {
	    // get the minimum value of the right subtree of p
	    Node min = p.getRight();
	    while (min.getLeft() != null) {
		min = min.getLeft();
	    }
	    p.setData(min.getData());
	    min = null;
	}
	
    }

}
