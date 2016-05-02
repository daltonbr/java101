package primitives;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

/**
 * Created on 5/2/16 by:
 * Dalton Lima         github.com/daltonbr
 * Lucas Pinheiro      github.com/lucaspin
 */
public class Circle implements Primitives{
    private double radius;

    // constructor
    public Circle (double _radius) {
        this.setRadius( _radius );
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (sqrt( this.getRadius() )  * PI);
    }
}
