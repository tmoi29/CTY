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

    public String toString()
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
    
    public int[][] getBoard()
    {
        return board;
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
    
    public void addAnimal(Animal someAnimal, int x, int y)
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
                        return;
                    }
                }
                catch (Exception e)
                {
                    System.out.println("Sorry, the animal does not fit there");
                    return;
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
        
    }

    public void removeAnimal(Animal someAnimal, int x, int y)
    {

    }

}
