package com.dalton.aula03;

import java.util.ArrayList;

/**
 * Created by dalton on 3/23/16.
 */
public class CellShip extends Cell {


    private Ship ship;

    private boolean hit;

//    // return a single Cell if founded in an ArrayList (by coordinates)
//    public CellShip findCellShipByCoordinate(int _x, int _y, ArrayList<CellShip> _cs)
//    {
//        for (CellShip tempCell : _cs)
//        {
//            if ((tempCell.getX() == _x) && (tempCell.getY() == _y ))
//            {
//                return tempCell;
//            }
//        }
//        return null;
//    }


    public CellShip()
    {
        super (0,0);  // superclass Cell
        this.setHit(false);

    }

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

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }


}
