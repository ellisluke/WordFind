import java.util.Scanner;
import java.util.Timer;

public class Main
{
    public static void main(String[] args)
    {
        Grid game = new Grid();
        ScramMethods initialize = new ScramMethods();
        Scanner kb = new Scanner(System.in);
        Timer gameTime = new Timer();
        boolean won = false;
        boolean guessed = false;
        long gameStart = System.currentTimeMillis();
        System.out.println("Grid initialized! Timer started! 20 seconds!");
        int[] options = game.grid();
        String[] getter = game.getter();
        String ans = "hey";

        // Print the options for the player to choose from
        System.out.println("User options: ");
        for (int i = 0; i < 3; i++)
        {
            System.out.print(getter[options[i]]);
            System.out.print("     ");
        }
        System.out.println();
        System.out.println(System.currentTimeMillis());
        System.out.print("Your guess? ");
        String guess = "";

        // System.out.println(guess);

        while (!guessed)
        {
            if (((System.currentTimeMillis() - gameStart) < 20000))
            {
                guess = kb.next();
                if (guess != "")
                {
                    guessed = true;
                }
            }
            else
            {
                break;
            }
        }
        System.out.println();

        if (guess == ans)
        {
            System.out.println("Congratulations! You win!");
        }
        else
        {
            System.out.println("Aw shucks! You LOSE!");
        }



        // IDEA: rule change, give the player a word bank. Ask "Which ONE of these words is in the chart" and give them maybe 10 seconds
    }
}