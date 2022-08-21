package codegym;

public class Node {
    protected int element;
    protected Node left;
    protected Node right;

    public Node(int element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }
}
