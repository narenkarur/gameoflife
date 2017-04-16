package Spaces;

/*
 * These spaces are Lawsuits
 */
public class BlueSpace extends Space
{
    int amount;
    String text;
    public BlueSpace(int which)
    {
        switch(which)
        {
            case 0:
            {
                amount = 100000;
                break;
            }
            case 1:
            {
                amount = 100000;
                break;
            }
            case 2:
            {
                amount = 100000;
                break;
            }
            case 3:
            {
                amount = 200000;
                break;
            }
            case 4:
            {
                amount = 100000;
                break;
            }
        }
    }
    public int[] returnSpaceMethod()
    {
        int[] returnArray = {amount};
        return returnArray;
    }

    public String returnText()
    {
        return "Lawsuit! Sue another player for $" + amount + ".";
    }  
    
    public int getType()
    {
        return 5;
    }    
}
