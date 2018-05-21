package app.exercise.adt;

import java.util.Collection;
import java.util.Iterator;

public class BSTree extends java.util.AbstractCollection<E> implements Iterable<E> {
    private E[] data;
    private int size;

    public BSTree(int maxSize){
        data = (E[]) new Object[maxSize];
        size = 0;
    }

    @Override
    public boolean add(E element) {
        if (size >= data.length) {
            throw new ArrayIndexOutOfBoundsException ();
            return false;
        }
        data[size++] = element;
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

    public Iterator<E> iterator(){
        return null;
    }

    public elementAt
}
