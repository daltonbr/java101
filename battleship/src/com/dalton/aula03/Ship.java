package com.dalton.aula03;

/**
 * Created by dalton on 3/18/16.
 */
public class Ship {
    private String name;
    private boolean destroyed;
    private int[] position;

    /**
     * @author Dalton Lima github @daltonbr - sacinopatinete@gmail.com
     * @param _name - The name of the ship
     * @param _position - an array with stores the ship location
     *
     * destroyed is always setted to false at start
     */


    public Ship(String _name, int[] _position)
    {
        this.setName( _name);
        this.setPosition( _position);
        this.setDestroyed(false);
    }

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

}
