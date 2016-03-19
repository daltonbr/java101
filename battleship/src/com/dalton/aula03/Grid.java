package com.dalton.aula03;

/**
 * Created by dalton on 3/18/16.
 */


public class Grid {

    private int x;
    private int y;
    private Cell[][] grid;
    int [ ] [ ] scores = new int [ 4 ] [ 5 ] ;

    // constructor
    public Grid(int _x, int _y) {
        for (int i = 0 ; i < _x ; i++ )
        {
            for (int j = 0 ; j < _y ; j++ )
            {
                Cell newCell = new Cell(_x, _y);

            }
        }

        this.setX(_x);
        this.setY(_y);

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


}
