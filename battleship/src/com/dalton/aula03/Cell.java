package com.dalton.aula03;

public class Cell {
    /**
     * @author Dalton Lima on 3/18/16.
     * @param x - cell x coordinate
     * @param y - cell y coordinate
     * @param empty - boolean - Indicates wether the cell is empty or not
     */

    // internal variables
    private int x;
    private int y;
    private boolean empty;
    private boolean shot;   // cell was already shooted at ?

    // constructor
    public Cell(int _x, int _y)
    {
        this.setX( _x);
        this.setY( _y);
        this.setEmpty(true);
        this.setShot(false);

    }


    // getters and setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isShot() {
        return shot;
    }

    public void setShot(boolean shot) {
        this.shot = shot;
    }

}
