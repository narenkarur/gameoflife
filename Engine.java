import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;
import java.awt.Color;
/**
 * Write a description of class Egine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Engine
{
    // instance variables - replace the example below with your own
    //private int playerNum;
    public static void main(String[] args)
    {
        //CHANGE THE FOLLOWING TO ADD/REMOVE PLAYERS
        System.out.println("Welcome to the Game of Life!");
        ArrayList<Boolean> gList = new ArrayList<Boolean>();//TRUE MEANS MALE, FALSE=FEMALE
        ArrayList<String> sList= new ArrayList<String>(); //NAME CORRESPONDING TO INDEX OF GLIST
        Scanner read = new Scanner(System.in);
        Boolean continueStart=true;
        String addP="";
        String nameP="";
        String genderS="";
        while(continueStart)
        {
            System.out.println("Would you like to add a player? Y/N");
            addP=read.nextLine();
            if(addP.equals("Y")||addP.equals("y"))
            {
                System.out.println("Enter name of player.");
                nameP=read.nextLine();
                sList.add(nameP);
                System.out.println("Now enter gender. M/F");
                genderS=read.nextLine();
                if(genderS.equals("M")||genderS.equals("m")) gList.add(true);
                else gList.add(false);
                System.out.println();
            } else 
            {
                System.out.println("OK, let's begin");
                continueStart=false;
            }
        }
        
        
        GameBrain gB = new GameBrain(1100,850,gList,sList);  
    }
    /**
     * Constructor for objects of class Egine
     */
    public Engine()
    {
        //GameBrain gB = new GameBrain();       
    }
    public void start()
    {
        
    }
    
    public static void main2()
    {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        Car car = new Car(frame, Color.blue);
        car.addPeg(true);
        car.addPeg(false);
        car.addPeg(true);
        car.addPeg(false);
        car.addPeg(true);
        car.addPeg(false);
        
        frame.add(car);
        frame.setVisible(true);
        //Peg p = new Peg(true, 10,10,10);
        //frame.add(p);
        frame.setVisible(true);
    }
    
}
