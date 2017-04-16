import java.util.ArrayList;
import Spaces.Space;
import Spaces.OrangeSpace;
import Spaces.LifeSpace;
import Spaces.RedSpace;
import Spaces.BlueSpace;
import Spaces.GreenSpace;
import java.util.Scanner;
/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board
{
    ArrayList<Space> collegeList = new ArrayList<Space>();
    ArrayList<Space> spaceList = new ArrayList<Space>();

    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        initializeFirstSpaces();
        initializeSpaces();
    }
    public void initializeFirstSpaces()
    {
        //HARD CODE BOARD
        collegeList.add(new OrangeSpace(100));
        collegeList.add(new OrangeSpace(101));
        collegeList.add(new LifeSpace(100));
        collegeList.add(new OrangeSpace(102));        
        collegeList.add(new RedSpace(100));    
        //spaceList.add(new GreenSpace(constructor stuff));
    }    
        
    public void chooseCareer(Player p)
    {
        //hardcode careers
    }

    public void initializeSpaces()
    {
        //HARD CODE BOARD
        spaceList.add(new OrangeSpace(0));
        spaceList.add(new GreenSpace(0));
        spaceList.add(new OrangeSpace(1));
        spaceList.add(new OrangeSpace(2));
        spaceList.add(new LifeSpace(0));
        spaceList.add(new GreenSpace(1));
        spaceList.add(new RedSpace(0));
        spaceList.add(new LifeSpace(1));
        spaceList.add(new OrangeSpace(3));
        spaceList.add(new GreenSpace(1));
        spaceList.add(new RedSpace(1));
        spaceList.add(new OrangeSpace(4));
        spaceList.add(new LifeSpace(2));
        spaceList.add(new GreenSpace(2));
        spaceList.add(new LifeSpace(3));
        spaceList.add(new OrangeSpace(5));
        spaceList.add(new OrangeSpace(6));
        spaceList.add(new LifeSpace(4));
        spaceList.add(new GreenSpace(3));
        spaceList.add(new BlueSpace(0));
        spaceList.add(new OrangeSpace(7));
        spaceList.add(new RedSpace(2));
        spaceList.add(new OrangeSpace(8));
        spaceList.add(new GreenSpace(4));
        spaceList.add(new LifeSpace(5));
        spaceList.add(new OrangeSpace(9));
        spaceList.add(new LifeSpace(6));
        spaceList.add(new GreenSpace(5));
        spaceList.add(new OrangeSpace(10));
        spaceList.add(new OrangeSpace(11));
        spaceList.add(new OrangeSpace(12));
        spaceList.add(new GreenSpace(6));
        spaceList.add(new OrangeSpace(13));
        spaceList.add(new LifeSpace(6));
        spaceList.add(new OrangeSpace(14));
        spaceList.add(new GreenSpace(7));
        spaceList.add(new BlueSpace(1));      
        spaceList.add(new RedSpace(3));
        spaceList.add(new GreenSpace(8));
        spaceList.add(new OrangeSpace(15));
        spaceList.add(new OrangeSpace(16));
        spaceList.add(new GreenSpace(9));
        spaceList.add(new BlueSpace(2));
        spaceList.add(new OrangeSpace(17));
        spaceList.add(new RedSpace(4));
        spaceList.add(new GreenSpace(10));
        spaceList.add(new OrangeSpace(18));   
        spaceList.add(new BlueSpace(3));
        spaceList.add(new GreenSpace(11));
        spaceList.add(new OrangeSpace(19));
        spaceList.add(new LifeSpace(7));
        spaceList.add(new LifeSpace(8));
        spaceList.add(new GreenSpace(12));
        spaceList.add(new OrangeSpace(20));
        spaceList.add(new LifeSpace(9));
        spaceList.add(new GreenSpace(12));
        spaceList.add(new LifeSpace(10));   
        spaceList.add(new BlueSpace(4));
        spaceList.add(new LifeSpace(11));
        spaceList.add(new GreenSpace(13));
        spaceList.add(new OrangeSpace(21));
        spaceList.add(new OrangeSpace(22));      
        //spaceList.add(new GreenSpace(constructor stuff));
    }
    public void runSpaceMethod(int type, int[] values, String text)    
    {
        //change player stuff here
        if(type==1)
        {
            
        } else if(type==2)
        {
            
        } else if(type==3)
        {
            
        } else if(type==4)
        {
            
        } else if(type==5)
        {
            
        }        
        //for red, remember that the first amount is a pay raise and second is added to balance
    }
    public void actionFromSpace(int spaceNum, Player p)
    {
        if(spaceNum<5)
        {
            if(p.getCollege())
            {
                runSpaceMethod(collegeList.get(spaceNum-1).getType(),collegeList.get(spaceNum-1).returnSpaceMethod(),collegeList.get(spaceNum-1).returnText());
            } else
            {
                runSpaceMethod(spaceList.get(spaceNum-1).getType(),spaceList.get(spaceNum-1).returnSpaceMethod(),spaceList.get(spaceNum-1).returnText());
            }
        } else
        {
            runSpaceMethod(spaceList.get(spaceNum-1).getType(),spaceList.get(spaceNum-1).returnSpaceMethod(),spaceList.get(spaceNum-1).returnText());
        }
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
