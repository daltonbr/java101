package com.dalton.aula03;

import java.util.ArrayList;

/**
 * @author dalton on 3/18/16.
 */

public class GameController {
    final int BOARD_WIDTH = 5;  //hardcoded for now
    final int BOARD_HEIGHT = 5;
    //ArrayList<CellShip> _cellsArray = new ArrayList<>(); // reference to cells in the board
    CellShip[][] _cellsArray = new CellShip[BOARD_HEIGHT][BOARD_WIDTH];

    public void startGame()
    {
        Grid newBoard = new Grid(BOARD_WIDTH,BOARD_HEIGHT);   // instantiate a new board
       _cellsArray = newBoard.getBoard();     // get a reference to the board (inside grid object)

        this.drawBoard();  // draw a board to the screen

    }

    public void drawBoard ()
    {
        System.out.println("Drawing Board: ");
        int _line = BOARD_HEIGHT - 1;
        System.out.print(_line);  // printing the label

        for (int i = BOARD_WIDTH-1 ; i>= 0 ; i-- )    // print all the cells in the arraylist
        {
            for (int j = 0; j < BOARD_HEIGHT; j++)
            {
                if ( _line != _cellsArray[i][j].getX() )  // detect when we change lines, and jump a line
                {
                    System.out.println("");
                    System.out.print(_line - 1);  // printing the label
                }
                System.out.print(" - " + _cellsArray[i][j].getX() + _cellsArray[i][j].getY());
                _line = _cellsArray[i][j].getX();
            }
        }
        System.out.println();
        System.out.print(" ");
        for (int i = 0; i < BOARD_WIDTH ; i++ )
        {
            System.out.print(" -  " + i);
        }
    }

    public void getShot (int _shot) {
        // TODO
    }

    public void refreshBoard(int _shot, boolean isHited) {
        // TODO
    }
}
