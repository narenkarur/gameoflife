
/**
 * Write a description of class Egine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Engine
{
    // instance variables - replace the example below with your own
    private int playerNum;

    /**
     * Constructor for objects of class Egine
     */
    public Engine()
    {
        GameBrain gB = new GameBrain();
        gB.addPlayer(true, "Ryan");
        gB.addPlayer(false, "Naren");
       
    }
    public void start()
    {
        
    }
}
