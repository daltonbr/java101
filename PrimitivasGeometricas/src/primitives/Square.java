package primitives;

/**
 * Created on 5/2/16 by:
 * Dalton Lima         github.com/daltonbr
 * Lucas Pinheiro      github.com/lucaspin
 */
public class Square implements Primitives {
    private double side;

    // constructor
    public Square (double _side ) {
        this.setSide( _side );
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return ( getSide() * getSide() ) ;
    }
}
