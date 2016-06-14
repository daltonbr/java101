import java.security.PrivateKey;

/**
 * Created on 5/6/16 by:
 * Dalton Lima         github.com/daltonbr
 * Lucas Pinheiro      github.com/lucaspin
 */
public class Music implements Comparable<Music>{
    private String rank;
    private int suite;

    public int getSuite() {
        return suite;
    }

    public void setSuite(int suite) {
        this.suite = suite;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Music() {}

    public Music(String _rank, int _suite) {
        this.setRank( _rank);
        this.setSuite( _suite);
    }

    @Override
    public int compareTo (Music currentMusic) {
        int peso = 0;
        int vira = 3;
        if ( this.getSuite() == vira + 1 ) {
            peso = 1000;
        }
        return  (peso) + this.getSuite() - currentMusic.getSuite();
    }

    @Override
    public String toString() {
        return this.getRank() + this.getSuite();
    }
}
