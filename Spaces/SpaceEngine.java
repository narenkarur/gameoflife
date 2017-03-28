package Spaces;
import java.util.ArrayList;

/**
 * Write a description of class SpaceEngine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceEngine
{
    // instance variables - replace the example below with your own
    ArrayList<Space> s = new ArrayList<Space>();
    ArrayList<String> strList = new ArrayList<String>();

    /**
     * Constructor for objects of class SpaceEngine
     */
    public SpaceEngine()
    {

    }
    public void randomAdd()
    {
        //randomly add a red,blue, etc. space
        //add to an arraylist of Strings with unique strings(for each space) //THAT MEANS THAT EACH OF THE SPACE CLASSES MUST RETURN A UNIQUE ATTRIBUTE (string) FOR EACH TYPE OF SPACE
        //it should be a loop
        //every time you add a space, check to see if its unique attribute is already in the arrayList defined in line 2 of this method
        //then either add or don't add
    }
    public void checkForUse(String str)
    {
    }
}
