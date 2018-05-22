package app.exercise.testing;

import app.exercise.adt.BSTree;
import app.exercise.adt.BSTreeIterator;
import app.exercise.algebra.CompRational;
import app.exercise.algebra.Rational;
import app.exercise.visualtree.RedBlackTreeDrawer;

import java.util.ArrayList;
import java.util.List;

public class BSTreeTester {

    private static BSTree<CompRational> primaryTree;
    private static BSTree<CompRational> emptyTree;
    private static BSTree<CompRational> secondaryTreeOne;
    private static BSTree<CompRational> secondaryTreeTwo;

    public static void main(String[] args) {

        if (args.length % 2 != 0) {
            System.out.println("Gerade Anzahl an Argumenten benötigt");
            return;
        }

        CompRational first = new CompRational(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        CompRational last = new CompRational(Integer.parseInt(args[args.length-2]),Integer.parseInt(args[args.length-1]));
        primaryTree = new BSTree<>();
        emptyTree = new BSTree<>();
        secondaryTreeOne = new BSTree<>();
        secondaryTreeTwo = new BSTree<>();

        RedBlackTreeDrawer<CompRational> visual = new RedBlackTreeDrawer <>();

        for (int i = 0; i < args.length; i+=2) {
            CompRational z = new CompRational(Integer.parseInt(args[i]),Integer.parseInt(args[i+1]));
            primaryTree.add(z);
            if (i%4==0)  secondaryTreeOne.add(z);
            else secondaryTreeTwo.add(z);
        }

        System.out.println(primaryTree);
        visual.draw(primaryTree.getRoot());

        System.out.println(secondaryTreeOne);
        System.out.println(secondaryTreeTwo);

        System.out.println(primaryTree.containsAll(secondaryTreeOne));
        System.out.println(primaryTree.containsAll(secondaryTreeTwo));

        System.out.println(primaryTree.contains(first));
        System.out.println(primaryTree.contains(last));

        System.out.println();
        System.out.println("Zahlen, die random generiert und entfernt werden");
        List<CompRational> newNumbers = new ArrayList<>();
        while (newNumbers.size()<=100){
            CompRational z;
            try {
                z = new CompRational((int) (Math.random()*100),(int) (Math.random()*100));
            } catch (ArithmeticException e) {
                continue;
            }
            if (first.compareTo(z)<0 && last.compareTo(z) > 0){
                newNumbers.add(z);
            }
        }

        for (CompRational z : newNumbers) {
            if (primaryTree.contains(z)) {
                System.out.println(z);
                primaryTree.remove(z);
            }
        }
        System.out.println();

        System.out.println(primaryTree.size());
        primaryTree.remove(first);
        primaryTree.remove(last);
        System.out.println(primaryTree.size());

        visual.draw(primaryTree.getRoot());

        /*BSTree<CompRational> treetwo = new BSTree<>();
        treetwo.add(new CompRational(3,4));
        treetwo.add(new CompRational(100,1));
        treetwo.add(new CompRational(3,2));
        treetwo.add(new CompRational(3,3));
        treetwo.add(new CompRational(3,9));

        visual.draw(treetwo.getRoot());*/

    }

}
