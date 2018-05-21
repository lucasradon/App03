package app.exercise.adt;

import app.exercise.visualtree.DrawableTreeElement;

public class Node<T> implements DrawableTreeElement<T> {

    private T t;
    private boolean red;
    private Node<T> right, left, parent;

    public Node(T t, Node<T> parent){
        this.t = t;
        this.parent = parent;
        this.red = Math.random() < 0.5;
    }

    @Override
    public DrawableTreeElement<T> getLeft() {
        return left;
    }

    @Override
    public DrawableTreeElement<T> getRight() {
        return right;
    }

    @Override
    public boolean isRed() {
        return red;
    }

    @Override
    public T getValue() {
        return t;
    }

    public Node<T> getLeftNode() {
        return left;
    }

    public Node<T> getRightNode() {
        return right;
    }

    public void setRightNode(Node<T> right) {
        this.right = right;
    }

    public void setLeftNode(Node<T> left) {
        this.left = left;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }
}
