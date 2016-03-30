package com.dalton.aula03;


import java.util.ArrayList;
import java.util.Random;
import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class GameController {

    /**
     * @author dalton on 3/18/16.
     */

    public enum Orientation {HORIZONTAL, VERTICAL }
    final int BOARD_WIDTH = 5;  //hardcoded for now
    final int BOARD_HEIGHT = 5;
    private Random randomGenerator;
    Grid newBoard = new Grid(BOARD_WIDTH,BOARD_HEIGHT);      // instantiate a new board

    //ArrayList<CellShip> _cellsArray = new ArrayList<>();    // reference to cells in the board
    CellShip[][] _cellsArray = newBoard.getBoard();          //  reference to cells in the board
    ArrayList<CellShip> hMap = horizontalMap();             // map that allocate free cells to spawn horizontal ships
    ArrayList<CellShip> vMap = verticalMap();
    ArrayList<Ship> _shipArray = newBoard.getShipArrayList();    // get a reference to the board (inside grid object)

    // The pattern that will apply to the user guess
    private String PATTERN_USER_GUESS = "^\\d{1,2}-\\d{1,2}$";
    private Scanner SCANNER = new Scanner(System.in);


    public void Update()
    {
        int numberOfGuesses = 2;
        do
        {
//            System.out.println();
//            System.out.print("Please make a guess (in format x-y): ");

            CellShip userGuessCell = null;

            while ( userGuessCell == null )
            {
                userGuessCell = this.getUserGuess();
                this.drawBoard();
            }

            /*
            in this point, the shot is valid.
             */
            userGuessCell.setShot(true);
            if (userGuessCell.isEmpty() )       //check if we hit water
            {
                numberOfGuesses--;
                System.out.println();
                System.out.println("Miss! Water Shot!" + " Guesses remaining: " + numberOfGuesses);
                //this.drawBoard();
            }
            else                                // we hit a ship
            {
                System.out.println();
                System.out.println("You hit a ship!" + " Guesses remaining: " + numberOfGuesses);
                userGuessCell.setHit(true);
                //verify if the ship is completely hit
            }
            this.drawBoard();

            if (_shipArray.isEmpty() )
            {
                System.out.println("You WIN! Congratulation!");
            }

        } while (numberOfGuesses > 0);  //checking end of game

        System.out.println("");
        System.out.println("You LOSE! No more guesses!");

    }

    public void startGame()
    {

        /*
        pick a cell from an ArrayListMap (horizontal ou vertical)
        if (shipPositionValidation is true - all cell need are available)
        then: instantiate Ship and refresh the map (marking cell as occupied)
        else: refresh the map with the headCell occupied and loop
        */

        CellShip currentCell;    //just instantiating a empty cell
        int shipSize = 3;
        int totalNumberOfShips = 3;
        int maxAttempts = totalNumberOfShips + 10;
        while ( totalNumberOfShips > 0 && maxAttempts > 0 )  // looping till instantiate all the ships (or cant place anymore ships)
        {
            if (hMap.isEmpty() )
            {
                System.out.println("ERROR! No more cells available to instantiate Ships!");
                return;
            }
            else
            {
                currentCell = pickRandomCell(hMap);  //get a random cell from the map}
            }

            int currentX = currentCell.getX();
            int currentY = currentCell.getY();

            if (shipPositionValidation(hMap, currentX, currentY, shipSize, Orientation.HORIZONTAL) )  //verifies all position of the new ship
            {
                // it is possible to alocate the entire ship
                Ship newShip = new Ship();  //instantiate a new ship
                newBoard.addShip(newShip);  // add a Ship to the Grid ArrayList<Ship> in order to control the ships in the board

                for (int i = 0; i < shipSize ; i++)
                {
                    newBoard.addShipByCoordinate(currentX + i, currentY);       // set the cell to empty in main grid
                    hMap.remove(hMap.indexOf( findCellShipByCoordinate(currentX+i, currentY, hMap) ) ); // remove the occupied cell from the map
                    newShip.addBodyCells(_cellsArray[currentX+i][currentY]);   // add a Cell to the ArrayList of a Ship
                }
                // counter of instantiated ships
                totalNumberOfShips--;
            }
            else  // not possible to allocate the ship
            {
                hMap.remove (hMap.indexOf(findCellShipByCoordinate(currentX, currentY, hMap) ) ); // remove the occupied cell from the map
                maxAttempts--;  //to prevent an infinite loop
            }
        }

        this.drawBoard();  // draw a board to the screen
    }


    /**
     * Ask the user for a guess
     * @return guess {Cell}
     * @author Lucas Pinheiro @lucaspin at github
     */
    public CellShip getUserGuess() {
        CellShip userGuessCell = null;
        String guess; //= null;

        System.out.println();
        System.out.println("Inform your next guess: ");
        guess = SCANNER.nextLine();

        // Check if user guess follows the pattern
        if (Pattern.matches(PATTERN_USER_GUESS, guess)) {
            int splitPoint = guess.indexOf("-");
            int xPoint = Integer.parseInt(guess.substring(0, splitPoint));
            int yPoint = Integer.parseInt(guess.substring(splitPoint + 1));

            if (xPoint < BOARD_WIDTH && yPoint < BOARD_HEIGHT) {
                userGuessCell = findCellShipByCoordinate(xPoint,yPoint,newBoard.getCellArrayList() );
                if ( userGuessCell.isShot() )
                {
                    System.out.println("==> Cell was already been shot! Make a new guess!");
                    return null;
                }
            } else {
                System.out.println("==> Your guess does not fit into this grid!");
                // userGuessCell = null;
                return null;
            }

        } else {
            System.out.println("==> Your guess does not follow the supported format.");
            System.out.println("==> Remember: A guess must be a number followed by a hiphen followed by a number.");
            //userGuessCell = null;
            return null;
        }

        return userGuessCell;
    }

    public CellShip pickRandomCell(ArrayList<CellShip> _array)
    {
        randomGenerator = new Random();
        int index = randomGenerator.nextInt(_array.size() );
        //System.out.println("Size " + _array.size() + "sorteado" + index);

        CellShip _cell = _array.get(index);
        return _cell;
    }

    public ArrayList<CellShip> horizontalMap()
    {
        ArrayList<CellShip> hMap = new ArrayList<>();

        for (int i = 0; i < (BOARD_WIDTH) ; i++)
        {
            for (int j = 0; j < BOARD_HEIGHT; j++)
            {
                CellShip newCell = new CellShip(i, j);
                hMap.add(newCell);
            }
        }
        return hMap;
    }

    public ArrayList<CellShip> verticalMap()
    {
        ArrayList<CellShip> vMap = new ArrayList<>();

        for (int i = 0; i < BOARD_WIDTH ; i++)
        {
            for (int j = 0; j < (BOARD_HEIGHT); j++)
            {
                CellShip newCell = new CellShip(i, j);
                vMap.add(newCell);
            }
        }
        return vMap;
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

    // decides if a headCell can receive a Ship
    public boolean shipPositionValidation(ArrayList<CellShip> _map, int _x, int _y, int _size, Orientation _orientation)
    {
        if (_orientation.equals(Orientation.HORIZONTAL))
        {
            for (int i=0; i < _size ; i++)
            {
                CellShip currentCell = findCellShipByCoordinate(_x+i, _y, _map);
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
                CellShip currentCell = findCellShipByCoordinate(_x, _y+i, _map);
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
        System.out.println();
        int _line = BOARD_HEIGHT - 1;
        System.out.print(_line);  // printing the label

        for (int i = BOARD_HEIGHT-1 ; i>= 0 ; i-- )    // print all the cells in the arraylist
        {
            for (int j = 0; j < BOARD_WIDTH; j++)
            {
                if ( _line != _cellsArray[i][j].getX() )  // detect when we change lines, and jump a line
                {
                    System.out.println("");
                    System.out.print(_line - 1);  // printing the label
                }

                // detecting the 4 states possibles in a cell
                if ( _cellsArray[j][i].isEmpty() )
                {
                    if ( _cellsArray[j][i].isShot() )
                    {
                        System.out.print(" | o ");     //empty cell and hit
                    }
                    else
                    {
                        System.out.print(" | . ");         //empty cell and NOT hit
                    }
                }
                else
                {
                    if ( _cellsArray[j][i].isShot() )
                    {
                        System.out.print(" | x ");     //ship and hited
                    }
                    else
                    {
                        System.out.print(" | S ");         //ship and NOT hited
                    }
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
