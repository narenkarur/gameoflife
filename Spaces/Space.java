package Spaces;

public class Space
{
    /*
     * 1: orange space
     * 2: life space
     * 3: green space
     * 4: red space
     * 5: blue space
     */
    int[] blah;
    String text;
    public Space()
    {
        
    }//construct
    
    public int[] returnSpaceMethod()//Player p)
    {
        return blah;
    }
    
    public String returnText()
    {
        return text;
    }
    public int getType()
    {
        return 0;
    }
}

//ALSO SHOULD HAVE CONSTRUCTORS FOR HARDCODING PURPOSES (MAYE JUST A STRING, INT, ETC);
//name
//method that tells us what we've used: we do this by returning the index value of the ArrayList of possibilities (a method)
//ADD GETTERS AND SETTERS