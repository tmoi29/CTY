public class GameBoard
{
    private int[][] board;
    public Animal[] roster;

    public GameBoard()
    {
	board = new int[][] {{0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0}};


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
