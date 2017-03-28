import java.util.Random;
public class Wheel
{
    Random rand;
    public Wheel()
    {
        rand = new Random();
    }
    
    public int spin()
    {
        int num = rand.nextInt(10)+1;
        //if(num==10)
        return num;
    }
    //if spins to 10, pay police 5000
}
