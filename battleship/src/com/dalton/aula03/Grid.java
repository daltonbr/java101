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

    //private ArrayList<CellShip> board;
    private CellShip[][] board = new CellShip[GRID_HEIGHT][GRID_WIDTH];
    private ArrayList<Ship> shipList = new ArrayList<>();

    //TODO set minimum and maximum

    // constructor
    public Grid(int _width, int _height) {

        CellShip[][] _tempArray = new CellShip[_width][_height];


        // instantiate all the cells and add them to a temp arraylist
        for (int i = 0  ; i < _width ; i++ )
        {
            for (int j = 0 ; j < _height ; j++ )
            {
                CellShip newCell = new CellShip(i, j);  //each cell receives their own coordinate
                _tempArray[i][j] = newCell;


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

    //    }
//        this.setBoard(_tempArray);
//        this.setHeight(_height);
//        this.setWidth(_width);
//
//        }
//            }
//                _tempArray.add(newCell);
//                CellShip newCell = new CellShip(i, j);  //each cell receives their own coordinate
//            {
//            for (int j = 0 ; j < _height ; j++ )
//        {
//        for (int i = _width -1  ; i >= 0 ; i-- )
//        // instantiate all the cells and add them to a temp arraylist
//
//        ArrayList<CellShip> _tempArray = new ArrayList<>();
//
//    public Grid(int _width, int _height) {
//    public ArrayList<CellShip> getBoard() {
//        return board;
//    }
//
//    public void setBoard(ArrayList<CellShip> board) {
//        this.board = board;
//    }
}
