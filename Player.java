import java.util.ArrayList;

public class Player
{
    private String name;
    private int currentFunds;
    private int amtFame;
    private ArrayList<Animal> ownedAnimals;
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

    public void listOwnedAnimals()
    {
        System.out.println("Which animal would you like to train?");
        for (int x = 0; x < ownedAnimals.size(); x += 1)
            {
                if (ownedAnimals.get(x).isTrained) {
                    System.out.println(x + ") " + ownedAnimals.get(x).name + "\tALREADY TRAINED");
                }
                else {
                    System.out.println(x + ") " + ownedAnimals.get(x).name);
        
                }

            }
        System.out.println("WORK IN PROGRESS\n");
             
    }


    public void trainAnimal(Animal someAnimal, int numTimes)
    {
        //someAnimal.train();

    }

    public void setPrice(int val)
    {

    }


}
