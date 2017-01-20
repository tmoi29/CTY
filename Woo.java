import cs1.Keyboard;

public class Woo
{
	private int countMoves;
	private boolean gameRunning;
    
	public static final String[] ANIMALS = {"Bear", "Elephant", "Giraffe", "Lion", "RedPanda"};

	public Woo()
	{
		countMoves = 8; // decide on what number here
		gameRunning = true;
	}

	public static void printWelcome()
	{
		System.out.println("\nWelcome to the Animal Circus!\n");
		System.out.println("You will start out with 8 moves, $400 to spend, and 0 fame points.\nBuy and train animals so that at the end of each circus, \nyou make money and gain fame points! \n\nHAVE FUN!!!!\n");
	}                                       

	public void printMoves()
	{
		System.out.print(", you have " + countMoves + " actions left. ");
	}

	public static String listAnimals()
	{
		String retStr = "";
		for (int i = 0; i < ANIMALS.length; i += 1) 
		{
			retStr += "\t" + (i + 1) + ") " + ANIMALS[i] + "\n";
		}
		return retStr;
	}

	public static void attemptPurchase(Woo someGame, Player somePlayer, Animal someAnimal, GameBoard someBoard)
	{         
		System.out.println();
		System.out.println(someAnimal);
        
		System.out.println();
		System.out.println("Confirm purchase:");
		System.out.println("\t" + "1) Yes.");
		System.out.println("\t" + "2) No.");
        
		System.out.print("Selection: ");
		int confirmation = Keyboard.readInt();
                
		while (confirmation != 1 && confirmation != 2) {
			System.out.println ("Invalid number selected. Please enter a valid number for confirmation.");
			System.out.print("Selection: ");
			confirmation = Keyboard.readInt();
		}
        
		if (confirmation == 1)
		{
			somePlayer.buyAnimal(someAnimal);
			someGame.countMoves -= 1;
			someBoard.getRoster().add(someAnimal);
			someBoard.getRosterShapes().add(someAnimal.getShape());
		}
		else
		{
			System.out.println("No purchase made.");
		}
	}

	public static void main(String[] args)
	{
		printWelcome();
        
		Woo newGame = new Woo();
		System.out.print("You are the owner of the Animal Circus. What is your name?" + "\n\t> ");
		Player newPlayer = new Player(Keyboard.readString());
		Circus newCircus = new Circus();
		GameBoard newBoard = new GameBoard();

		System.out.println();
		System.out.println(newPlayer);

		while (newGame.gameRunning)
		{
                
			while (newGame.countMoves > 0)
			{
				System.out.println();
				System.out.print(newPlayer.getName());
				newGame.printMoves();
				System.out.println("What would you like to do?");
				System.out.println("\t" + "1) Buy and train animals.");
				System.out.println("\t" + "2) Skip preparation and start the Animal Circus!");
            
				System.out.print("Selection: ");
				int prepOrCircus = Keyboard.readInt();
                        
				while (prepOrCircus != 1 && prepOrCircus != 2) {
					System.out.println ("Invalid number selected. Please enter a valid number for selection.");
					System.out.print("Selection: ");
					prepOrCircus = Keyboard.readInt();
				}

				if (prepOrCircus == 1)
				{
					System.out.println();
					System.out.println("Would you like to buy or train an animal?");
					System.out.println("\t" + "1) Buy!");
					System.out.println("\t" + "2) Train!");
               
					System.out.print("Selection: ");
					int buyOrTrain = Keyboard.readInt();
                                
					while (buyOrTrain != 1 && buyOrTrain != 2) {
						System.out.println ("Invalid number selected. Please enter a valid number for selection.");
						System.out.print("Selection: ");
						buyOrTrain = Keyboard.readInt();
					}
                
					if (buyOrTrain == 1)
					{
						System.out.println();
						System.out.println("Which animal would you like to buy?");
						System.out.print(listAnimals());

						System.out.print("Selection: ");
						int animalNum = Keyboard.readInt();
                                        
						while (animalNum != 1 && animalNum != 2 && animalNum != 3 && animalNum != 4 && animalNum != 5) {
							System.out.println ("Invalid number selected. Please enter a valid number for selection.");
							System.out.print("Selection: ");
							animalNum = Keyboard.readInt();
						}

						if (animalNum == 1)
						{
							attemptPurchase(newGame, newPlayer, new Bear(), newBoard);
						}
						else if (animalNum == 2)
						{
							attemptPurchase(newGame, newPlayer, new Elephant(), newBoard);
						}
						else if (animalNum == 3)
						{
							attemptPurchase(newGame, newPlayer, new Giraffe(), newBoard);
						}
						else if (animalNum == 4)
						{
							attemptPurchase(newGame, newPlayer, new Lion(), newBoard);
						}
						else
						{
							attemptPurchase(newGame, newPlayer, new RedPanda(), newBoard);
						}                    
					}
					else
					{
						if (newPlayer.getOwnedAnimals().size() > 0)
						{
							System.out.println();
							System.out.println("Which animal would you like to train?");
							System.out.println(newPlayer.listOwnedAnimals());
                        
							System.out.print("Selection: ");
							int trainNum = Keyboard.readInt();
                                                
							while (trainNum > newPlayer.getOwnedAnimals().size()) {
								System.out.println ("Invalid number selected. Please enter a valid number for selection.");
								System.out.print("Selection: ");
								trainNum = Keyboard.readInt();
							}

							if ((newPlayer.getOwnedAnimals().size() >= trainNum) && (trainNum > 0))
							{
								newGame.countMoves -= newPlayer.trainAnimal(newPlayer.getOwnedAnimals().get(trainNum - 1));
								System.out.println("\nSuccessfully trained!");
							}
							else
							{
								System.out.println();
								System.out.println("Invalid input, please try again");
							}
						}
						else
						{
							System.out.println();
							System.out.println("You do not own any animals!");
						}
					}
				}       
				else if (prepOrCircus == 2)
				{
					if (newPlayer.getOwnedAnimals().size() > 0)
					{
						break;       
					}
					else
					{
						System.out.println();
						System.out.println("Please buy an animal before starting the circus.");
					}
				}
				else
				{
					System.out.println();
					System.out.println("Invalid input, please try again");
				}
			} // end while
        
			if (newGame.countMoves == 0)
			{
				System.out.println();
				System.out.println("You are out of actions.");
				System.out.println("It's time to go to the Animal Circus!");
			}

			System.out.println("\n\n\n");
			System.out.println();
			System.out.println("This is your Circus!");
			System.out.println(newBoard);
		
			int i = 0;
			while (i < newBoard.getRoster().size()){
				System.out.println(newBoard.getRoster(i));

				System.out.println("\nWhat would you like to do?");
				System.out.println("\t1) Place this animal");
				System.out.println("\t2) Skip to next animal");
				System.out.println("\t3) End the circus right now");
				System.out.print("Selection: ");
				int placeAnimal = Keyboard.readInt();

				while (placeAnimal != 1 && placeAnimal != 2 && placeAnimal != 3)
				{
					System.out.println ("Invalid number selected. Please enter a valid number for selection.");
					System.out.print("Selection: ");
					placeAnimal = Keyboard.readInt();
				}
                        
				if (placeAnimal == 1)
				{
					System.out.println("\nInput Row, Column coordinates");
					System.out.print("Row coordinate: ");
					int x = Keyboard.readInt();
					System.out.print("Column coordinate: ");
					int y = Keyboard.readInt();
			
					if (newBoard.addAnimal(newBoard.getRoster().get(i), x, y)){
						System.out.println("\n" + newBoard);
						i += 1;
					}
					else{
						System.out.println("\n\nIt doesn't fit. Try again.\n\n");
						System.out.println(newBoard);
					}
                            
				}
				else if (placeAnimal == 2)
				{
					i += 1;
				}
				else
				{
					break;
				}
			}

			newCircus.results(newPlayer);
			newCircus.setAmtEarned();
			System.out.println(newCircus);
			System.out.println(newPlayer.newBalance(newCircus));

			System.out.println("Would you like to continue playing?");
			System.out.println("\t1) Yes");
			System.out.println("\t2) No, show me the final results");
			System.out.print("Selection: ");
			int keepPlaying = Keyboard.readInt();

			while (keepPlaying != 1 && keepPlaying != 2)
			{  
				System.out.println ("Invalid number selected. Please enter a valid number for selection.");
				System.out.print("Selection: ");
				keepPlaying = Keyboard.readInt();
			}
			if (keepPlaying == 1)
			{
				newGame.countMoves = 8;
				newBoard.expandBoard(1);
				newBoard.reset();
			}
                
			if (keepPlaying == 2)
			{
				newGame.gameRunning = false;
			}
		} // end while

		System.out.print("\n" + newPlayer.getName());
		System.out.print(", thanks for playing!\n");
		String owned = "| ";
		for (Animal someAnimal : newPlayer.getOwnedAnimals())
		{
			owned += someAnimal.getName() + " |";
		}
		System.out.println("Animals you owned: " + owned);
		System.out.println(newPlayer);
		System.out.println("\n\n");
                
                
	} // end main
} // end class
