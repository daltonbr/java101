package com.dalton.aula03;

import java.util.ArrayList;

/**
 * @author dalton on 3/18/16.
 */

public class GameController {
    final int BOARD_WIDTH = 5;  //hardcoded for now
    final int BOARD_HEIGHT = 5;
    ArrayList<Cell> _cells = new ArrayList<>(); // reference to cells in the board

    public void startGame()
    {
        Grid newBoard = new Grid(BOARD_WIDTH,BOARD_HEIGHT);   // instantiate a new board
       _cells = newBoard.getBoard();     // get a reference to the board (inside grid object)

        this.drawBoard();  // draw a board to the screen

    }

    public void drawBoard ()
    {
        System.out.println("Drawing Board: ");
        int _line = BOARD_HEIGHT - 1;

        for (Cell temp : _cells )   // print all the cells in the arraylist
        {
            if ( _line != temp.getX() )  // detect when we change lines, and jump a line
            {
                System.out.println("");
            }
            System.out.print("x: " + temp.getX() + " y: " + temp.getY() + " - ");
            _line = temp.getX();
        }
    }

    public void getShot (int _shot) {
        // TODO
    }

    public void refreshBoard(int _shot, boolean isHited) {
        // TODO
    }
}
