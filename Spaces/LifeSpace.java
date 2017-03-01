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
    Random rand;
    ArrayList<String> messages;
    public LifeSpace()
    {
        rand = new Random();
        messages = new ArrayList<String>();
        messages.add("Make your first kale smoothie!");
        messages.add("Go to bed without crying yourself to sleep!");
        messages.add("Start doing yoga!");
        messages.add("Teach yourself how to tap dance!");
        messages.add("");
        messages.add("");
        messages.add("");
        messages.add("");
        messages.add("");
        messages.add("");
        messages.add("");
        messages.add("");
        messages.add("");
        messages.add("");
        messages.add("");
        messages.add("");
        messages.add("");
    }

}
