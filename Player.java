
public class Player
{
    boolean male;
    Car car;
    int money;
    int debt;
    String name;
    int spaceNum;
    int houses;
    boolean college;//false if career
    int secret;
    int salary;
    String career;
    String house;
    int kidCount;
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
    
    public String getName()
    {
        return name;
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
    
    public boolean getCollege()
    {
        return college;
    }
    
    public void setCollege(boolean c)
    {
        college = c;
    }
    
    public void addSecret(int x)
    {
        secret+=x;
    }
    public int getSecret()
    {
        return secret;
    }
    public void setSalary(int x)
    {
        salary =x;
    }
    public int returnSalary()
    {
        return salary;
    }
    public void raise(int x)
    {
        salary+=x;
    }
    public void setCareer(String x)
    {
        career=x;
    }
    public String getCareer()
    {
        return career;
    }
    public void setHouse(String h)
    {
        house = h;
    }
    public String getHouse()
    {
        return house;
    }
    public void addKids(int x)
    {
        kidCount+=x;
    }
    public int getKids()
    {
        return kidCount;
    }
    public int getTaxes()
    {
        return salary/5;
    }
    public int getCruiseAmount()
    {
        return (25000 + (kidCount*5000));
    }
    public int getRetireAmount()
    {
        return (10000*kidCount);
    }
    //add getters and setters
    //add space method: takes current space and adds space
    
}
