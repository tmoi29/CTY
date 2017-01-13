import cs1.Keyboard;

public class Woo
{
	private int countMoves;


	public Woo() {
		countMoves = 15; // decide on what number here
	}

	public static void printWelcome()
	{
		System.out.println("Welcome...lorem ipsum");
	}

	public static Player createNewPlayer()
	{
		return new Player(); // filler
		// use Keyboard to get user inputs
		// use Player constructor
	}

	public void printStartInfo()
	{
		System.out.println("number of moves: " + countMoves);
	}

	public static void listAnimals()
	{
		System.out.println("list animals: Animal 1, animal 2, 3");
	}

	public static void main(String[] args)
	{
		Woo newGame = new Woo();
		printWelcome();
		Player newPlayer = createNewPlayer();
		Circus newCircus = new Circus();
		//newPlayer.printStartInfo();
		//newCircus.prntStartInfo();
		newGame.printStartInfo();

		System.out.println("What would you like to do?");
		System.out.println("\t" + "1) Preparation" + "\n" + "\t" + "2) Circus");
		int input = Keyboard.readInt();

		if (input == 1) {
			listAnimals();
		}

		else if (input == 2) {
			// preparation
	    
		}
		else {
			//  
	    
		}	  
	
	}

}
