import java.util.ArrayList;
public class Car
{
    ArrayList<Peg> pegs;
    public Car()
    {
        pegs = new ArrayList<Peg>();
    }
    
    /*
     * Pegs go onto the car in the order that they are in the arraylist, because the first peg added
     * is the player (drivers seat), the second peg added is the spouse (passenger seat), and any
     * additional pegs are the kids.
     */
    public void addPeg(boolean male)
    {
        pegs.add(new Peg(male));
    }

}
