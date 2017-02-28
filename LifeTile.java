import java.util.Random;
import java.lang.Math;
public class LifeTile
{
    int amount;
    Random rand;
    public LifeTile()
    {
        rand = new Random();
        for(int i = 0; i<20; i++)
        {
            amount = setAmount();
            System.out.println(amount);
        }
    }

    
    private int setAmount()
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

}
