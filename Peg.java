import java.awt.Color;
public class Peg
{
    boolean male;
    Color color;
    public Peg(boolean m)
    {
        male = m;
        if(male)
        {
            color = Color.cyan;
        } else color = Color.pink;
    }

}
