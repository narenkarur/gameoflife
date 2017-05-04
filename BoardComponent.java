import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.util.ArrayList;
import Spaces.Space;
public class BoardComponent extends JComponent implements ActionListener
{
    JLabel nameL;
    JPanel mainP,actionP,playerP,infoP,otherP,nameP;
    int fW;
    int fH;
    JLabel firstNameL,spinL,kidL,spouseL,houseL,jobL,balanceL,tileL,actionL;
    JFrame fr;
    public BoardComponent(JFrame fr)
    {
        this.fr=fr;
        fW = fr.getWidth();
        fH = fr.getHeight();
        
        mainP = new JPanel();
        mainP.setBorder(BorderFactory.createLineBorder(Color.blue));
        //mainP.setLayout(new BorderLayout());
        mainP.setPreferredSize(new Dimension(700, 700));  
        JLabel boardL = new JLabel();
        ImageIcon ic = new ImageIcon("Board.png");
        Image im = ic.getImage();

        BufferedImage bimage = new BufferedImage(im.getWidth(null), im.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(im, 0, 0, null);
        bGr.dispose();

        //BufferedImage image = (BufferedImage) im;
        ImageIcon icon = resize(bimage,700,650,true);
        boardL.setIcon(icon);
        mainP.add(boardL);

        JPanel actionP = new JPanel();
        actionP.setBorder(BorderFactory.createLineBorder(Color.red));
        actionP.setLayout(new BorderLayout());
        actionP.setPreferredSize(new Dimension(1100,150));

        JPanel infoActionP = new JPanel();
        infoActionP.setBorder(BorderFactory.createLineBorder(Color.cyan));
        infoActionP.setPreferredSize(new Dimension(950,150));
        infoActionP.setLayout(new BorderLayout());
        actionP.add(infoActionP,BorderLayout.WEST);
        actionL = new JLabel("WHERE YOU ARE");
        actionL.setPreferredSize(new Dimension(950,150));
        infoActionP.add(actionL,BorderLayout.CENTER);
        actionL.setFont(new Font("Serif", Font.PLAIN, 40));

        JPanel playerP = new JPanel();
        playerP.setBorder(BorderFactory.createLineBorder(Color.green));
        playerP.setLayout(new BorderLayout());
        playerP.setPreferredSize(new Dimension(400,700));
        //
        nameL = new JLabel("  PLAYER CARD");
        nameL.setPreferredSize(new Dimension(400, 80));        
        playerP.add(nameL,BorderLayout.NORTH);
        //nameL.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSizeToUse));
        nameL.setFont(new Font("Serif", Font.PLAIN, 50));
        //fitFont(nameL);
        //
        infoP=new JPanel();
        infoP.setBorder(BorderFactory.createLineBorder(Color.magenta));
        infoP.setPreferredSize(new Dimension(400,620));
        infoP.setLayout(new BorderLayout());

        nameP=new JPanel();
        nameP.setBorder(BorderFactory.createLineBorder(Color.cyan));
        nameP.setPreferredSize(new Dimension(400,70));
        infoP.add(nameP,BorderLayout.NORTH);

        firstNameL=new JLabel("NAME");
        firstNameL.setFont(new Font("Serif", Font.PLAIN, 50));
        nameP.add(firstNameL);

        otherP=new JPanel();
        otherP.setBorder(BorderFactory.createLineBorder(Color.orange));
        otherP.setPreferredSize(new Dimension(400,550));
        otherP.setLayout(new GridLayout(7,1));

        spinL=new JLabel("Spin Amt");
        spinL.setFont(new Font("Serif", Font.PLAIN, 30));
        otherP.add(spinL);        
        kidL=new JLabel("Amount of Kids");
        kidL.setFont(new Font("Serif", Font.PLAIN, 30));
        otherP.add(kidL);
        spouseL=new JLabel("Amount of Spouses");
        spouseL.setFont(new Font("Serif", Font.PLAIN, 20));
        otherP.add(spouseL);
        houseL=new JLabel("Type of House");
        houseL.setFont(new Font("Serif", Font.PLAIN, 20));
        otherP.add(houseL);
        jobL=new JLabel("Career Description");
        jobL.setFont(new Font("Serif", Font.PLAIN, 20));
        otherP.add(jobL);
        balanceL=new JLabel("YOUR BALANCE");
        balanceL.setFont(new Font("Serif", Font.PLAIN, 40));
        otherP.add(balanceL);
        tileL=new JLabel("Your Life Tile Amount");
        tileL.setFont(new Font("Serif", Font.PLAIN, 30));
        otherP.add(tileL);        

        infoP.add(otherP,BorderLayout.CENTER);
        playerP.add(infoP,BorderLayout.CENTER);
        //spun, kids, spouses, balance, life cards

        //mainP.setMaximumSize(mainP.getPreferredSize());
        //mainP.setMinimumSize(new Dimension(390, 190));

        fr.add(mainP,BorderLayout.WEST);
        fr.add(actionP,BorderLayout.SOUTH);
        fr.add(playerP,BorderLayout.EAST);
        //fr.getContentPane().setBackground(Color.BLACK);
        //fr.pack();
        fr.setPreferredSize(new Dimension(fW, fH));
        fr.setResizable(false);
        fr.pack();
        fr.setVisible(true);   
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        
    }

    public static ImageIcon resize(BufferedImage imageIcon, double width, double height, boolean straight)//resizes the image to fit a space
    {
        BufferedImage bi;
        if(straight)
        {
            bi = new BufferedImage((int) width, (int) height, BufferedImage.TRANSLUCENT);
        } else
        {
            bi = new BufferedImage((int) (width*1.03357), (int) (height*1.10479), BufferedImage.TRANSLUCENT);
        }
        //constructs new bufferedimage with specefied explicit parameters and assigns it to bi
        Graphics2D g2d = (Graphics2D) bi.createGraphics();//casts graphics of bi to graphics2D g2d
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY));
        //invokes the addrenderinghints method on g2d with specified explicit parameters
        if(straight)
        {
            g2d.drawImage((Image) imageIcon, 0, 0, (int) width, (int) height, null);
        } else
        {
            g2d.drawImage((Image) imageIcon, 0, 0, (int) (width*1.03357),  (int) (height*1.10479), null);
            //bi = new BufferedImage(,, BufferedImage.TRANSLUCENT);
        }
        //setting width/height in process
        g2d.dispose();//invokes dispose method on g2d
        Image icon = (Image) bi;//returns an imageIcon with bi
        return new ImageIcon(icon);
    }

    public void testLocation(ArrayList<Space> spaceList)
    {
        for(Space s : spaceList)
        {
            Peg p = new Peg(true,s.getXPos(),s.getYPos(),15);
            fr.add(p);
            fr.setVisible(true);
            fr.setComponentZOrder(p,0);
        }
    }

    public JLabel getNameL()
    {
        return nameL;
    }

    public JPanel getMainP()
    {
        return mainP;
    }

    public JPanel getActionP()
    {
        return actionP;
    }

    public JPanel getPlayerP()
    {
        return playerP;
    }

    public JPanel getInfoP()
    {
        return infoP;
    }

    public void actionPerformed(ActionEvent e)
    {

    }

    public void setText(Player p, int spinNumber)
    {
        firstNameL.setText(p.getName());
        if(p.getDone())
        {
            spinL.setText("YOU HAVE FINISHED!");
        } else spinL.setText("You spun: " + spinNumber);
        kidL.setText("You have " + p.getKids() + " kids.");
        spouseL.setText(p.getSpouseStatement());
        houseL.setText(p.getHouseStatement());
        jobL.setText(p.getJobStatement());
        balanceL.setText("BALANCE: $" + p.getMoney());
        tileL.setText("You have " + p.getLifeTileNumber() + " LIFE Tiles.");
        actionL.setText(p.getAction());
        fr.setVisible(true);
    }

    public void setEndText(String line1,String line2,String line3,ArrayList<String> putList)
    {
        infoP.removeAll();
        JPanel endP = new JPanel();
        endP.setLayout(new GridLayout(3+putList.size(),1));
        JLabel l1 = new JLabel(line1);
        endP.add(l1);
        JLabel l2 = new JLabel(line2);
        endP.add(l2);
        for(int i=0;i<putList.size();i++)
        {
            endP.add(new JLabel(putList.get(i)));
        }
        endP.add(new JLabel(line3));
        //jobL.setText("You are a " + p.getCareer() + " and earn $" + p.returnSalary() + ".");
        //balanceL.setText("BALANCE: $" + p.getMoney());
        //tileL.setText("You have " + p.getLifeTileNumber() + " LIFE Tiles.");
        repaint();
        fr.setVisible(true);
    }
}
