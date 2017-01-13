import java.util.ArrayList;

public class Player
{
    private String name;
    private int currentFunds;
    private int amtFame;
    private ArrayList<Animal> ownedAnimals;
    private ArrayList<Boolean> trained;
    private int price;

    public Player()
    {
        ownedAnimals = new ArrayList<Animal>();
    }


    public void buyAnimal(Animal someAnimal)
    {
        // check if enough money
        // do purchase confirmation
        ownedAnimals.add(someAnimal);

    }
    
    public void trainAnimal(Animal nameAnimal, int numTimes)
    {
	nameAnimal.train();

    }

    public void setPrice(int val)
    {

    }
    public void listOwnedAnimals(){

    }


}
