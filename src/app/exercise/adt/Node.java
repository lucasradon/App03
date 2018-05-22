package app.exercise.adt;

import app.exercise.visualtree.DrawableTreeElement;

/**
 * Klassen zum Erzeugen von Knoten-Objekten
 * @param <T>
 */
public class Node<T> implements DrawableTreeElement<T> {

    /**
     * Objekt-Variablen
     * tree, red rigth, left, parent
     */
    private T t;
    private boolean red;
    private Node<T> right, left, parent;

    /**
     * Konstrukor zum erzeugen von Node-Objekten
     * @param T t
     * @param Node parent
     */
    public Node(T t, Node<T> parent){
        this.t = t;
        this.parent = parent;
        this.red = Math.random() < 0.5;
    }

    /**
     * getter um auf linkes Listenelement zuzugreifen
     * @return Node
     */
    @Override
    public DrawableTreeElement<T> getLeft() {
        return left;
    }

    /**
     * getter um auf rechtes Listenelement zuzugreifen
     * @return Node
     */
    @Override
    public DrawableTreeElement<T> getRight() {
        return right;
    }

    /**
     * Methode um zu prüfen ob Knoten rot ist
     * @return boolean
     */
    @Override
    public boolean isRed() {
        return red;
    }

    /**
     * Methode um typisierten Wert zurückzugeben
     * @return
     */
    @Override
    public T getValue() {
        return t;
    }

    /**
     * getter um auf linkes Listenelement zuzugreifen
     * @return Node
     */
    public Node<T> getLeftNode() {
        return left;
    }

    /**
     * getter um auf rechtes Listenelement zuzugreifen
     * @return Node
     */
    public Node<T> getRightNode() {
        return right;
    }

    /**
     * Methode um den rechten Unterknoten zu setzen
     * @param Node right
     */
    public void setRightNode(Node<T> right) {
        this.right = right;
    }

    /**
     * Methode um den linken Unterknoten zu setzen
     * @param Node left
     */
    public void setLeftNode(Node<T> left) {
        this.left = left;
    }

    /**
     * get-Methide um auf das parent-Knoten zuzugreifen
     * @return Node
     */
    public Node<T> getParent() {
        return parent;
    }

    /**
     * Methode um Parent zu setzen
     * @param Node parent
     */
    public void setParent(Node<T> parent) {
        this.parent = parent;
    }
}
