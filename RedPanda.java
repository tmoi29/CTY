public class RedPanda extends Animal{
    public RedPanda(){
	trickVal = 5;
	trick = "Swing and Slide";
	price = 20;
	appealVal = 30;
	length = 3;
	width = 4;
	shape = new int[][] {{1, 0, 0, 0},
			     {1, 1, 1, 1},
			     {0, 1, 0, 1}};
	isTrained = false;
	isOnBoard = false; 
    }
    public String toString(){
	String retStr = "";
	retStr += "Red Panda: \n";
	retStr += "A smol furry creature that likes to swing on tree branches.\n";
	retStr += "Trick: " + trick;
	retStr += "\nTrick Value: " + trickVal;
	retStr += "\nPrice: " + price;
	retStr += "\nAppeal Value: " + appealVal;
	return retStr;
    }
}
