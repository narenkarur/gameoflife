import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

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
        boardL.setIcon(new ImageIcon("Board.png"));
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
