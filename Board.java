import java.util.ArrayList;
import Spaces.Space;
/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board
{
    ArrayList<Space> spaceList = new ArrayList<Space>();

    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        
    }

    public void initializeSpaces()
    {
        //HARD CODE BOARD
        //spaceList.add(new GreenSpace(constructor stuff));
    }

    public void actionFromSpace(int spaceNum, Player p)
    {
        spaceList.get(spaceNum-1).runSpaceMethod();
        //return stuff
        //we are commenting this shit so that we can use if statements to do return values and then use them to change the variables of the player. so do that
        //lifespace: text, array[amount to be added to player's money, move space, career change] 
        //redspace: text, career change, car change(married), house change 
        //

        //do stuff to p
    }

    public int checkForRed(int spaceNum, Player p)
    {
        //if there is not a red(check between p.currentspace and p.currentspace+spaceNum), return spaceNum,
        //if there is a red, return the distance from currentspace to redspace
        return 1;
    }

    public int checkForGreen(int spaceNum, Player p)
    {
        //DON'T MODIFY SPACENUM
        //check how many greens between p.currentspace and p.currentspace+spacenum
        //use p.payday however many times ^^^^
        return 1;
    }    
}
