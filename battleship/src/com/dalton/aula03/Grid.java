package com.dalton.aula03;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by dalton on 3/18/16.
 */


public class Grid {

    final int GRID_WIDTH = 5;  //hardcoded for now
    final int GRID_HEIGHT = 5;

    private int width;
    private int height;

    private CellShip[][] board = new CellShip[GRID_HEIGHT][GRID_WIDTH];

    private ArrayList<CellShip> cellArrayList = new ArrayList<>();

    private ArrayList<Ship> shipArrayList = new ArrayList<>();

    //TODO set minimum and maximum

    // constructor
    public Grid(int _width, int _height) {

        CellShip[][] _tempArray = new CellShip[_width][_height];

        // instantiate all the cells and add them to an ArrayList and a Matrix of cells
        for (int i = 0  ; i < _width ; i++ )
        {
            for (int j = 0 ; j < _height ; j++ )
            {
                CellShip newCell = new CellShip(i, j);  //each cell receives their own coordinate
                _tempArray[i][j] = newCell;
                cellArrayList.add(newCell);
            }
        }
        this.setWidth(_width);
        this.setHeight(_height);
        this.setBoard(_tempArray);
    }

    // getters and setters
    public int getWidth() {
        return width;
    }

    public void setWidth(int _width) {
        this.width = _width;
    }



    public int getHeight() {
        return height;
    }

    public void setHeight(int _height) {
        this.height = _height;
    }

    public CellShip[][] getBoard() {
        return board;
    }

    public void setBoard(CellShip[][] board) {
        this.board = board;
    }

    public void addShip(Ship _ship)
    {
        this.shipArrayList.add(_ship);
    }

    public void addShipByCoordinate(int _x, int _y)
    {
        this.board[_x][_y].setEmpty(false);
    }

    public void removeShipByCoordinate(int _x, int _y)
    {
        this.board[_x][_y].setEmpty(true);
    }

    public void shotShipByCoordinate(int _x, int _y)
    {
        this.board[_x][_y].setShot(true);
    }

    public ArrayList<Ship> getShipArrayList() {
        return shipArrayList;
    }

    public void setShipArrayList(ArrayList<Ship> shipArrayList) {
        this.shipArrayList = shipArrayList;
    }

    public ArrayList<CellShip> getCellArrayList() {
        return cellArrayList;
    }

    public void setCellArrayList(ArrayList<CellShip> cellArrayList) {
        this.cellArrayList = cellArrayList;
    }


}
