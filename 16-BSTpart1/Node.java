public Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int n) {
	data = n;
    }

    public Node(int n, Node L, Node R) {
	data = n;
	left = L;
	right = R;
    }

    public void setData(int n) {
	data = n;
    }

    public int getData() {
	return data;
    }

    public void setChild(Node n) {
	if (left == null) {
	    left = n;
	}
	else if (right == null) {
	    right = n;
	}
    }

    public Node getLeft() {
	return left;
    }

    public Node getRight() {
	return right;
    }

    public boolean isLeaf() {
	return left == null && right == null;
    }

    public String toString() {
	return ""+data;
    }
}