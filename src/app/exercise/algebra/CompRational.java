package app.exercise.algebra;

public class CompRational extends Rational implements java.lang.Comparable<T>{

    /**
     * Konstrukor zum erzeugen eines CompRational-Objektes
     * @param N Long
     * @param D Long
     */
    public CompRational(long N, long D){ super(N,D); }

    /**
     * Methode zum überprüfen ob 2 CompRational-Objekte die gleichen Werte haben
     * Wenn größer 1, kleiner -1, gleich 0
     * @param o Object
     * @return int
     */
    @Override
    public int compareTo(T o)
    {
        CompRational tmp = <T> o;
        if(this.equals(tmp))
        {
            return 0;
        }
        if(this.getN() * tmp.getD() > tmp.getN() * this.getD())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
