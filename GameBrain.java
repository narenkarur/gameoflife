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
    BoardComponent boardUI;
    Scanner read = new Scanner(System.in);
    String spinwhatever;
    String go="";
    /**
     * Constructor for objects of class GameBrain
     */
    public GameBrain(int x, int y, ArrayList<Boolean> genderList, ArrayList<String> nameList)
    {

        /*
         * I'm moving the UI panel stuff to boardcomponent class which extends jcomponent and 
         * implements actionlistener so that the stuff can be refreshed and can move
         */

        fW=x;
        fH=y;
        fr=new JFrame("LIFE");
        fr.setSize(fW,fH);
        fr.getContentPane().setLayout(new BorderLayout());

        for(int i=0;i<genderList.size();i++)
        {
            addPlayer(genderList.get(i),nameList.get(i));
        }
        boardUI = new BoardComponent(fr, playList);
        
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
                boardUI.setText(playList.get(i),0,1);
                System.out.println(playList.get(i).getName() + ", press 'enter' to spin.");
                spinwhatever=read.nextLine();
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
        String line1="GAME IS OVER.";
        ArrayList<String> putList = new ArrayList<String>();
        String putStuff="";
        for(int i=0;i<playList.size();i++)
        {
            System.out.println(playList.get(i).getName() + " has $" + playList.get(i).getMoney() + " + $" + playList.get(i).getSecret() + " from LIFE Tiles = $" + playList.get(i).getTotalMoney());
            putStuff=(playList.get(i).getName() + " has $" + playList.get(i).getMoney() + " + $" + playList.get(i).getSecret() + " from LIFE Tiles = $" + playList.get(i).getTotalMoney());
            putList.add(putStuff);
        }
        String line2=("Thus, the winner is " + whoWon() + "!");
        String line3=("Congrats and thanks for playing!");
        boardUI.setEndText(line1,line2,line3,putList);
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
        playList.add(new Player(male, name, fr));

    }

    public void choosePath()
    {
        Scanner s = new Scanner(System.in);        
        for(int i=0;i<playList.size();i++)
        {
            System.out.println();
            System.out.println("Player " + playList.get(i).getName() + ", college or career(0,1)");
            if(s.nextLine().equals("0"))
            {
                playList.get(i).setCollege(true);
            } else 
            {
                playList.get(i).setCollege(false);
                b.chooseCareer(playList.get(i));
                System.out.println();
            }
        }
    }

    public void turn(Player p)
    {
        if(!p.getDone())
        {
            System.out.println(); 
            //boardUI.getNameL().setText(p.getName());
            System.out.println("Player " + p.getName() + ":");
            int spaceNum = w.spin();
            boardUI.setSpinSequence(spaceNum); //SET THE SPINNER THING ON THE TERMINAL WINDOW
            //p.setAction(b.getTheAction(p));
            int firstSpaceNum=spaceNum;
            //boardUI.setText(b.getp,firstSpaceNum);            
            System.out.println("You spun " + spaceNum);

            spaceNum = b.checkForRed(spaceNum,p);
            boardUI.setGreen(b.checkForGreen(spaceNum, p),p);
            

            b.checkForGreen(spaceNum, p);
            p.addSpace(spaceNum);
            go=read.nextLine();
            boardUI.setTextSequence(b.getTextFromSpace(p.getSpaceNum(),p),p);
            b.actionFromSpace(p.getSpaceNum(), p);
            //p.checkForAction();
            System.out.println("Player " +p.getName() + " balance = $" + p.getMoney());
            System.out.println("Player " +p.getName() + " has " + p.getLifeTileNumber() + " LIFE tiles.");
            //System.out.println();
            go=read.nextLine(); //prompt go
            boardUI.setText(p,firstSpaceNum,0);
            go=read.nextLine();
        } else 
        {
            boardUI.setText(p,p.getSpaceNum(),2);
            System.out.println("Player " + p.getName() + " is done.");
        }
    }
}
