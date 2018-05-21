package app.exercise.algebra;

/**Interface
 * Deklariert die genutzen Methoden
 */
public interface Fractional { // get numerator
    /**
     * Gibt Zähler zurück
     * @return long
     */
    long getN();
    // get denominator

    /**
     * Gibt Nenner zurück
     * @return long
     */
    long getD();
    // add operand to object

    /**
     * Zwei Brüche addieren
     * @param operand Fractional
     */
    void add(Fractional operand);
    // subtract operand from object

    /**
     * Brüche subrtrahieren
     * @param operand Fractional
     */
    void sub(Fractional operand);
    // multiply object by operand

    /**
     * Brüche multiplizieren
     * @param operand Fractional
     */
    void mul(Fractional operand);
    // divide object by operand

    /**
     * Brüch dividieren
     * @param operand Fractional
     */
    void div(Fractional operand);
// new additive inverse object Fractional

    /**
     * Bildung der Negation, wichtig für Subtraktion
     * @return Fractional
     */
    Fractional negation ();
// new multiplicative inverse object Fractional

    /**
     * Bildung des Kehrwertes, wichtig für Division
     * @return Fractional
     */
    Fractional reciprocal ();
}
