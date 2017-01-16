public class Elephant extends Animal{
    public Elephant(){
	trickVal = 20;
	trick = "Balancing on Ball";
	price = 80;
	appealVal = 120;
	length = 6;
	width = 6;
	shape = new int[][] {{0, 0, 1, 1, 0, 0},
			     {1, 1, 0, 0, 0, 0},
			     {0, 0, 1, 1, 0, 0},
			     {0, 0, 1, 1, 1, 1},
			     {0, 0, 1, 1, 1, 1},
			     {0, 0, 0, 1, 0, 1}};
	isTrained = false;
	isOnBoard = false;
    }
    public String toString(){
	String retStr = "";
	retStr += "Elephant: \n";
	retStr += "A hooge friendly creature that likes to play with water.\n";
	retStr += "Trick: " + trick;
	retStr += "\nTrick Value: " + trickVal;
	retStr += "\nPrice: " + price;
	retStr += "\nAppeal Value: " + appealVal;
	return retStr;
    }
}
