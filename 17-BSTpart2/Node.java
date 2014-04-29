public class Node {

    private int data;
    private Node left,right;

    public Node(int n) {
	data = n;
	left = right = null; //left and right are null by default
	//right = null;
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

    /*
    public void setChild(Node n) {
	if (left == null && n.getData() < this.getData()) {
	    left = n;
	}
	else if (right == null && n.getData() >= this.getData()) {
	    right = n;
	}
    }
    */

    public void setLeft(Node n) {
	left = n;
    }

    public Node getLeft() {
	return left;
    }

    public void setRight(Node n) {
	right = n;
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
