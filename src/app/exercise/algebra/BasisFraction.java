package app.exercise.algebra;

/**
 * Abstrakte Klasse, die die Methoden aus dem implemetierten Interface Fractional definiert
 */
abstract class BasisFraction implements Fractional{
    /**
     * Methode zum setzen des Numerators und des Denominators
     * @param numerator Long
     * @param denominator Long
     */
    protected abstract void setND(long numerator, long denominator);

    /**
     * Methode zur Negation eines Objektes
     * @return Rational-Objekt
     */
    @Override
    public Fractional negation() {
        return new Rational(-getN(),getD());
    }

    /**
     * Methode zum Addieren der Instanz und einem übergebenen Objekt
     * @param operand Fractional
     */
    @Override
    public void add(Fractional operand) {
        setND(this.getN()*operand.getD()+operand.getN()*this.getD(),this.getD()*operand.getD());
    }

    /**
     * Methode zum Subtrahieren der Instanz und einem übegebenen Objekt durch Addition der Negation
     * @param operand Fractional
     */
    @Override
    public void sub(Fractional operand) {
        add(operand.negation());
    }

    /**
     * Methode zum Multiplizieren der Instanz und einem übergebebnen Objekt
     * @param operand Fractional
     */
    @Override
    public void mul(Fractional operand) {
        setND(this.getN()*operand.getN(),this.getD()*operand.getD());
    }

    /**
     * Methode zur Bildung des Kehrwertes eines Bruches
     * @return Rational
     */
    @Override
    public Fractional reciprocal() {
        return new Rational(getD(),getN());
    }

    /**
     * Methode zum Dividieren der Instanz und einem übergebenen Objekt durch Mutlplikation des Kehrwertes
     * @param operand Fractional
     */
    @Override
    public void div(Fractional operand) {
        mul(operand.reciprocal());
    }

    /**
     * Methode zum Abrufen des hashCodes
     * @return int
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

}

