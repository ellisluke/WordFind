import java.io.*;

public class ScramMethods
{
    // Three different ways of placing a word within the grid

    // Grid dimensions
    final int GRID_ROWS = 10;
    final int GRID_COLS = 10;

    // Placing words horizontally on the grid
    public char[][] horizGenerate(String ans)
    {
        int ansLength = ans.length();
        char[][] bank = new char[GRID_ROWS][GRID_COLS];
        // below chooses coordinates for first letter, makes sure the word fits horizontally
        int insertX = (int)(Math.random()*(GRID_COLS - ansLength));
        int insertY = (int)(Math.random()*(GRID_ROWS - ansLength));
        bank[5][5] = 'S';

        // TODO for loop that first fills the whole array with random alpha chars
        for (int h = 0, h < GRID_ROWS, h++)
        {
            for (int i = 0, i < GRID_COLS, i++)
            {
                bank[h][i] = "t";
            }
        }

        // insert the word to 2d array
        for (int k = insertX, k < GRID_COLS, k++)
        {
            bank[insertY][k] = ans.charAt(j);
        };
        /*for (int i = 0, i < GRID_SPACES, i++)
        {
            //for ()
        }*/

        return bank;
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