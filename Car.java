import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class Car extends JComponent
{
    ArrayList<Peg> pegs;
    int x,y,w,wRat;
    JFrame frame;
    public Car(JFrame frame)
    {
        pegs = new ArrayList<Peg>();
        wRat = 2;
        x = 10;
        y = 40;
        w = 70;
        this.frame = frame;
    }

    /*
     * Pegs go onto the car in the order that they are in the arraylist, because the first peg added
     * is the player (drivers seat), the second peg added is the spouse (passenger seat), and any
     * additional pegs are the kids.
     */
    public void addPeg(boolean male)
    {
        int thisX;
        int thisY;
        int thisW = w/7;
        if(pegs.size()%2==1)
        {
            thisX = x+thisW;
        } else thisX = x+4*thisW;
        if(pegs.size()<=2)
        {
            thisY = y+w*wRat-3*thisW;
        } else if(pegs.size()<=4)
        {
            thisY = y+w*wRat-6*thisW;
        } else thisY = y+w*wRat-7*thisW;
        pegs.add(new Peg(male,thisX,thisY, 2*thisW,frame));
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
        g2.setColor(Color.black);
        g2.draw(rect);
        g2.setColor(Color.black);
        g2.fill(rect);
        
        for(Peg p : pegs)
        {
            p.draw(g2);
            frame.setVisible(true);
        }
        
    }

}
