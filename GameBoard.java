import java.util.ArrayList;

public class GameBoard
{
    private int[][] board;
    public ArrayList<Animal> roster;
    public ArrayList<int[][]> rosterShapes;

    public GameBoard()
    {
	board = new int[][] {{0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0},
			     {0, 0, 0, 0, 0, 0, 0, 0, 0},
			     {0, 0, 0, 0, 0, 0, 0, 0, 0},
			     {0, 0, 0, 0, 0, 0, 0, 0, 0}};
	roster = new ArrayList<Animal>();
        rosterShapes = new ArrayList<int[][]>();
    }

    public String getBoard()
    {
        String retStr = "";
        for (int x = 0; x < board.length; x += 1) {
            for (int y = 0; y < board[0].length; y += 1) {
                retStr += board[x][y] + " ";
            }
            retStr += "\n";
        }
        return retStr;
               
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
        retStr += "Next animal to place: A " + roster.get(i).getName();
        return retStr;
    }
    
    public void addAnimal(Animal nameAnimal, int x, int y)
    {

    }

    public void removeAnimal(Animal nameAnimal, int x, int y)
    {

    }

    public String toString()
    {
        return ""; //placeholder
    }

}
