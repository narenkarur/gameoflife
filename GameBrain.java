import java.util.ArrayList;
/**
 * Write a description of class GameBrain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameBrain
{
    // instance variables - replace the example below with your own
    public int playerNum;
    public ArrayList<Player> playList = new ArrayList<Player>();
    Wheel w = new Wheel();
    //int spaceNum;
    Board b = new Board();
    
    /**
     * Constructor for objects of class GameBrain
     */
    public GameBrain()
    {
        turn(playList.get(0));
        turn(playList.get(1));
        
    }
    public void addPlayer(boolean male, String name)
    {
        //method to ask about players and genders
        //for now we will hardcode
        playList.add(new Player(male, name));
    }
    public void turn(Player p)
    {
        int spaceNum = w.spin();
        p.addSpace(spaceNum);
        b.actionFromSpace(p.getSpaceNum, p);
    }
}
