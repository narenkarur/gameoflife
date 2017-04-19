import java.util.ArrayList;
import javax.swing.JFrame;
import java.util.Scanner;
//import model.*;
import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class GameBrain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameBrain
{
    // instance variables - replace the example below with your own
    public int playerNum;
    public ArrayList<Player> playList = new ArrayList<Player>();
    Wheel w = new Wheel();
    //int spaceNum;
    Board b = new Board();
    JFrame fr;
    int fW;
    int fH;
    JLabel nameL;
    JPanel mainP,actionP,playerP,infoP;

    /**
     * Constructor for objects of class GameBrain
     */
    public GameBrain(int x, int y, ArrayList<Boolean> genderList, ArrayList<String> nameList)
    {
        fW=x;
        fH=y;
        fr=new JFrame("LIFE");
        fr.setSize(fW,fH);
        fr.getContentPane().setLayout(new BorderLayout());

        mainP = new JPanel();
        mainP.setBorder(BorderFactory.createLineBorder(Color.blue));
        mainP.setLayout(new BorderLayout());
        mainP.setPreferredSize(new Dimension(700, 700));    

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
<<<<<<< HEAD
        
        for(int i=0;i<genderList.size();i++)
        {
            addPlayer(genderList.get(i),nameList.get(i));
        }
        //addPlayer(true, "Ryan");
        //addPlayer(false, "Naren");
=======

        addPlayer(true, "Ryan");
        addPlayer(false, "Naren");
>>>>>>> origin/master
        choosePath();
        int endCount=0;
        boolean gameContinue=true;
        int roundCount=1;
        while(gameContinue)
        {
            System.out.println("TURN " + roundCount);            
            endCount=0;
            for(int i=0;i<playList.size();i++)
            {
                turn(playList.get(i));
                if(!playList.get(i).getDone()) System.out.println("On Tile " + playList.get(i).getSpaceNum() + ".");
                System.out.println();
                if(playList.get(i).getSpaceNum()>=62)
                {
                    endCount++;
                    playList.get(i).setDone();
                }
            }
            if(endCount==(playList.size()))
            {
                gameContinue=false;
            }
            roundCount++;
        }
        runEndSeq();
        /*System.out.println("TURN 1");
        turn(playList.get(0));
        turn(playList.get(1));
        System.out.println("TURN 2");
        turn(playList.get(0));
        turn(playList.get(1));
        System.out.println("TURN 3");
        turn(playList.get(0));
        turn(playList.get(1)); 
        System.out.println("TURN 4");
        turn(playList.get(0));
        turn(playList.get(1)); 
        
        System.out.println(b.getSpaceList().size());*/
    }
    public void runEndSeq()
    {
        System.out.println("GAME IS OVER.");
        for(int i=0;i<playList.size();i++)
        {
            System.out.println(playList.get(i).getName() + " has $" + playList.get(i).getMoney() + " + $" + playList.get(i).getSecret() + " from LIFE Tiles = $" + playList.get(i).getTotalMoney());
        }
        System.out.println("Thus, the winner is " + whoWon() + "!");
        System.out.println("Congrats and thanks for playing!");
    }
    public String whoWon()
    {
        String returnWon=playList.get(0).getName();
        int currentAmt=playList.get(0).getTotalMoney();
        for(int i=1;i<playList.size();i++)
        {
            if(playList.get(i).getTotalMoney()>currentAmt)
            {
                returnWon=playList.get(i).getName();
                currentAmt=playList.get(i).getTotalMoney();
            }
        }
        return returnWon;
    }

    public void fitFont(JLabel label)
    {
        Font labelFont = label.getFont();
        String labelText = label.getText();

        int stringWidth = label.getFontMetrics(labelFont).stringWidth(labelText);
        int componentWidth = label.getWidth();

        // Find out how much the font can grow in width.
        double widthRatio = (double)componentWidth / (double)stringWidth;

        int newFontSize = (int)(labelFont.getSize() * widthRatio);
        int componentHeight = label.getHeight();

        // Pick a new font size so it will not be larger than the height of label.
        int fontSizeToUse = Math.min(newFontSize, componentHeight);

        // Set the label's font size to the newly determined size.
        label.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSizeToUse));
    }

    public void buildUI()
    {

    }    

    public void addPlayer(boolean male, String name)
    {
        playList.add(new Player(male, name));

    }

    public void choosePath()
    {
        Scanner s = new Scanner(System.in);        
        for(int i=0;i<playList.size();i++)
        {
            System.out.println();
            System.out.println("Player " + playList.get(i).getName() + ", college or career(0,1)");
            if(s.nextInt()==0)
            {
                playList.get(i).setCollege(true);
            } else 
            {
                playList.get(i).setCollege(false);
                b.chooseCareer(playList.get(i));
            }
        }
    }

    public void turn(Player p)
    {
<<<<<<< HEAD
        if(!p.getDone())
        {
            System.out.println(); 
            nameL.setText(p.getName());
            System.out.println("Player " + p.getName() + ":");
            int spaceNum = w.spin(); 
            System.out.println("You spun " + spaceNum);
    
            spaceNum = b.checkForRed(spaceNum,p);
            b.checkForGreen(spaceNum, p);
            
            p.addSpace(spaceNum);
            b.actionFromSpace(p.getSpaceNum(), p);
            //p.checkForAction();
            System.out.println("Player " +p.getName() + " balance = $" + p.getMoney());
            System.out.println("Player " +p.getName() + " has " + p.getLifeTileNumber() + " LIFE tiles.");
            //System.out.println();
        } else System.out.println("Player " + p.getName() + " is done.");
=======
        System.out.println(); 
        nameL.setText(p.getName());
        System.out.println("Player " + p.getName() + ":");
        int spaceNum = w.spin(); 
        System.out.println("You spun " + spaceNum);

        spaceNum = b.checkForRed(spaceNum,p);
        b.checkForGreen(spaceNum, p);

        p.addSpace(spaceNum);
        b.actionFromSpace(p.getSpaceNum(), p);
        //p.checkForAction();
        System.out.println("Player " +p.getName() + " balance = $" + p.getMoney());
        System.out.println("Player " +p.getName() + " has " + p.getLifeTileNumber() + " LIFE tiles.");
        System.out.println();

>>>>>>> origin/master
    }
}
