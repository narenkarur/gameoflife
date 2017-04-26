import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class Peg extends JComponent
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

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(color);
        Ellipse2D.Double dot = new Ellipse2D.Double
    }

}
