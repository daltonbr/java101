package primitives;

/**
 * Created on 5/2/16 by:
 * Dalton Lima         github.com/daltonbr
 * Lucas Pinheiro      github.com/lucaspin
 */
public class Rectangle implements Primitives{
    private double width;
    private double height;

    public Rectangle(double _width, double _height) {
        this.setWidth( _width);
        this.setHeight( _height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return ( this.getWidth() * this.getHeight() );
    }
}
