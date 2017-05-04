package Spaces;

/*
 * These spaces are Lawsuits
 */
public class BlueSpace extends Space
{
    int amount;
    String text;
    int startX = 30;
    public BlueSpace(int which)
    {
        switch(which)
        {
            case 0:
            {
                amount = 100000;
                xPos = startX+7*(700/14);
                yPos = 160;
                break;
            }
            case 1:
            {
                amount = 100000;
                xPos = startX+8*(700/14);
                yPos = 310;
                break;
            }
            case 2:
            {
                amount = 100000;
                xPos = startX+12*(700/14);
                yPos = 450;
                break;
            }
            case 3:
            {
                amount = 200000;
                xPos = startX+7*(700/14);
                yPos = 460;
                break;
            }
            case 4:
            {
                amount = 100000;
                xPos = startX+1*(700/14);
                yPos = 610;
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
        return "Lawsuit! You are sued for $" + amount + ".";
    }  
    
    public int getType()
    {
        return 5;
    }    
}
