import java.util.ArrayList;
import java.util.Scanner;
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
        choosePath();
        turn(playList.get(0));
        turn(playList.get(1));
        
    }
    
    public void addPlayer(boolean male, String name)
    {
        //method to ask about players and genders
        //for now we will hardcode
        playList.add(new Player(male, name));
    }
    
    public void choosePath()
    {
        Scanner s = new Scanner(System.in);        
        for(int i=0;i<playList.size();i++)
        {
            System.out.println("Player " + (i+1) + ", college or career(0,1)");
            if(s.nextInt()==0)
            {
                playList.get(i).setCollege(true);
            } else 
            {
                playList.get(i).setCollege(false);
                b.chooseCareer(playList.get(i));
            }
        }
    }
    public void turn(Player p)
    {
        int spaceNum = w.spin();        

        spaceNum = b.checkForRed(spaceNum,p);
        int numberofGreens = b.checkForGreen(spaceNum, p);
        
        p.addSpace(spaceNum);
        b.actionFromSpace(p.getSpaceNum(), p);
        p.checkForAction();
        
    }
}
