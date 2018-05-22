package app.exercise.adt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BSTreeIterator<E> implements Iterator<E> {

    private BSTree<E> tree;
    private Node<E> node;
    private int index = 0;
    private List<Node<E>> nodeList;

    public BSTreeIterator(BSTree<E> tree) {

        this.tree = tree;
        this.nodeList = getInorderedList(tree.getRoot());

    }


    @Override
    public boolean hasNext() {
        return index < nodeList.size();
    }

    @Override
    public E next() {

        node = nodeList.get(index);
        index++;
        return node.getValue();

    }

    private List<Node<E>> getInorderedList(Node<E> node){

        List<Node<E>> list = new ArrayList<>();
        if (node.getLeftNode() != null) {
            list.addAll(getInorderedList(node.getLeftNode()));
        }
        list.add(node);
        if (node.getRightNode() != null) {
            list.addAll(getInorderedList(node.getRightNode()));
        }
        return list;

    }

}
