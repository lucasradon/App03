package app.exercise.testing;

import app.exercise.adt.BSTree;
import app.exercise.adt.Node;
import app.exercise.algebra.CompRational;

public class BSTreeTester {
    public static void main(String[] args) {
        BSTree<CompRational> tree = new BSTree<>(new Node<>(new CompRational<>(1,2)));
        System.out.println(tree.getRoot().isRed() + " " + tree.getRoot().getValue());
    }

}