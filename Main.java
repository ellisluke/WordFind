import java.util.Scanner;
import java.util.Timer;
// Try using TimerTask library

public class Main
{

    public static void main(String[] args)
    {
        String[] wordBank = {"meal","prize","pie","sang","terrible","whole","finger","pig","final","badly","carefully","deeply","belong","fine","die","perhaps","cow","toy","typical","sheet"
                            };
        Grid game = new Grid();
        ScramMethods initialize = new ScramMethods();
        Scanner kb = new Scanner(System.in);
        Timer gameTime = new Timer();
        boolean won = false;
        boolean guessed = false;
        long gameStart = System.currentTimeMillis();
        System.out.println("Grid initialized! Timer started! 20 seconds!");
        int[] options = game.grid();
        String ansGetter = game.getter();
        String ans = "hey";

        // Print the options for the player to choose from
        System.out.println("User options: ");
        for (int i = 0; i < 3; i++)
        {
            System.out.print(wordBank[options[i]]);
            System.out.print("     ");
        }
        System.out.println();
        System.out.println(System.currentTimeMillis());
        System.out.print("Your guess? ");

        // System.out.println(guess);

        String guess = kb.nextLine();

        System.out.println(guess);
        System.out.println(ansGetter);

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