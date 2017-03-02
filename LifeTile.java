import java.util.Random;
import java.lang.Math;
public class LifeTile
{
    int amount;
    Random rand;
    public LifeTile()
    {
        rand = new Random();
        amount = setAmount();
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
