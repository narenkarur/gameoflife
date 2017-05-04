 package Spaces;

/*
 * These are PAY DAY spaces. Whenever you land on or pass a PAY DAY space, collect your salary
 * from the bank.
 */
public class GreenSpace extends Space
{
    //create an array of salary values
    //modify the 
    int startX = 30;
    public GreenSpace(int x)
    {
        switch(x)
        {
            case 0:
            {
                xPos = startX+1*(700/14);
                yPos = 15;//copy and pase for rest, change y;
                break;
            }
            case 1:
            {
                xPos = startX+5*(700/14);
                yPos = 15;//copy and pase for rest, change y;
                break;
            }
            case 2:
            {
                xPos = startX+9*(700/14);
                yPos = 15;//copy and pase for rest, change y;
                break;
            }
            case 3:
            {
                xPos = startX+12*(700/14)+30;
                yPos = 90;//copy and pase for rest, change y;
                break;
            }
            case 4:
            {
                xPos = startX+8*(700/14);
                yPos = 160;//copy and pase for rest, change y;
                break;
            }
            case 5:
            {
                xPos = startX+3*(700/14);
                yPos = 160;//copy and pase for rest, change y;
                break;
            }
            case 6:
            {
                xPos = startX+0*(700/14)-15;
                yPos = 230;//copy and pase for rest, change y;
                break;
            }
            case 7:
            {
                xPos = startX+3*(700/14);
                yPos = 310;//copy and pase for rest, change y;
                break;
            }
            case 8:
            {
                xPos = startX+7*(700/14);
                yPos = 310;//copy and pase for rest, change y;
                break;
            }
            case 9:
            {
                xPos = startX+10*(700/14);
                yPos = 310;//copy and pase for rest, change y;
                break;
            }
            case 10:
            {
                xPos = startX+12*(700/14)+25;
                yPos = 390;//copy and pase for rest, change y;
                break;
            }
            case 11:
            {
                xPos = startX+9*(700/14);
                yPos = 460;//copy and pase for rest, change y;
                break;
            }
            case 12:
            {
                xPos = startX+6*(700/14);
                yPos = 460;//copy and pase for rest, change y;
                break;
            }
            case 13:
            {
                xPos = startX+2*(700/14);
                yPos = 460;//copy and pase for rest, change y;
                break;
            }
            case 14:
            {
                xPos = startX+0*(700/14);
                yPos = 560;//copy and pase for rest, change y;
                break;
            }
            case 15:
            {
                xPos = startX+3*(700/14);
                yPos = 610;//copy and pase for rest, change y;
                break;
            }
        }
    }
    
    public int[] returnSpaceMethod()
    {
        int[] returnArray = {0};
        return returnArray;
    }

    public String returnText()
    {
        return "Pay Day";
    }  
    
    public int getType()
    {
        return 3;
    }
}
