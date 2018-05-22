package app.exercise.adt;

import app.exercise.algebra.CompRational;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public class BSTree<E> extends AbstractCollection<E> implements Iterable<E> {

    private Node<E> root;

    /**
     * Add-Methode zum Hinzufügen eines neuen Knotens
     *
     * @param element
     * @return
     */
    @Override
    public boolean add(E element) {
        return insert(root, element);
    }

    private boolean insert(Node<E> node, E element) {

        if (root == null) {
            root = new Node<>(element, null);
            return true;
        }
        //wenn der Wert des Knotens kleiner ist als der Wert des elements & der rechte Knoten ist frei lege einen Neuen Knoten mit dem Wert von element an
        CompRational nodeValue = (CompRational) node.getValue();
        int result = nodeValue.compareTo((CompRational) element);
        if (result < 0) {
            if (node.getRight() == null) {
                node.setRightNode(new Node<>(element, node));
            } else {
                insert(node.getRightNode(), element);
            }
            return true;
        } else if (result > 0) {
            if (node.getLeft() == null) {
                node.setLeftNode(new Node<>(element, node));
            } else {
                insert(node.getLeftNode(), element);
            }
            return true;
        } else {
            return false;
        }

    }

    /**
     * Remove-Methode zum Löschen eines Knotens
     *
     * @param o Objekt
     * @return boolean
     */
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
    public Iterator<E> iterator() {
        return new BSTreeIterator<>(this);
    }

    @Override
    public int size() {

        int size = 0;
        Iterator<E> iterator = iterator();
        while (iterator.hasNext()) {
            iterator.next();
            size++;
        }
        return size;

    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public boolean contains(Object o) {

        Iterator<E> iterator = iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(o)) {
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean containsAll(Collection<?> c) {

        for (Object o : c) {
            if (!contains(o)) return false;
        }
        return true;

    }

    @Override
    public Object[] toArray() {

        Object[] array = new Object[size()];
        Iterator<E> iterator = iterator();
        int i = 0;

        while (iterator.hasNext()) {
            array[i] = iterator.next();
            i++;
        }
        return array;
    }

    @Override
    public String toString() {
        Iterator<E> iterator = iterator();
        String s = "";

        while (iterator.hasNext()) {
            s += iterator.next()+", ";
        }
        return s.substring(0, s.length() - 2);

    }

    public Node<E> getRoot() {
        return root;
    }
}
