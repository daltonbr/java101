package com.dalton.aula03;

public class Cell {
    /**
     * Created by dalton on 3/18/16.
     */

    private int x;
    private int y;
    private boolean empty;

    public Cell(int _x, int _y,)
    {
        this.setX( _x);
        this.setY( _y);
        this.setEmpty(true);
    }

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

}
