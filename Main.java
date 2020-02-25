public class Main
{
    public static void main(String[] args)
    {
        Grid game = new Grid();
        ScramMethods initialize = new ScramMethods();
        System.out.println("Grid initialized!");
        game.grid();

        // IDEA: rule change, give the player a word bank. Ask "Which ONE of these words is in the chart" and give them maybe 10 seconds
    }
}