package com.dalton.aula03;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by dalton on 3/18/16.
 */


public class Grid {

    private int width;
    private int height;
    private ArrayList<Cell> board;

    //TODO set minimum and maximum
    
    // constructor
    public Grid(int _width, int _height) {

        ArrayList<Cell> _tempArray = new ArrayList<>();

        // instantiate all the cells and add them to a temp arraylist
        for (int i = _width -1  ; i >= 0 ; i-- )
        {
            for (int j = 0 ; j < _height ; j++ )
            {
                Cell newCell = new Cell(i, j);  //each cell receives their own coordinate
                _tempArray.add(newCell);
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

    public ArrayList<Cell> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<Cell> board) {
        this.board = board;
    }
}
