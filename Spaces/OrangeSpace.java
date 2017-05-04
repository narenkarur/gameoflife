package Spaces;

//CREATE AN ARRAY OF ARRAYS FOR TEXT, AMOUNT, SPACES MOVED, CAREER CHANGES
//USE A RANDOM TO 


/*
 *  Most spaces are orange. Whenever you land on an orange space, you must follow the directions.
 */

public class OrangeSpace extends Space
{
    //String[] stringValues = new String[15];
    //int[][] masterArray = new int[15][3];
    String text;
    int amount;
    int houseBinary;
    int careerBinary;
    //INITIALIZE EVERYTHING
    //MODIFY THE RETURNSPACEMETHOD CLASS TO CHOOSE A RANDOM MASTERARRAY ARRAY AND ITS CORRESPONDING STRINVALUE

    public OrangeSpace(int which)
    {
        switch(which)
        {
            case 0:
            {
                text = "Rent apartment. Pay $5,000.";
                amount = -5000;
                houseBinary = 1;
                careerBinary = 0;
                xPos = 10+0*(700/14);
                yPos = 40;
                break;
            }
            case 1:
            {
                text = "Inheritance. Collect $20,000";
                amount = 20000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+2*(700/14);
                
                break;
            }
            case 2:
            {
                text = "Snowboarding Accident. Pay $5,000";
                amount = -5000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+3*(700/14);
                
                break;
            }
            case 3:
            {
                text = "Car Accident. Pay $10,000";
                amount = -10000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+8*(700/14);
                
                break;
            }
            case 4:
            {
                text = "Lose job. Take a new career card.";
                amount = 0;
                houseBinary = 0;
                careerBinary = 1;
                 xPos = 10+11*(700/14);
                
                break;
            }
            case 5:
            {
                text = "Win Ultimate Idol TV Show. Collect $100,000";
                amount = 100000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+11*(700/14);
                
                break;
            }
            case 6:
            {
                text = "Get the Best Seats at the Big Game. Pay $20,000";
                amount = -20000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+10*(700/14);
                
                break;
            }
            case 7:
            {
                text = "Lose Job. Take New Career Card.";
                amount = 0;
                houseBinary = 0;
                careerBinary = 1;
                 xPos = 10+6*(700/14);
                
                break;
            }
            case 8:
            {
                text = "House Floods. Pay $40,000.";
                amount = -40000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+4*(700/14);
                
                break;
            }
            case 9:
            {
                text = "Taxes Due.";
                amount = 69;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+1*(700/14);
                
                break;
            }
            case 10:
            {
                text = "Family Cruise. Pay $25,000 + $5,000 Per Child.";
                amount = -69;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+0*(700/14);
                
                break;
            }
            case 11:
            {
                text = "Win TV Game Show. Collect $100,000";
                amount = 100000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+1*(700/14);
                
                break;
            }
            case 12:
            {
                text = "Art Auction. Pay $20,000";
                amount = -20000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+2*(700/14);
                
                break;
            }
            case 13:
            {
                text = "Taxes Due.";
                amount = 69;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+4*(700/14);
                
                break;
            }
            case 14:
            {
                text = "Buy SUV. Pay $40,000";
                amount = -40000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+6*(700/14);
                
                break;
            }
            case 15:
            {
                text = "Buy Foreign Sports Car. Pay $50,000";
                amount = -50000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+11*(700/14);
                
                break;
            }
            case 16:
            {
                text = "Murder someone. Pay $100,000 to cover up.";
                amount = -100000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+12*(700/14);
                
                break;
            }
            case 17:
            {
                text = "Win Nobel Prize. Get $100,000.";
                amount = 100000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+11*(700/14);
                
                break;
            }
            case 18:
            {
                text = "Write Best-Selling Book. Earn $200,000";
                amount = 200000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+8*(700/14);
                
                break;
            }
            case 19:
            {
                text = "Go to Theme Park with Family. Pay $25,000 + $5,000 per kid.";
                amount = -69;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+5*(700/14);
                
                break;
            }
            case 20:
            {
                text = "Buy 100 Kilos of Crack Cocaine. Pay $100,000";
                amount = -100000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+1*(700/14);
                
                break;
            }
            case 21:
            {
                text = "Pension. Collect $100,000";
                amount = 100000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 10+4*(700/14);
                
                break;
            }
            case 100:
            {
                text = "Start College. Borrow $100,000.";
                amount = -100000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 1*(700/14);
                
                break;
            }
            case 101:
            {
                text = "Part-time job. Collect $10,000.";
                amount = 10000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 2*(700/14);
                
                break;
            }
            case 102:
            {
                text = "Spring Break in Florida. Pay $5,000.";
                amount = -5000;
                houseBinary = 0;
                careerBinary = 0;
                 xPos = 4*(700/14);
                
                break;
            }           
        }
    }

    public int[] returnSpaceMethod()
    {
        int[] returnArray = {amount, houseBinary, careerBinary};
        return returnArray;
    }

    public String returnText()
    {
        return text;
    }  
    
    public int getType()
    {
        return 1;
    }
    
    public int getXPos()
    {
        return xPos;
    }
    
    public int getYPos()
    {
        return yPos;
    }
    
    
}
