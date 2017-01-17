public abstract class Animal
{
    protected int trickVal;
    protected String trick;
    protected int price;
    protected int appealVal;
    protected int length;
    protected int width;
    protected int[][] shape;
    protected boolean isTrained;
    protected String name;
    protected boolean isOnBoard;

    public int getTrickVal()
    {
	return trickVal;
    }
    public String getTrick()
    {
	return trick;
    }
    public int getPrice()
    {
	return price;
    }
    public int getAppealVal()
    {
	return appealVal;
    }
    public int getLength()
    {
	return length;
    }
    public int getWidth()
    {
	return width;
    }
    public int[][] getShape()
    {
	return shape;
    }
    public boolean getIsTrained()
    {
        return isTrained;
    }
    public boolean train(){
	isTrained = true;
	return isTrained;
    }
    public abstract String toString();
    public String getName() {
	return name;
    }
    public boolean putOnBoard(){
	isOnBoard = true;
	return isOnBoard;
    }
    public boolean removeOffBoard(){
	isOnBoard = false;
	return isOnBoard;
    }
    public boolean getIsOnBoard(){
	return isOnBoard;
    }

}
