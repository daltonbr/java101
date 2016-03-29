package com.dalton.aula03;

import sun.jvm.hotspot.opto.Block_Array;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author dalton on 3/18/16.
 */


public class GameController {

    public enum Orientation {HORIZONTAL, VERTICAL }
    final int BOARD_WIDTH = 5;  //hardcoded for now
    final int BOARD_HEIGHT = 5;
    //ArrayList<CellShip> _cellsArray = new ArrayList<>(); // reference to cells in the board
    CellShip[][] _cellsArray = new CellShip[BOARD_HEIGHT][BOARD_WIDTH];
    private Random randomGenerator;

    public void startGame()
    {
        Grid newBoard = new Grid(BOARD_WIDTH,BOARD_HEIGHT);   // instantiate a new board
        ArrayList<CellShip> hMap = horizontalMap(3);   // map that allocate free cells to spawn horizontal ships
        ArrayList<CellShip> vMap = verticalMap(3);

       _cellsArray = newBoard.getBoard();     // get a reference to the board (inside grid object)

        /*
        pick a cell from an ArrayListMap (horizontal ou vertical)
        if (shipPositionValidation is true - all cell need are available)
        then: instantiate Ship and refresh the map (marking cell as occupied)
        else: refresh the map with the headCell occupied and loop
        */

        CellShip currentCell = new CellShip();
        currentCell = findCellShipByCoordinate(2,0,hMap);

        currentCell = pickRandomCell(hMap);  //get a random cell from the map
        System.out.println("celular sorteada: " + currentCell.getX() + currentCell.getY() );

        if (currentCell.isEmpty() )
        {
            System.out.println("cell already empty");
        }

        if (shipPositionValidation(hMap, 2, 0, 3, Orientation.HORIZONTAL) )
        {
            hMap.remove(currentCell);  //remove the cell from the map
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        currentCell = findCellShipByCoordinate(0,0,hMap);
        if(shipPositionValidation(hMap, 2, 0, 3, Orientation.HORIZONTAL) )
        {
            Ship newShip = new Ship();  // instantiate a new ship in that cell
            //newBoard
            hMap.remove(currentCell);  //remove the cell from the map
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        this.drawBoard();  // draw a board to the screen
    }

    public CellShip pickRandomCell(ArrayList<CellShip> _array)
    {
        randomGenerator = new Random();
        int index = randomGenerator.nextInt(_array.size() );
        //System.out.println("Size " + _array.size() + "sorteado" + index);

        CellShip _cell = _array.get(index);
        return _cell;
    }

    public ArrayList<CellShip> horizontalMap(int _shipSize)
    {
        //CellShip[][] hArrayMap = new CellShip[BOARD_WIDTH-_shipSize][BOARD_HEIGHT];
        ArrayList<CellShip> hMap = new ArrayList<>();

        for (int i = 0; i < (BOARD_WIDTH) ; i++) // discounts the places where a ship can't be instantiate
        {
            for (int j = 0; j < BOARD_HEIGHT; j++)
            {
                CellShip newCell = new CellShip(i, j);
                hMap.add(newCell);
                //(hArrayMap[i][j]) = newCell;
            }
        }
        return hMap;
    }

    // return a single Cell if founded in an ArrayList (by coordinates)
    public CellShip findCellShipByCoordinate(int _x, int _y, ArrayList<CellShip> _cs)
    {
        for (CellShip tempCell : _cs)
        {
            if ((tempCell.getX() == _x) && (tempCell.getY() == _y ))
            {
                return tempCell;
            }
        }
        return null;
    }

    public ArrayList<CellShip> verticalMap(int _shipSize)
    {
        //CellShip[][] vArrayMap = new CellShip[BOARD_WIDTH][BOARD_HEIGHT-_shipSize];
        ArrayList<CellShip> vMap = new ArrayList<>();

        for (int i = 0; i < BOARD_WIDTH ; i++) // discounts the places where a ship can't be instantiate
        {
            for (int j = 0; j < (BOARD_HEIGHT); j++)
            {
                CellShip newCell = new CellShip(i, j);
                vMap.add(newCell);
                //(vArrayMap[i][j]) = newCell;
            }
        }
        return vMap;
    }

    // decides if a headCell can receive a Ship
    public boolean shipPositionValidation(ArrayList<CellShip> _map, int _x, int _y, int _size, Orientation _orientation)
    {
        CellShip currentCell = new CellShip(0,0);

        if (_orientation.equals(Orientation.HORIZONTAL))
        {
            for (int i=0; i < _size ; i++)
            {
                currentCell = findCellShipByCoordinate(_x+i, _y, _map);
                if (currentCell == null)
                {
                    return false;
                }
            }
            return true;
        }
        else // vertical
        {
            for (int i=0; i < _size ; i++)
            {
                currentCell = findCellShipByCoordinate(_x, _y+i, _map);
                if (currentCell == null)
                {
                    return false;
                }
            }
            return true;
        }
    }

/*
    'o' - water hitted
    '.' - water
    'S' - ship
    'x' - Ship hitted
 */
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

                // detecting the 4 states possibles in a cell
                if ( _cellsArray[i][j].isEmpty() )
                {
                    if ( _cellsArray[i][j].isShot() )
                    {
                        System.out.print(" | o ");     //empty cell and hitted
                    }
                    System.out.print(" | . ");         //empty cell and NOT hitted
                }
                else
                {
                    if ( _cellsArray[i][j].isShot() )
                    {
                        System.out.print(" | x ");     //ship and hitted
                    }
                    System.out.print(" | S ");         //ship and NOT hitted
                }
                //System.out.print(" | " + _cellsArray[i][j].getX() + _cellsArray[i][j].getY());
                _line = _cellsArray[i][j].getX();
            }
        }
        System.out.println();
        System.out.print(" ");
        for (int i = 0; i < BOARD_WIDTH ; i++ )  // more label
        {
            System.out.print(" -  " + i);
        }
    }

//    public void getShot (int _shot) {
//        // TODO
//    }
//
//    public void refreshBoard(int _shot, boolean isHited) {
//        // TODO
//    }
}
