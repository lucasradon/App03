package app.exercise.adt;

import app.exercise.visualtree.DrawableTreeElement;

public class Node<T> implements DrawableTreeElement<T> {

    private T t;
    private boolean red;
    private Node<T> right,left;

    public Node(T t){
        this.t = t;
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

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

}
