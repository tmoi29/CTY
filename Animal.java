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
    public boolean train(){
	isTrained = true;
	return isTrained;
    }
    public int setTrickVal(int x){
	return 2;
	//will update later if we have time
    }
    public abstract String toString();

}
