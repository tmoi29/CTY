import cs1.Keyboard;

public class Woo
{
	private int countMoves;

	public Woo() {
		countMoves = 3; // decide on what number here
	}

	public static void printWelcome()
	{
		System.out.println("\nWelcome to the Animal Circus!\n");
		// add more to the welcome message so user knows how to play
	}

	public static Player createNewPlayer()
	{
		return new Player(); // filler
		// use Keyboard to get user inputs
		// use Player constructor
	}

	public void printMoves()
	{
		System.out.println("You have " + countMoves + " actions left.");
	}

	public static void listAnimals()
	{
		System.out.println("\nChoose one the following to purchase:");
		System.out.println("1) Bear **CHOOSE BEAR FOR NOW**");
		System.out.println("2) Elephant");
		System.out.println("3) Giraffe");
		System.out.println("4) Lion");
		System.out.println("5) RedPanda");
	}

	public static void main(String[] args)
	{

		System.out.println("\nOnly buying an animal is allowed for now!\nTraining the animals and performing the circus will be allowed soon!");

		Woo newGame = new Woo();
		printWelcome();
		Player newPlayer = createNewPlayer();
		Circus newCircus = new Circus();
		//newPlayer.printStartInfo();
		//newCircus.prntStartInfo();

		while (newGame.countMoves > 0) { // for testing only
			newGame.printMoves();
      			
			System.out.println("\nWhat would you like to do?");
			System.out.println("\t" + "1) Preparation **CHOOSE PREPARATION FOR NOW**" + "\n" + "\t" + "2) Circus");
			int input = Keyboard.readInt();

			// preparation
			if (input == 1) {
				System.out.println("\nWould you like to Buy or Train an animal?");
				System.out.println("\t" + "1) Buy **CHOOSE BUY FOR NOW**" + "\n" + "\t" + "2) Train");
				int input2 = Keyboard.readInt();
				// buy
				if (input2 == 1) {
					listAnimals();
					int input3 = Keyboard.readInt();
					if (input3 == 1) {
						Bear newBear = new Bear();
						System.out.println("\n" + newBear);
						newPlayer.buyAnimal(newBear);
						newGame.countMoves -= 1;
						System.out.println();
					}
					else {
						// finish for rest of animals
					}
				}
				else if (input2 == 2) {
					// newPlayer.listOwnedAnimals(); // need to write this method
					// training the animal
				}
				else {
					// catch errors (bad comment, but it's a comment)
				}	
			}
			else if (input == 2) {
				// circus
	    
			}
			else {
				// error handling
			}

		} // end while
		System.out.println("You have 0 actions left.");
				System.out.println("Thank you for playing Animal Circus!");

	} // end main
} // end class