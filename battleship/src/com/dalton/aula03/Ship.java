package com.dalton.aula03;

import java.util.ArrayList;

public class Ship {

    /**
     * @author Dalton Lima github @daltonbr - sacinopatinete@gmail.com
     *
     * destroyed is always setted to false at start
     */

    // constructor
    public Ship()
    {
        this.setDestroyed(false);
        this.bodyCells = new ArrayList<>();
    }

    public enum Orientation {HORIZONTAL, VERTICAL }

    // class variables
    private boolean destroyed;               // register if the ship is destroyed or not
    private ArrayList<CellShip> bodyCells;   // record which CellShips the Ship is made of

    // getters and setters
    public boolean isDestroyed(boolean b) {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public ArrayList<CellShip> getBodyCells() {
        return bodyCells;
    }

    public void addCellToShip(CellShip _newCell) {
        this.bodyCells.add(_newCell);
    }

    public void removeCellFromShip(CellShip _cellShip)
    {
        this.bodyCells.remove(_cellShip);                   // removing it
        if ( this.bodyCells.isEmpty() ) this.setDestroyed(true);
    }

}
