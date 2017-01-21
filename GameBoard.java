import java.util.ArrayList;

public class GameBoard
{
    private int[][] board;
    private int boardSize;
    private ArrayList<Animal> roster;
    private ArrayList<int[][]> rosterShapes;

    public GameBoard()
    {
	boardSize = 8;
	board = new int[boardSize][boardSize];
	roster = new ArrayList<Animal>();
	rosterShapes = new ArrayList<int[][]>();
    }

    public String toString()
    {
	String retStr = "";
	for (int x = 0; x < board.length; x += 1) {
	    retStr += "  ";
	    for (int y = 0; y < board[0].length; y += 1) {
		retStr += board[x][y] + " ";
	    }
	    retStr += "\n";
	}
	return retStr;
    }

    public String boardState(int x)
    {
	String retStr = "";
	for (int a = 0; a < board.length - roster.get(x).getLength(); a += 1)
	    {
                retStr += "  ";
		for (int b = 0; b < board[0].length; b += 1)
		    {
			retStr += board[a][b] + " ";
		    }
		retStr += "\n";
	    }
	    
	for (int a = board.length - roster.get(x).getLength(); a < board.length; a += 1)
	    {
                retStr += "  ";
		for (int b = 0; b < board[0].length; b += 1)
		    {
			retStr += board[a][b] + " ";
		    }
                retStr += "   |   ";
		for (int c = 0; c < roster.get(x).getWidth(); c += 1)
		    {
			retStr += roster.get(x).getShape()[a - board.length +  roster.get(x).getLength()][c] + " ";
		    }
		retStr += "\n";
	    }
	    
	retStr += "\nNext to place: " + roster.get(x).getName() + " of length " + roster.get(x).getLength() +
	    " and width " + roster.get(x).getWidth() + "\n";
	return retStr;
    }
    
    
    public int[][] getBoard()
    {
	return board;
    }
    
    public ArrayList<Animal> getRoster(){
	return roster;
    }

    public String getRoster(int i)
    {
	String retStr = "";
	for (int x = 0; x < rosterShapes.get(i).length; x += 1) {
	    for (int y = 0; y < rosterShapes.get(i)[0].length; y += 1) {
		retStr += rosterShapes.get(i)[x][y] + " ";
	    }
	    retStr += "\n";
	}
	retStr += "Next animal to place: " + roster.get(i).getName();
	return retStr;
    }

    public ArrayList<int[][]> getRosterShapes(){
	return rosterShapes;
    }
    
    public boolean addAnimal(Animal someAnimal, int x, int y)
    {
	int[][] animalShape = someAnimal.getShape();

	// returns void if animal does NOT fit
	for (int a = 0; a < animalShape.length; a += 1)
	    {
		for (int b = 0; b < animalShape[0].length; b += 1)
		    {
			try
			    {
				if (animalShape[a][b] + board[x + a][y + b] > 1)
				    {
					return false;
				    }
			    }
			catch (Exception e)
			    {
				System.out.println("Sorry, the animal does not fit there");
				return false;
			    }
		    }
	    }

	// updates board if animal does fit
	for (int a = 0; a < animalShape.length; a += 1)
	    {
		for (int b = 0; b < animalShape[0].length; b += 1)
		    {
			board[a + x][b + y] = animalShape[a][b];
		    }
	    }
	someAnimal.putOnBoard();
	return true;	
    }

    public void reset()
    {
	board = new int[boardSize][boardSize];

    }

    public void expandBoard(int x)
    {
	if (boardSize < 13)
            {
		boardSize += x;
            }
    }
}
