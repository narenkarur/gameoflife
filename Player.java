
public class Player
{
    boolean male;
    Car car;
    int money;
    int debt;
    String name;
    int spaceNum;
    public Player(boolean m, String n)
    {
        car = new Car();
        male=m;
        car.addPeg(male);
        name=n;
    }
    //add getters and setters
    //add space method: takes current space and adds space
    
}
