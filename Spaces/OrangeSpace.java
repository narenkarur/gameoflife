package Spaces;

//CREATE AN ARRAY OF ARRAYS FOR TEXT, AMOUNT, SPACES MOVED, CAREER CHANGES
//USE A RANDOM TO 




/*
 *  Most spaces are orange. Whenever you land on an orange space, you must follow the directions.
 */

public class OrangeSpace extends Space
{
    String[] stringValues = new String[15];
    int[][] masterArray = new int[15][3];
    //INITIALIZE EVERYTHING
    //MODIFY THE RETURNSPACEMETHOD CLASS TO CHOOSE A RANDOM MASTERARRAY ARRAY AND ITS CORRESPONDING STRINVALUE

    public OrangeSpace()
    {
        
    }
    public int[] returnSpaceMethod()
    {
        int[] returnArray = masterArray[0];
        return returnArray;
    }
    public String returnText()
    {
        return "HI";
    }    
}
