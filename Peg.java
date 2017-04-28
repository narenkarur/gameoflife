import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class Peg //extends JComponent
{
    boolean male;
    Color color;
    int x,y,w;

    public Peg(boolean m, int x, int y, int w)
    {
        male = m;
        if(male)
        {
            color = Color.cyan;
        } else color = Color.pink;
        this.x = x;
        this.y = y;
        this.w = w;
    }

    public void draw(Graphics2D g2)
    {
        g2.setColor(color);
        Ellipse2D.Double dot = new Ellipse2D.Double(x,y,w,w);
        g2.draw(dot);
        g2.fill(dot);
    }
    
    

}
