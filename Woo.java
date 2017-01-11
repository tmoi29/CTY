public class Woo
{
    private int countMoves;


    public Woo() {
	countMoves = 15; // decide on what number here
    }

    public static void printWelcome()
    {
	System.out.println("lorem ipsum");
    }

    public static Player createNewPlayer()
    {
	// use Keyboard to get user inputs
	// use Player constructor
    }

    public static void printStartInfo()
    {

    }

    public static void main(String[] args)
    {
	Woo newGame = Woo();
	printWelcome();
	Player newPlayer = createNewPlayer();
	Circus newCircus = Circus();
	Player.printStartInfo();
	Circus.printStartInfo();
	Woo.printStartInfo();

	

	


    }


}
