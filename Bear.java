public class Bear extends Animal{
    public Bear(){
	trickVal = 15;
	trick = "Riding Unicycle";
	price = 60;
	appealVal = 90;
	length = 4;
	width = 4;
	shape = new int[][] {{1, 1, 0, 0},
	    {1, 1, 1, 1},
	    {1, 1, 1, 1},
	    {0, 1, 0, 1}};
	isTrained = false;
        name = "Bear";
	isOnBoard = false;
    }
    public String toString(){
	String retStr = "";
	retStr += "Bear: \n";
	retStr += "A hooge furry creature that likes to give hugs.\n";
	retStr += "Trick: " + trick;
	retStr += "\nTrick Value: " + trickVal;
	retStr += "\nPrice: " + price;
	retStr += "\nAppeal Value: " + appealVal;
	return retStr;
    }
}
