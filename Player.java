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
		trickVal = new ArrayList<Integer>();
		appealVal = new ArrayList<Integer>();
		currentFunds = 400;
		amtFame = 0;
		name = n;
	}

	public String toString()
	{
		String retStr = "";
		retStr += "Your current funds: $" + currentFunds + "\n";
		retStr += "Your fame: " + amtFame + " points";
		return retStr;
	}
    
	public String newBalance(Circus c){
		currentFunds += c.getAmtEarned();
		amtFame += c.getFameGained();
		String ret = "Updated Funds: $" + currentFunds;
		ret += "\nUpdated Fame: " + amtFame;
		return ret;
	}
	
	public void buyAnimal(Animal someAnimal)
	{
		if (currentFunds <= 0) {
			System.out.println("You do not have enough money to complete the transaction.");
		}
		else {
			ownedAnimals.add(someAnimal);
			currentFunds -= someAnimal.getPrice();
			System.out.println("\nYou just bought a " + someAnimal.getName() + "!");
			System.out.println("You currently have $" + currentFunds + " left.");
			trickVal.add(someAnimal.getTrickVal());
			appealVal.add(someAnimal.getAppealVal());
		}
	}

	public String listOwnedAnimals()
	{
		String retStr = "";
        
		for (int x = 0; x < ownedAnimals.size(); x += 1)
		{
			if (ownedAnimals.get(x).isTrained) {
				retStr += "\t" + (x + 1) + ") " + ownedAnimals.get(x).name + "\t#ALREADY TRAINED#" + "\n";

			}
			else {
				retStr += "\t" + (x + 1) + ") " + ownedAnimals.get(x).name + "\n";
                   
			}

		}
		return retStr.substring(0, retStr.length() - 1);
	}


	public int trainAnimal(Animal someAnimal)
	{
		if (someAnimal.getIsTrained())
		{
			System.out.println("This animal is already trained.");
			return 0;
		}
		else
		{
			someAnimal.train();
			return 1;
		}
	}
	public ArrayList<Integer> getTrickVal() {
		return trickVal;
	}
	public ArrayList<Integer> getAppealVal() {
		return appealVal;
	}

	public ArrayList<Animal> getOwnedAnimals()
	{
		return ownedAnimals;
	}
	
	public String getName() {
		return name;
	}

}
