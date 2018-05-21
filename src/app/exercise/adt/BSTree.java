package app.exercise.adt;

import app.exercise.algebra.CompRational;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public class BSTree<E> extends AbstractCollection<E> implements Iterable<E> {

    private Node<E> root;

    public BSTree(Node<E> root) {
        this.root=root;
    }

    @Override
    public boolean add(E element) {
        return insert(root, element);
    }

    private boolean insert(Node<E> node, E element) {

        CompRational nodeValue = (CompRational) node.getValue();
        int result = nodeValue.compareTo((CompRational) element);
        if (result < 0){
            if (node.getRight() == null){
                node.setRightNode(new Node<>(element, node));
            } else {
                insert(node.getRightNode(),element);
            }
            return true;
        } else if (result > 0){
            if (node.getLeft() == null){
                node.setLeftNode(new Node<>(element, node));
            } else {
                insert(node.getLeftNode(),element);
            }
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean remove(Object o) {
        return remove(root, (E) o);
    }

    private boolean remove(Node<E> node, E element) {

        CompRational nodeValue = (CompRational) node.getValue();
        int result = nodeValue.compareTo((CompRational) element);
        if (result == 0) {
            if (node.getRightNode() == null && node.getLeftNode() == null) {
                if (node.getParent() != null) {
                    if (node.getParent().getLeftNode() == node) {
                        node.getParent().setLeftNode(null);
                    } else if (node.getParent().getRightNode() == node) {
                        node.getParent().setRightNode(null);
                    }
                    return true;
                } else {
                    System.out.println("Root Knoten kann nicht gelöscht werden");
                    return false;
                }
            } else {
                return false;
            }
        } else if (result > 0) {
            return remove(node.getLeftNode(), element);
        } else {
            return remove(node.getRightNode(), element);
        }

    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return super.containsAll(c);
    }

    @Override
    public Object[] toArray() {
        return super.toArray();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Node<E> getRoot() {
        return root;
    }
}
