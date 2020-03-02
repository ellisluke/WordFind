import java.util.Scanner;
// import java.util.Timer;
// Try using TimerTask library

// TODO
// no duplicate answer options
// double check array range stuff
// perhaps a better timer system

public class Main
{

    public static void main(String[] args)
    {
        String[] wordBank = {"meal","prize","pie","sang","terrible","whole","finger","pig","final","badly","carefully","deeply","belong","fine","die","perhaps","cow","toy","typical","sheet"
                            };
        Grid game = new Grid();
        ScramMethods initialize = new ScramMethods();
        Scanner kb = new Scanner(System.in);
        // Timer gameTime = new Timer();
        long gameStart = System.currentTimeMillis();
        System.out.println("Grid initialized! Timer started! 20 seconds!");
        System.out.println("");

        // Builds the grid
        int[] options = game.grid();
        // Gets the answer (inserted word) from Grid.java
        String ansGetter = game.getter();

        System.out.println("");

        // Print the 3 options for the player to choose from
        System.out.println("User options: ");
        for (int i = 0; i < 3; i++)
        {
            System.out.print(wordBank[options[i]]);
            System.out.print("     ");
        }
        System.out.println();
        System.out.println("Your guess? ");

        // User guess
        String guess = kb.nextLine();

        // System.out.println(guess);
        // System.out.println(ansGetter);

        // Checks if answer is right && less than 20 seconds have passed
        if (guess.equals(ansGetter) && (System.currentTimeMillis() - gameStart) < 20000)
        {
            System.out.println("Congratulations! You win!");
        }
        else if (guess.equals(ansGetter))
        {
            System.out.println("You got it, but didn't answer in time.");
        }
        else
        {
            System.out.println("Aw shucks! You LOSE!");
        }



        // IDEA: rule change, give the player a word bank. Ask "Which ONE of these words is in the chart" and give them maybe 10 seconds
    }
}