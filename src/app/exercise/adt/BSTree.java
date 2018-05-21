package app.exercise.adt;

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
        return true;
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
