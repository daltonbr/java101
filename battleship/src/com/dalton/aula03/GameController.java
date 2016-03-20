package com.dalton.aula03;

import java.util.ArrayList;

/**
 * @author dalton on 3/18/16.
 */

public class GameController {
    final int BOARD_SIZE = 7;  //hardcoded for now
    ArrayList<Cell> _cells = new ArrayList<>(); // reference to cells in the board

    public void startGame()
    {
        Grid newBoard = new Grid(7,7);   // instantiate a new board
       _cells = newBoard.getBoard();     // get a reference to the board (inside grid object)

        this.drawBoard();
        // newBoard.drawBoard();
//     int[] _shipPosition = {2,3,4};
//        Ship _ship1 = new Ship("Ship1", _shipPosition);  //instantiate the first ship
//        int[] local = {2,3,4};

    }

    public void drawBoard ()
    {
        System.out.println("Drawing Board: ");
        for (Cell temp : _cells )   // print all the cells in the arraylist
        {
            System.out.println("x: " + temp.getX() + " y: " + temp.getY() );

        }
    }

    public void getShot (int _shot) {
        // TODO
    }

    public void refreshBoard(int _shot, boolean isHited) {
        // TODO
    }
}
