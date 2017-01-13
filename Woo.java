import cs1.Keyboard;

public class Woo
{
    private int countMoves;

    public Woo() {
	countMoves = 15; // decide on what number here
    }

    public static void printWelcome()
    {
	System.out.println("Welcome to the Animal Circus!\n");
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
        System.out.println("Choose one the following to purchase:");
	System.out.println("1) Bear");
        System.out.println("2) Elephant");
        System.out.println("3) Giraffe");
        System.out.println("4) Lion");
        System.out.println("5) RedPanda");
    }

    public static void main(String[] args)
    {
	Woo newGame = new Woo();
	printWelcome();
	Player newPlayer = createNewPlayer();
	Circus newCircus = new Circus();
	//newPlayer.printStartInfo();
	//newCircus.prntStartInfo();

        while (true) { // for testing only
       	newGame.printMoves();
      
	System.out.println("What would you like to do?");
	System.out.println("\t" + "1) Preparation" + "\n" + "\t" + "2) Circus");
	int input = Keyboard.readInt();

	if (input == 1) {
            System.out.println("Would you like to Buy or Train an animal?");
            System.out.println("\t" + "1) Buy" + "\n" + "\t" + "2) Train");
            int input2 = Keyboard.readInt();
            if (input2 == 1) {
                listAnimals();
                int input3 = Keyboard.readInt();
                if (input3 == 1) {
                    Bear newBear = new Bear();
                    System.out.println(newBear);
                    newPlayer.buyAnimal(newBear);
                    newGame.countMoves -= 1;
                    System.out.println();
                }
                else {
                    // finish for rest of animals
                }
            }
        }
	else if (input == 2) {
	    // preparation
	    
	}
	else {
	    // error handling
        }
        
        }
    }
}
