import java.io.*;

public class ScramMethods
{
    // Three different ways of placing a word within the grid

    // Grid dimensions
    final int GRID_ROWS = 10;
    final int GRID_COLS = 10;

    // Placing words horizontally on the grid
    public char horizGenerate(String ans)
    {
        int ansLength = ans.length();
        char[][] bank = new char[GRID_ROWS][GRID_COLS];
        int insertX = (int)(Math.random()*(GRID_COLS - ansLength));
        int insertY = (int)(Math.random()*(GRID_ROWS - ansLength));
        bank[5][5] = 'S';
        // insert the word to 2d array
        for (int k = insertX, j = 0; k < GRID_COLS && j < ansLength; k++, j++)
        {
            bank[insertY][k] = ans.charAt(j);
        };
        /*for (int i = 0, i < GRID_SPACES, i++)
        {
            //for ()
        }*/

        return bank[5][5];
    }
    /*
    // Placing words vertically on the grid
    public char[] vertGenerate(String ans)
    {
        char[] bank = new char[10];
        bank[1] = 'h';
        bank[2] = 's';
        bank[3] = 'f';
        return bank;
    }

    // placing words diagonally on the grid (might not do it if I run out of time)
    public char[] diagGenerate(String ans)
    {
        char[] bank = new char[10];
        bank[1] = 'h';
        return bank;
    } */
}