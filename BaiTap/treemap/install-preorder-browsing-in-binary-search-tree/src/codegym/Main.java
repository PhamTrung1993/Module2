package codegym;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(60);
        tree.root.left = new Node(55);
        tree.root.left.left = new Node(45);
        tree.root.left.right = new Node(57);
        tree.root.right = new Node(100);
        tree.root.right.left = new Node(67);
        tree.root.right.right = new Node(107);

        System.out.println("TreePostOrder:");
        tree.displayTreePostOrder();
        System.out.println("");
        System.out.println("TreePreOrder:");
        tree.displayTreePreOrder();
        System.out.println("");
        System.out.println("TreeInOrder:");
        tree.displayTreeInOrder();
    }
}
