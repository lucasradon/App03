package app.exercise.visualtree;

public interface DrawableTreeElement <T> {

    DrawableTreeElement<T> getLeft();

    DrawableTreeElement<T> getRight();

    boolean isRed();

    T getValue();

}