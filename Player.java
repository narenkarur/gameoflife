
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
    int lifeTileNumber;
    boolean isDone;
    boolean ifSpouse;
    String action;
    public Player(boolean m, String n)
    {
        car = new Car();
        male=m;
        car.addPeg(male);
        name=n;
        spaceNum=0;
        money=0;
        career="";
        lifeTileNumber=0;
        ifSpouse=false;
        house="";
        action="";
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
    public boolean hasJob()
    {
        if(career.equals("")) return false;
        else return true;
    }
    public int getLifeTileNumber()
    {
        return lifeTileNumber;
    }
    public void addLife(int x)
    {
        lifeTileNumber+=x;
    }
    public void setDone()
    {
        isDone=true;
    }
    public boolean getDone()
    {
        return isDone;
    }
    public int getTotalMoney()
    {
        return money+secret;
    }
    public boolean getSpouse()
    {
        if(getSpaceNum()>=5)
        {
            ifSpouse=true;
        }        
        return ifSpouse;
    }
    public String getSpouseStatement()
    {
        if(getSpaceNum()>=5)
        {
            ifSpouse=true;
        }
        if(ifSpouse)
        {
            return("You are married.");
        } else return ("You are not married, you fat loser.");
    }
    public void setSpouse(boolean b)
    {
        ifSpouse=b;
    }
    public String getHouseStatement()
    {
        if(house.equals("")) return ("You live with your mom. Loser.");
        else return("You live in a " + getHouse());
    }
<<<<<<< HEAD
    public String getJobStatement()
    {
        if(career.equals(""))
        {
            return("You are unemployed, haha.");
        } else
        {
            return("You are a " + career + " and earn $" + salary + ".");
        }
    }
=======
    
    public String getJobStatement()
    {
        if(career=="")
        {
            return "You are unemployed :(";
        } else return "You are a " + getCareer() + " and earn $" + returnSalary() + ".";
    }
    
>>>>>>> origin/master
    //add getters and setters
    //add space method: takes current space and adds space
    public String getAction()
    {
        return action;
    }
    public void setAction(String s)
    {
        action=s;
    }
}
