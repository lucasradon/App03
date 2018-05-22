package app.exercise.visualtree;

/**
 * Interface um grafische Elemte zu zeigen
 * @param <T>
 */
public interface DrawableTreeElement <T> {

    DrawableTreeElement<T> getLeft();

    DrawableTreeElement<T> getRight();

    boolean isRed();

    T getValue();

}