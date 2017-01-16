import java.util.ArrayList;

public class Player
{
    private String name;
    private int currentFunds;
    private int amtFame;
    private ArrayList<Animal> ownedAnimals;
    private ArrayList<Integer> trickVal;
    private ArrayList<Integer> appealVal;
    //private int price;

    public Player(String n)
    {
        ownedAnimals = new ArrayList<Animal>();
	currentFunds = 400;
	amtFame = 0;
	name = n;
    }


    public void buyAnimal(Animal someAnimal)
    {
	if (currentFunds <= 0) {
	    System.out.println("You do not have enough money to complete the transaction.");
	}
	else {
	    ownedAnimals.add(someAnimal);
	    currentFunds -= someAnimal.getPrice();
	    System.out.println("You just bought a " + someAnimal.getName() + "!");
	    System.out.println("You currently have $" + currentFunds + " left.");
	}
    }

    public void listOwnedAnimals()
    {
	System.out.println("Which animal would you like to train?");
        for (int x = 0; x < ownedAnimals.size(); x += 1)
            {
                if (ownedAnimals.get(x).isTrained) {
                    System.out.println(x + ") " + ownedAnimals.get(x).name + "\tALREADY TRAINED");
					trickVal.add(ownedAnimals.get(x).getTrickVal());
				    appealVal.add(ownedAnimals.get(x).getAppealVal());
                }
                else {
                    System.out.println(x + ") " + ownedAnimals.get(x).name);
        
                }

            }             
    }


    public boolean trainAnimal(Animal someAnimal)
    {
        return someAnimal.train();
    }

    public ArrayList<Animal> getOwnedAnimals()
    {
        return ownedAnimals;
    }

}
