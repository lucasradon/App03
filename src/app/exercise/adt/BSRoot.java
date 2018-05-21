package app.exercise.adt;

import app.exercise.visualtree.DrawableTreeElement;

public class BSRoot implements DrawableTreeElement<T> {

    @Override
    public DrawableTreeElement<T> getLeft() {
        return null;
    }

    @Override
    public DrawableTreeElement<T> getRight() {
        return null;
    }

    @Override
    public boolean isRed() {
        return false;
    }

    @Override
    public T getValue() {
        return null;
    }
}
