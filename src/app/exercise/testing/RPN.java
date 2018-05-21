package app.exercise.testing;

import app.exercise.algebra.CompRational;

import java.util.Objects;
import java.util.Stack;

import static java.lang.Long.parseLong;

/**
 * Testklasse für Umgekehrte polnische Notation
 */
public class RPN {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < args.length; i++) {
            try {//Wenn es möglich ist den String als Longzahl zu parsen
                //geht die Kommandozeile durch, ob Strings positv sind und speichert sie als CompRational Objekte im Stack
                Long l = parseLong(args[i]);
                if (l >= 0) {
                    CompRational tmp = new CompRational(l, 1);
                    stack.push(tmp);
                }
            } catch (NumberFormatException e) {// Wenn keine Zahl, prüfe auf Operatoren +,-,*,/  und führe dann die entsprechende Methode aus (Vorleztes Objekt +-*/ Letztes Objekt)
                if (Objects.equals(args[i], "+") || Objects.equals(args[i], "-") || Objects.equals(args[i], "*") || Objects.equals(args[i], "/")) {
                    CompRational a = (CompRational) stack.pop(); // Letzes Objekt des Stacks
                    CompRational b = (CompRational) stack.pop(); // Vorletzes Objekt des Stacks
                    if (Objects.equals(args[i], "+")) {
                        b.add(a);
                    }
                    if (Objects.equals(args[i], "-")) {
                        b.sub(a);
                    }
                    if (Objects.equals(args[i], "*")) {
                        b.mul(a);
                    }
                    if (Objects.equals(args[i], "/")) {
                        b.div(a);
                    }
                        stack.push(b);                          //Ergebnis in den Stack legen
                } else {
                    System.out.println("Ungültiges Zeichen: " + args[i]);
                    System.exit(1);
                }
            }
        }//Ausgabe des letzetn Objektes im Stack
        System.out.println(stack.pop());
    }
}
