package app.exercise.adt;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BSTreeIterator<E> implements Iterator<E> {
    private BSTree<E> list;
    private int pos = 0;

    public BSTreeIterator(BSTree<E> list){
        this.list = list;
    }


    @Override
    public boolean hasNext() {
        return pos<list.size();
    }

    @Override
    public E next() {
        if (pos>= list.size()) {
            throw new NoSuchElementException();
        }
        return null;
    }



}
