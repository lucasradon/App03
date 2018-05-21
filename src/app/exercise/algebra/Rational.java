package app.exercise.algebra;

/**
 * Klasse Rational erbt von abstrakter Klasse BasicFraction
 */
public class Rational extends BasisFraction {
    /**
     * ObjektVariablen N - Zähler, D - Nenner
     */
    public long N,D;

    /**
     * Konstruktor zum erzeugen eines Rational Objektes
     * @param N Long
     * @param D Long
     */
    public Rational(long N, long D){
        setND(N,D);
    }

    /**
     * default-Konstruktor, der das Objekt 1/1 erzeugt
     */
    public Rational(){
       setND(1,1);
    }

    /**
     * Methode zur Bildung des ggT - wichtig fürs Kürzen
     * @param x Long
     * @param y Long
     * @return Long
     */
    public static long ggT( long x, long y) { if ( y == 0) return x;
        return ggT( y, x % y);
    }

    /**
     * Methode zum Setzen des Zählers und Nenners, überprüfunf ob der Nenner negativ ist
     * @param numerator Long
     * @param denominator Long
     */
    @Override
    public void setND(long numerator, long denominator) {
        if (denominator >= 0) {
            N = numerator / ggT(Math.abs(numerator), Math.abs(denominator));
            D = denominator / ggT(Math.abs(numerator), Math.abs(denominator));
        } else {
            N = -numerator / ggT(Math.abs(numerator), Math.abs(denominator));
            D = -denominator / ggT(Math.abs(numerator), Math.abs(denominator));
        }
    }

    /**
     * Methode zum Ausgeben des Zählers
     * @return Long
     */
    @Override
    public long getN() {
        return N;
    }

    /**
     * Methode zum Ausgeben des Nenners
     * @return Long
     */
    @Override
    public long getD() {
        return D;
    }

    /**
     * Methode zur lesbaren Ausgabe eines Bruch-Objektes
     * @return String
     */
    @Override
    public String toString() {
        return Long.toString(getN())+"/"+Long.toString(getD());
    }

    /**
     * Methode zum Clonen von Rational-Objekten
     * @return Object
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Rational(this.getN(), this.getD());
    }

    /**
     * Methode zur Ausgabe des hashCodes
     * @return int
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Methode zur Überprüfung ob das selbe Objekt vorliegt (ob HashCode gleicht ist)
     * @param obj Object
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        return hashCode()==obj.hashCode();
    }
}
