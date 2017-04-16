package Spaces;

/*
 * There are 3 of these spaces: JOB SEARCH, GET MARRIED and BUY A HOUSE. Whenever you reach a
 * red space, stop -- even if you have moves left. Follow the directions, then spin and move
 * again. Red spaces have special directions which are explained separately.
 */
public class RedSpace extends Space
{
    String[] stringValues = new String[15];
    int option;
    
    //RETURN EITHER A 1 (CAREER), 2 (CAR), 3(HOUSE CHANGE) IN RETURNSPACEMETHOD 
    
    
    public RedSpace()
    {
        
    }
    public int[] returnSpaceMethod()
    {
        int[] returnArray = {0};
        return returnArray;
    }

    public String returnText()
    {
        return "";
    }  
    
    public int getType()
    {
        return 4;
    }
}
