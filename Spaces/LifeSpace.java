package Spaces;

import java.util.Random;
import java.util.ArrayList;
/*
 * These spaces show pictures of LIFE Tiles, and are all about family activities, community service
 * and good deeds!

 * Whenever you land on a LIFE space, take 1 LIFE Tile from the draw pile. If the draw pile has run
 * out, take 1 LIFE Tile from any opponent (Moot, as our draw pile won't run out).

 * Do not look at the back of the LIFE Tile. Place it LIFE-side-up in front of you.
 */
public class LifeSpace extends Space
{
    String text;
    int amount;
    public LifeSpace(int which)
    {
        //amount random gen
        switch(which)
        {
            case 0:
            {
                text= "";
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
        return text;
    }  
    
    public int getType()
    {
        return 2;
    }

}
