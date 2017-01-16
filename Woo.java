import cs1.Keyboard;

public class Woo
{
    private int countMoves;
    public static final String[] ANIMALS = {"Bear", "Elephant", "Giraffe", "Lion", "RedPanda"};

    public Woo()
    {
        countMoves = 5; // decide on what number here
    }

    public static void printWelcome()
    {
        System.out.println("\nWelcome to the Animal Circus!\n");
        // add more to the welcome message so user knows how to play
    }

    public void printMoves()
    {
        System.out.println("You have " + countMoves + " actions left.");
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

    public static void attemptPurchase(Woo someGame, Player somePlayer, Animal someAnimal)
    {         
        System.out.println();
        System.out.println(someAnimal);
        
        System.out.println();
        System.out.println("Confirm purchase:");
        System.out.println("\t" + "1) Yes.");
        System.out.println("\t" + "2) No.");
        
        int confirmation = Keyboard.readInt();
        
        if (confirmation == 1)
        {
            somePlayer.buyAnimal(someAnimal);
            someGame.countMoves -= 1;
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

        while (newGame.countMoves > 0)
        {
            System.out.println();
            newGame.printMoves();
            System.out.println("What would you like to do?");
            System.out.println("\t" + "1) Buy and train animals.");
            System.out.println("\t" + "2) Skip preparation and start the Animal Circus!");
            
            int prepOrCircus = Keyboard.readInt();

            if (prepOrCircus == 1)
            {
                System.out.println();
                System.out.println("Would you like to buy or train an animal?");
                System.out.println("\t" + "1) Buy!");
                System.out.println("\t" + "2) Train!");
               
                int buyOrTrain = Keyboard.readInt();
                
                if (buyOrTrain == 1)
                {
                    System.out.println();
                    System.out.println("Which animal would you like to buy?");
                    System.out.println(listAnimals());

                    int animalNum = Keyboard.readInt();

                    if (animalNum == 1)
                    {
                        attemptPurchase(newGame, newPlayer, new Bear());

                    }
                    else if (animalNum == 2)
                    {
                        attemptPurchase(newGame, newPlayer, new Elephant());
                    }
                    else if (animalNum == 3)
                    {
                        attemptPurchase(newGame, newPlayer, new Giraffe());
                    }
                    else if (animalNum == 4)
                    {
                        attemptPurchase(newGame, newPlayer, new Lion());
                    }
                    else if (animalNum == 5)
                    {
                        attemptPurchase(newGame, newPlayer, new RedPanda());
                    }                    
                    else
                    {
                        System.out.println();
                        System.out.println("Invalid input, please try again");
                    }
                }
                else if (buyOrTrain == 2)
                {
                    if (newPlayer.getOwnedAnimals().size() > 0)
                    {
                        System.out.println();
                        System.out.println("Which animal would you like to train?");
                        System.out.println(newPlayer.listOwnedAnimals());
                        
                        int trainNum = Keyboard.readInt();

                        if ((newPlayer.getOwnedAnimals().size() >= trainNum) && (trainNum > 0))
                        {
                            newGame.countMoves -= newPlayer.trainAnimal(newPlayer.getOwnedAnimals().get(trainNum - 1));
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
                else
                {
                    System.out.println();
                    System.out.println("Invalid input, please try again");
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
       
        System.out.println("\n\n\n\n");

        System.out.println();
        System.out.println("This is your Circus!");
        System.out.println(newBoard.getBoard());  
       

    } // end main
} // end class
