import java.io.*;

public class Grid
{
    public int grid()
    {
        String[] wordBank = {"meal","prize","pie","sang","terrible","whole","finger","pig","final","badly","carefully","deeply","belong","fine","die","perhaps","cow","toy","typical","sheet"
                                };
        int bankLength = wordBank.length;
        ScramMethods chosen = new ScramMethods();
        System.out.println(bankLength);
        String answer = wordBank[(int)(Math.random()*bankLength)];
        System.out.println(answer);
        System.out.println(chosen.horizGenerate(answer));

        // char[] grid


        return bankLength;
    }
}