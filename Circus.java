public class Circus
{
    private int amtEarned;
    private int fameGained;
    private int numAudience;
    private int price;

    public Circus()
    {
	amtEarned = 0;
	fameGained = 0;
	numAudience = 0;
	price = 15;
    
    }
    
    public int getAmtEarned()
    {
	return amtEarned;
    }

    public int getFameGained()
    {
	return fameGained;
    }
   
    public void results(Player person)
    {
	int sumAppeal = 0;
	int sumTrick = 0;
		
	for (Integer x : person.getAppealVal()){
	    sumAppeal += x;
	} 
	for (Integer x : person.getTrickVal()){
	    sumTrick += x;
	}
		
	numAudience = 	(sumAppeal + (sumTrick * 2)) / 2;

	// only updated fameGained when the animal bought is trained AND is on the gameboard
	for (int i = 0; i < person.getOwnedAnimals().size(); i++) {
	    if (person.getOwnedAnimals().get(i).getIsTrained() && person.getOwnedAnimals().get(i).getIsOnBoard()){
		fameGained += person.getOwnedAnimals().get(i).getAppealVal() * 4;
	    }
	}
    }

    public void setAmtEarned()
    {
	amtEarned = numAudience * price;
    }

    public String toString()
    {
	String retStr = "";
	retStr += "Total amount earned: " + amtEarned + "\n";
	retStr += "Total fame gained: " + fameGained + "\n";
	return retStr;

    }

}
