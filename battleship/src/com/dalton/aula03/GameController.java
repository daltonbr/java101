package com.dalton.aula03;

/**
 * @author dalton on 3/18/16.
 */
/*
 0 nada
 ~
 */

public class GameController {
    final int BOARD_SIZE = 7;  //hardcoded for now

    private int[] board = {0,0,0,0,0,0,0};
    private Ship ships;  //instantiate a ship

    public void startGame()
    {
        int[] _shipPosition = {2,3,4};
        Ship _ship1 = new Ship("Ship1", _shipPosition);  //instantiate the first ship
        int[] local = {2,3,4};

    }

    public void drawBoard ()
    {
        for (int cell : board)
        {
            if (cell == 0 )
            {
                System.out.println("  0  ");
            }
            else if (cell == 1 )
            {
                System.out.println("  ~  ");
            }
            else
            {
                System.out.println("  X  ");
            }
        }

    }
    //board = new int[BOARD_SIZE];

    public void getShot (int _shot) {
        // TODO
    }

    public void refreshBoard(int _shot, boolean isHited)
    {
        // TODO
        if (isHited)
        {
            this.board[_shot - 1] = 2;  // 2 mark the spot as hitted ?
        }
        else
        {
            this.board[_shot - 1] = 1;  //1 mark the spot as missed ?
        }
    }
}
