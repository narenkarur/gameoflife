
public class Player
{
    boolean male;
    Car car;
    int money;
    int debt;
    String name;
    int spaceNum;
    int houses;
    public Player(boolean m, String n)
    {
        car = new Car();
        male=m;
        car.addPeg(male);
        name=n;
        spaceNum=0;
        money=0;
    }
    
    public void addSpace(int n)
    {
        spaceNum+=n;
    }
    
    public int getSpaceNum()
    {
        return spaceNum;
    }
    
    public int getMoney()
    {
        return money;
    }
   
    public void addMoney(int x)
    {
        money+=x;
    }
    
    public void checkForAction()
    {
        //THIS CONTROLS ALL THE ASSETS AND THEIR FUNCTIONS
    }
    
    public void addHouse()
    {
        //choose one of the house deed cards, that's the house you get
        //this affects your cost per turn that is controlled in the checkForAction
    }
    //add getters and setters
    //add space method: takes current space and adds space
    
}
