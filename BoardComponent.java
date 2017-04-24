import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;

public class BoardComponent extends JComponent implements ActionListener
{
    JLabel nameL;
    JPanel mainP,actionP,playerP,infoP;
    int fW;
    int fH;

    public BoardComponent(JFrame fr)
    {
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
        infoP.setLayout(new GridLayout(1,5));
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

}
