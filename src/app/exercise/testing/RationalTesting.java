package app.exercise.testing;

import app.exercise.algebra.CompRational;
import app.exercise.algebra.Rational;

import java.util.Objects;

/**
 * Testklasse um alle Funktionen von Rational zu testen
 */
public class RationalTesting {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rational z1 = new Rational(1, 2);
        Rational z2 = new Rational(2, 4);
        Rational z3 = new Rational(10,1);
        System.out.println("\n---Clone---");
        Rational z4 = (Rational) z1.clone();
        Rational z5 = (Rational) z2.clone();
        System.out.println(testClone(z4,"1/2"));
        System.out.println(testClone(z5,"1/2"));
        System.out.println("\n---Add---");
        System.out.println(testAdd(z1,z2,"1/1"));
        System.out.println(testAdd(z1,z3,"11/1"));
        System.out.println("\n---Sub---");
        System.out.println(testSub(z1,z2,"21/2"));
        System.out.println(testSub(z3,z1,"-1/2"));
        z1.setND(-1,2);
        z3.setND(10,1);
        System.out.println("\n---Mul---");
        System.out.println(testMul(z1,z2,"-1/4"));
        System.out.println(testMul(z1,z3,"-5/2"));
        System.out.println("\n---Div---");
        System.out.println(testDiv(z1,z2,"-5/1"));
        System.out.println(testDiv(z3,z1,"-2/1"));
        System.out.println("\n---Equals---");
        System.out.println(testequals(z1,z1,true));
        z1.setND(1,2);
        z2.setND(1,2);
        System.out.println(testequals(z1,z2, false));
        System.out.println("\n---CompareTo---");
        CompRational z6 = new CompRational(1,2);
        CompRational z7 = new CompRational(2,4);
        System.out.println(testCompareTo(z6,z7,0));
        z7.setND(1,1);
        System.out.println(testCompareTo(z6,z7,1));

    }

    /**
     * Testmethode zum Clonen
     * @param z1 Rational
     * @param s String
     * @return boolean
     */
    public static boolean testClone(Rational z1, String s){
        return Objects.equals(z1.toString(), s);
    }

    /**
     * Testmethode zum Addieren
     * @param z1 Rational
     * @param z2 Rational
     * @param s String
     * @return boolean
     */
    public static boolean testAdd(Rational z1, Rational z2, String s){
        z1.add(z2);
        return Objects.equals(z1.toString(), s);
    }

    /**
     * Testmethode zum Subtrahieren
     * @param z1 Rational
     * @param z2 Rational
     * @param s String
     * @return boolean
     */
    public static boolean testSub(Rational z1, Rational z2, String s){
        z1.sub(z2);
        return Objects.equals(z1.toString(), s);
    }

    /**
     * Testmethode zum Multiplizieren
     * @param z1 Rational
     * @param z2 Rational
     * @param s String
     * @return boolean
     */
    public static boolean testMul(Rational z1, Rational z2, String s){
        z1.mul(z2);
        return Objects.equals(z1.toString(), s);
    }

    /**
     * Testmethode zum Dividieren
     * @param z1 Rational
     * @param z2 Rational
     * @param s String
     * @return boolean
     */
    public static boolean testDiv(Rational z1, Rational z2, String s){
        z1.div(z2);
        return Objects.equals(z1.toString(), s);
    }

    /**
     * Testmethode für Equals
     * @param z1 Rational
     * @param z2 Rational
     * @param s String
     * @return boolean
     */
    public static boolean testequals(Rational z1, Rational z2, boolean s){
        return ((z1.equals(z2))==s);
    }

    /**
     * Testmethode für CompareTo
     * @param z1 CompRational
     * @param z2 CompRational
     * @param z String
     * @return boolean
     */
    public static boolean testCompareTo(CompRational z1, CompRational z2, int z){
        return z1.compareTo(z2)==z;
    }
}
