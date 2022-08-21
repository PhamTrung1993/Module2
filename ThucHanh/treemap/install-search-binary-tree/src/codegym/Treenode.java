package codegym;

import javax.swing.*;

public class Treenode<E> {
    protected E element;
    protected Treenode<E> left;
    protected Treenode<E> right;

    public Treenode(E e) {
        element = e;
    }

}
