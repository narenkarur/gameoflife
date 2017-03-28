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
        //spaceList.add(new GreenSpace());
    }
    public void actionFromSpace(int spaceNum, Player p)
    {
        spaceList.get(spaceNum-1).runSpaceMethod();
    }
}
