package codegym;

import javax.swing.tree.TreeNode;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected Treenode<E> root;
    protected int size = 0;

    public BST() {

    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    @Override
    public boolean insert(E e) {
        if (root == null){
            root = createNewNode(e);
        }
        else {
            Treenode<E> parent = null;
            Treenode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else return false;
            }
            if (e.compareTo(parent.element) < 0){
                parent.right = createNewNode(e);
            }
            else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }
    protected Treenode<E> createNewNode(E e) {
        return new Treenode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }
    protected void inorder(Treenode<E> root){
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
