package app.exercise.algebra;

public class CompRational extends Rational implements Comparable<CompRational>{

    /**
     * Konstrukor zum erzeugen eines CompRational-Objektes
     * @param N Long
     * @param D Long
     */
    public CompRational(long N, long D){ super(N,D); }

    /**
     * Methode zum überprüfen ob 2 CompRational-Objekte die gleichen Werte haben
     * Wenn größer 1, kleiner -1, gleich 0
     * @param tmp Object
     * @return int
     */
    @Override
    public int compareTo(CompRational tmp) {

        double compareResult = getN()/(double)getD() - tmp.getN()/(double)tmp.getD();
        if (compareResult>0) return 1;
        else if (compareResult<0) return -1;
        else return 0;

    }

    @Override
    public String toString() {
        return Long.toString(getN())+"/"+Long.toString(getD());
    }
}
