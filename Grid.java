import java.io.*;

public class Grid
{
    String[] wordBank = {"meal","prize","pie","sang","terrible","whole","finger","pig","final","badly","carefully","deeply","belong","fine","die","perhaps","cow","toy","typical","sheet"
                            };
    String answer;

    public int[] grid()
    {
        int bankLength = wordBank.length;
        ScramMethods chosen = new ScramMethods();
        System.out.println(bankLength);
        int selection = (int)(Math.random()*bankLength);
        answer = wordBank[selection];
        System.out.println(answer);
        int[] userOptions = {(int)(Math.random()*selection), (int)((Math.random()*(bankLength - selection)) + selection), selection};

        // Shuffle the options
        int counter = (int)(Math.random()*10 + 5);
        for (int i = 0; i < counter; i++)
        {
            int temp = userOptions[0];
            userOptions[0] = userOptions[2];
            userOptions[2] = userOptions[1];
            userOptions[1] = temp;
        }


        // This one is supposed to print the grid
        chosen.vertGenerate(answer);

        // chosen.horizGenerate(answer);

        // char[] grid


        return userOptions;
    }
    public String[] getter()
    {
        return wordBank;
    }
}