package com.dalton.aula03;

import java.util.ArrayList;

public class Ship {
    /**
     * @author Dalton Lima github @daltonbr - sacinopatinete@gmail.com
     * @param _name - The name of the ship
     * @param _position - an array with stores the ship location
     *
     * destroyed is always setted to false at start
     */

    // constructor 1
    public Ship(String _name, int[] _position)
    {
        this.setName( _name);
        this.setPosition( _position);
        this.setDestroyed(false);
    }

    // constructor 2
    public Ship()
    {
        this.setDestroyed(false);
    }
    private String name;                     // take out? why do we need the name?
    private boolean destroyed;               // register if the ship is destroyed or not
    private int[] position;                  // take out?
    private ArrayList<CellShip> bodyCells;   // record which CellShips the Ship is made of

    // fixed size 3
    public void createShip (int _x, int _y)
    {

    }

//    public void attackShip(CellShip _cellShip )
//    {
//        this.getBodyCells().
//    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDestroyed(boolean b) {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] _position) {
        this.position = _position;
    }

    public ArrayList<CellShip> getBodyCells() {
        return bodyCells;
    }

    public void setBodyCells(ArrayList<CellShip> bodyCells) {
        this.bodyCells = bodyCells;
    }

}
