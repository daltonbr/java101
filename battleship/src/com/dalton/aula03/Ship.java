package com.dalton.aula03;

import java.util.ArrayList;

public class Ship {

    /**
     * @author Dalton Lima github @daltonbr - sacinopatinete@gmail.com
     *
     * destroyed is always setted to false at start
     */

    // constructor 1
    public Ship(int _headPosition, Orientation _orientation)
    {
        if (_orientation.equals(Orientation.HORIZONTAL))
        {


        }
        else
        {

        }

        this.setHeadPosition( _headPosition);
        this.setDestroyed(false);
    }
    // constructor 2
    public Ship()
    {
        this.setDestroyed(false);
        this.bodyCells = new ArrayList<>();
    }

    public enum Orientation {HORIZONTAL, VERTICAL }

    // class variables
    private boolean destroyed;               // register if the ship is destroyed or not
    private int headPosition;                 // take out?
    private ArrayList<CellShip> bodyCells;   // record which CellShips the Ship is made of


//    public void attackShip(CellShip _cellShip )
//    {
//        this.getBodyCells().
//    }

    // getters and setters
    public boolean isDestroyed(boolean b) {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public int getHeadPosition() {
        return headPosition;
    }

    public void setHeadPosition(int _headPosition) {
        this.headPosition = _headPosition;
    }

    public ArrayList<CellShip> getBodyCells() {
        return bodyCells;
    }

    public void addBodyCells(CellShip _newCell) {
        this.bodyCells.add(_newCell);
    }

}
