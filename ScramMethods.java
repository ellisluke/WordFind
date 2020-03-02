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
        int insertY = (int)(Math.random()*(GRID_ROWS));
        // bank[5][5] = 'S';

        // This for loop that first fills the whole array with random alpha chars
        for (int h = 0; h < GRID_ROWS; h++)
        {
            for (int i = 0; i < GRID_COLS; i++)
            {
                bank[h][i] = (char)(Math.random()*26 + 'a');
                // System.out.println(bank[h][i]);
            }
        }

        // insert the word to 2d array
        for (int k = insertX, j = 0; k < GRID_COLS && j < ansLength; k++, j++)
        {
            bank[insertY][k] = ans.charAt(j);
            // System.out.println(bank[insertY][k]);
        };

        // prints the bank[][] array with spaces in between
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.print(bank[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        return bank;
    }

    // Placing words vertically on the grid
    public char[][] vertGenerate(String ans)
    {
        // similar set up stuff as above
        int ansLength = ans.length();
        char[][] bank = new char[GRID_ROWS][GRID_COLS];
        int insertX = (int)(Math.random()*(GRID_COLS));
        int insertY = (int)(Math.random()*(GRID_ROWS - ansLength));

        // This for loop first fills the whole array with RANDOM alpha chars
        for (int h = 0; h < GRID_ROWS; h++)
        {
            for (int i = 0; i < GRID_COLS; i++)
            {
                bank[h][i] = (char)(Math.random()*26 + 'a');
                // bank[h][i] = 't';
                // System.out.println(bank[h][i]);
            }
        }

        // Inserts the answer word into the array
        for (int i = insertY, j = 0; i < GRID_COLS && j < ansLength; i++, j++)
        {
            bank[i][insertX] = ans.charAt(j);
        }

        // prints the bank[][] array with spaces between each letter
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.print(bank[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        return bank;
    }
/*
    // placing words diagonally on the grid (might not do it if I run out of time)
    public char[] diagGenerate(String ans)
    {
        char[] bank = new char[10];
        bank[1] = 'h';
        return bank;
    } */

    // ADD METHOD FOR PRINTING THE GRID???
    // In general, the beginning of these functions will be similar. Maybe can use some abstraction if there is time

}