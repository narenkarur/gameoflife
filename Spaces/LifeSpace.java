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
    Random rand;
    int kidsBinary;
    public LifeSpace(int which)
    {
        //amount random gen
        rand = new Random();
        switch(which)
        {
            case 0:
            {
                text= "Volunteer at soup kitchen.";
                amount = setAmount();
                kidsBinary = 0;
                break;
            }
            case 1:
            {
                text= "Happy Honeymoon!";
                amount = setAmount();
                kidsBinary = 0;
                break;
            }
            case 2:
            {
                text= "Baby Boy!";
                amount = setAmount();
                kidsBinary = 1;
                break;
            }
            case 3:
            {
                text= "Vote!!!";
                amount = setAmount();
                kidsBinary = 0;
                break;
            }
            case 4:
            {
                text= "Baby Girl!";
                amount = setAmount();
                kidsBinary = 1;
                break;
            }
            case 5:
            {
                text= "Adopt twins!!";
                amount = setAmount();
                kidsBinary = 2;
                break;
            }
            case 6:
            {
                text= "Run for Congress.";
                amount = setAmount();
                kidsBinary = 0;
                break;
            }
            case 7:
            {
                text= "Donate to African Orphans.";
                amount = setAmount();
                kidsBinary = 0;
                break;
            }
            case 8:
            {
                text= "Visit Pyramids in Egypt.";
                amount = setAmount();
                kidsBinary = 0;
                break;
            }
            case 9:
            {
                text= "You're a grandparent!";
                amount = setAmount();
                kidsBinary = 0;
                break;
            }
            case 10:
            {
                text= "Go hiking in the Australian Alps.";
                amount = setAmount();
                kidsBinary = 0;
                break;
            }
            case 11:
            {
                text= "Visit Great Wall of China.";
                amount = setAmount();
                kidsBinary = 0;
                break;
            }
            case 12:
            {
                text= "You're a grandparent!";
                amount = setAmount();
                kidsBinary = 0;
                break;
            }
            case 100:
            {
                text= "Make new friends for life.";
                amount = setAmount();
                kidsBinary = 0;
                break;
            }            
        }
    }
    
    public int setAmount()
    {
        double a = Math.pow((rand.nextDouble()*10),2);
        int b;
        if(a<1)
        {
            a = a*10;
            b = (int) a*500;
        } else b = (int) a*5000;
        return b;
    }
    
    public int[] returnSpaceMethod()
    {
        //amount, kidsbinary
        int[] returnArray = {amount, kidsBinary};
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
