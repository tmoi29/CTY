public class Giraffe extends Animal{
    public Giraffe(){
	trickVal = 20;
	trick = "Skateboarding while Hula Hooping";
	price = 80;
	appealVal = 120;
	length = 5;
	width = 4;
	shape = new int[][] {{1, 1, 0, 0},
			     {0, 1, 0, 0},
			     {0, 1, 1, 1},
			     {0, 1, 1, 1},
			     {0, 1, 0, 1}};
	isTrained = false;
    }
    public String toString(){
	String retStr = "";
	retStr += "Giraffe: \n";
	retStr += "A tol friendly creature that has a purple sticky tongue.\n";
	retStr += "Trick: " + trick;
	retStr += "\nTrick Value: " + trickVal;
	retStr += "\nPrice: " + price;
	retStr += "\nAppeal Value: " + appealVal;
	return retStr;
    }
}