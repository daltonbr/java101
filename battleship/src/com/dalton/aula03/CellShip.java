package com.dalton.aula03;

/**
 * Created by dalton on 3/23/16.
 */
public class CellShip extends Cell {

//    public CellShip()
//    {
//    }

    public CellShip(int _x, int _y)
    {
        super ( _x, _y);  // superclass Cell
        this.setHit(false);

    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship _ship) {
        this.ship = _ship;
    }

    private Ship ship;

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    private boolean hit;


}
