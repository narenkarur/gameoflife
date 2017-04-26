import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class Car extends JComponent
{
    ArrayList<Peg> pegs;
    int x,y,w,wRat;
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
    
    public void move(int x, int y)
    {
        this.x = x;
        this.y = y;
        repaint();
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D.Double rect = new Rectangle2D.Double(x,y,w,w*wRat);
        g2.draw(rect);
        g2.setColor(Color.white);
        g2.fill(rect);
    }
    
}
