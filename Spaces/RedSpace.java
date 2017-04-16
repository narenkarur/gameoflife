package Spaces;

/*
 * There are 3 of these spaces: JOB SEARCH, GET MARRIED and BUY A HOUSE. Whenever you reach a
 * red space, stop -- even if you have moves left. Follow the directions, then spin and move
 * again. Red spaces have special directions which are explained separately.
 */
public class RedSpace extends Space
{
    String text;
    int raise;
    int amt;
    int houseBinary;
    int careerBinary;
    //RETURN EITHER A 1 (CAREER), 2 (CAR), 3(HOUSE CHANGE) IN RETURNSPACEMETHOD 
    
    
    public RedSpace(int which)
    {
        switch(which)
        {
            case 0:
            {
                text = "Stop. Get Married. Also, get a $10,000 Pay Raise.";
                raise=10000;
                amt = 0;
                houseBinary = 0;
                careerBinary=0;
                break;
            }
            case 1:
            {
                text = "Stop. Buy a Starter Home.";
                raise=0;
                amt = 0;
                houseBinary = 1;
                careerBinary=0;
                break;
            }
            case 2:
            {
                text = "Stop. Drop $20 on Street. Also, $10,000 Pay Raise.";
                raise=10000;
                amt = -20;
                houseBinary = 0;
                careerBinary=0;
                break;
            }
            case 3:
            {
                text = "Stop. $10,000 Pay Raise.";
                raise=10000;
                amt = 0;
                houseBinary = 0;
                careerBinary=0;
                break;
            }
            case 4:
            {
                text = "Stop. $10,000 Pay Raise and Buy Better Home.";
                raise=10000;
                amt = 0;
                houseBinary = 1;
                careerBinary=0;                
                break;
            }        
            case 100:
            {
                text = "Choose a College Career.";
                raise=0;
                amt = 0;
                houseBinary = 0;
                careerBinary=1;
                break;
            }              
        }
    }
    public int[] returnSpaceMethod()
    {
        //pay raise, added balance, housebinary, careerbinary
        int[] returnArray = {raise, amt, houseBinary,careerBinary};
        return returnArray;
    }

    public String returnText()
    {
        return text;
    }  
    
    public int getType()
    {
        return 4;
    }
}
