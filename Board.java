import java.util.ArrayList;
import Spaces.Space;
import Spaces.OrangeSpace;
import Spaces.LifeSpace;
import Spaces.RedSpace;
import Spaces.BlueSpace;
import Spaces.GreenSpace;
import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board
{
    ArrayList<Space> collegeList = new ArrayList<Space>();
    ArrayList<Space> spaceList = new ArrayList<Space>();
    String[] collegeCareers;
    String[] careers;
    String[] houses;
    Scanner cS = new Scanner(System.in);    
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        initializeFirstSpaces();
        initializeSpaces();
        createCareerList();
        createHouseList();
    }
    
    public ArrayList<Space> getCollegeList()
    {
        return collegeList;
    }
    public ArrayList<Space> getSpaceList()
    {
        return spaceList;
    }    
    
    public void initializeFirstSpaces()
    {
        //HARD CODE BOARD
        collegeList.add(new OrangeSpace(100));
        collegeList.add(new OrangeSpace(101));
        collegeList.add(new LifeSpace(100));
        collegeList.add(new OrangeSpace(102));        
        collegeList.add(new RedSpace(100));    
        //spaceList.add(new GreenSpace(constructor stuff));
    }    

    public void chooseCareer(Player p)
    {
        System.out.println("Your career is: ");
        Random rand = new Random();
        int careerChoice=rand.nextInt(5)+1;
        if(p.getCollege())
        {
            if(careerChoice==1)
            {
                p.setCareer(collegeCareers[0]);
                p.setSalary(270000);
            }
            if(careerChoice==2)
            {
                p.setCareer(collegeCareers[1]);
                p.setSalary(310000);
            }
            if(careerChoice==3)
            {
                p.setCareer(collegeCareers[2]);
                p.setSalary(220000);
            }            
            if(careerChoice==4)
            {
                p.setCareer(collegeCareers[3]);
                p.setSalary(180000);
            }
            if(careerChoice==5)
            {
                p.setCareer(collegeCareers[4]);
                p.setSalary(120000);
            }
        } else     
        {
            if(careerChoice==1)
            {
                p.setCareer(careers[0]);
                p.setSalary(20000);
            }
            if(careerChoice==2)
            {
                p.setCareer(careers[1]);
                p.setSalary(30000);
            }
            if(careerChoice==3)
            {
                p.setCareer(careers[2]);
                p.setSalary(40000);
            }            
            if(careerChoice==4)
            {
                p.setCareer(careers[3]);
                p.setSalary(80000);
            }
            if(careerChoice==5)
            {
                p.setCareer(careers[4]);
                p.setSalary(35000);
            }
        }
        System.out.println(p.getCareer());
        System.out.println("$"+p.returnSalary() + " is your salary");
    }

    public void runHouse(Player p)
    {
        System.out.println("Your house is: ");
        Random rand = new Random();
        int houseChoice=rand.nextInt(7)+1;

        if(houseChoice==1)
        {
            p.setHouse(houses[0]);
            p.addMoney(-1500000);
            System.out.println(", at $1.5 million, ");
        }
        if(houseChoice==2)
        {
            p.setHouse(houses[1]);
            p.addMoney(-1000000);
            System.out.println(", at $1 million, ");
        }
        if(houseChoice==3)
        {
            p.setHouse(houses[2]);
            p.addMoney(-750000);
            System.out.println(", at $750K, ");
        }            
        if(houseChoice==4)
        {
            p.setHouse(houses[3]);
            p.addMoney(-300000);
            System.out.println(", at 300K, ");
        }
        if(houseChoice==5)
        {
            p.setHouse(houses[4]);
            p.addMoney(-80000);
            System.out.println(", at $80K, ");
        }

        if(houseChoice==6)
        {
            p.setHouse(houses[5]);
            p.addMoney(-20000);
            System.out.println(", at $20K, ");
        }
        if(houseChoice==7)
        {
            p.setHouse(houses[6]);
            p.addMoney(-500000);
            System.out.println(", at $500K, ");
        }
        System.out.println("is " +p.getHouse());

    }

    public void createCareerList()
    {
        collegeCareers = new String[]{"APCS Teacher", "Doctor", "Lawyer", "Accountant", "Psychiatrist"};
        careers = new String[]{"Janitor", "Hairstylist", "Mechanic", "Exotic Dancer", "Waiter"};
    }

    public void createHouseList()
    {
        houses = new String[]{"Mansion","Modern Victorian","High-Rise Apartment","Town Home","Mobile Home","Shack","Suburban Home"};
    }

    public void runKids(Player p, int x)
    {
        System.out.println("Sorry, but you now have " + x + " more mouth(s) to feed.");
        p.addKids(x);
    }    

    public void runSueMethod(Player p)
    {
        System.out.println("Whom would you like to sue? Enter their name.");
        String nam = cS.nextLine();
        System.out.println("You really thought you could sue someone? How rude, lose 100K");
        p.addMoney(-100000);
    }

    public void initializeSpaces()
    {
        //HARD CODE BOARD
        spaceList.add(new OrangeSpace(0));
        spaceList.add(new GreenSpace(0));
        spaceList.add(new OrangeSpace(1));
        spaceList.add(new OrangeSpace(2));
        spaceList.add(new LifeSpace(0));
        spaceList.add(new GreenSpace(1));
        spaceList.add(new RedSpace(0));
        spaceList.add(new LifeSpace(1));
        spaceList.add(new OrangeSpace(3));
        spaceList.add(new GreenSpace(1));
        spaceList.add(new RedSpace(1));
        spaceList.add(new OrangeSpace(4));
        spaceList.add(new LifeSpace(2));
        spaceList.add(new GreenSpace(2));
        spaceList.add(new LifeSpace(3));
        spaceList.add(new OrangeSpace(5));
        spaceList.add(new OrangeSpace(6));
        spaceList.add(new LifeSpace(4));
        spaceList.add(new GreenSpace(3));
        spaceList.add(new BlueSpace(0));
        spaceList.add(new OrangeSpace(7));
        spaceList.add(new RedSpace(2));
        spaceList.add(new OrangeSpace(8));
        spaceList.add(new GreenSpace(4));
        spaceList.add(new LifeSpace(5));
        spaceList.add(new OrangeSpace(9));
        spaceList.add(new LifeSpace(6));
        spaceList.add(new GreenSpace(5));
        spaceList.add(new OrangeSpace(10));
        spaceList.add(new OrangeSpace(11));
        spaceList.add(new OrangeSpace(12));
        spaceList.add(new GreenSpace(6));
        spaceList.add(new OrangeSpace(13));
        spaceList.add(new LifeSpace(6));
        spaceList.add(new OrangeSpace(14));
        spaceList.add(new GreenSpace(7));
        spaceList.add(new BlueSpace(1));      
        spaceList.add(new RedSpace(3));
        spaceList.add(new GreenSpace(8));
        spaceList.add(new OrangeSpace(15));
        spaceList.add(new OrangeSpace(16));
        spaceList.add(new GreenSpace(9));
        spaceList.add(new BlueSpace(2));
        spaceList.add(new OrangeSpace(17));
        spaceList.add(new RedSpace(4));
        spaceList.add(new GreenSpace(10));
        spaceList.add(new OrangeSpace(18));   
        spaceList.add(new BlueSpace(3));
        spaceList.add(new GreenSpace(11));
        spaceList.add(new OrangeSpace(19));
        spaceList.add(new LifeSpace(7));
        spaceList.add(new LifeSpace(8));
        spaceList.add(new GreenSpace(12));
        spaceList.add(new OrangeSpace(20));
        spaceList.add(new LifeSpace(9));
        spaceList.add(new GreenSpace(12));
        spaceList.add(new LifeSpace(10));   
        spaceList.add(new BlueSpace(4));
        spaceList.add(new LifeSpace(11));
        spaceList.add(new GreenSpace(13));
        spaceList.add(new OrangeSpace(21));
        spaceList.add(new OrangeSpace(22));      
        //spaceList.add(new GreenSpace(constructor stuff));
    }

    public void runSpaceMethod(int type, int[] values, String text,Player p)    
    {
        //change player stuff here
        if(type==1)
        {
            System.out.println(text);
            if(values[0]==69)
            {
                System.out.println("Subtracting $" +p.getTaxes() + " from your account. Sucks.");
                p.addMoney(p.getTaxes()*-1);
            } else if (values[0]==-69)
            {
                System.out.println("Subtracting $" +p.getCruiseAmount() + " from your account.");
                p.addMoney(p.getCruiseAmount()*-1);
            } else if (values[0]==690)
            {
                System.out.println("Congrats. You just got $" + p.getRetireAmount() + " from your kids.");
                p.addMoney(p.getRetireAmount());
            } else
            {
                System.out.println("Adding " + values[0] + " into account");
                p.addMoney(values[0]);
            }
            if(values[1]==1)
            {
                runHouse(p);
            }
            if(values[2]==1)
            {
                chooseCareer(p);
            }
        } else if(type==2)
        {
            System.out.println("You landed on LIFE tile.");
            System.out.println(text);

            p.addSecret(values[0]);
            p.addLife(1);
            if(values[1]==1)
            {
                runKids(p,1);
            } else if(values[1]==2)
            {
                runKids(p,2);
            }
        } else if(type==3)
        {
            System.out.println("You landed on " + text);
        } else if(type==4)
        {
            System.out.println(text);
            p.raise(values[0]);
            System.out.println("Your salary is raised by $" + values[0]);
            System.out.println("Adding " + values[1] + " into account");
            p.addMoney(values[1]);
            if(values[2]==1)
            {
                runHouse(p);
            }
            if(values[3]==1)
            {
                chooseCareer(p);
            }            
        } else if(type==5)
        {
            System.out.println("You landed on Blue. You get to sue someone $" + values[0] + ".");
            runSueMethod(p);
        }        
        //for red, remember that the first amount is a pay raise and second is added to balance
    }

    public void actionFromSpace(int spaceNum, Player p)
    {
        if(spaceNum<6)
        {
            if(p.getCollege())
            {
                runSpaceMethod(collegeList.get(spaceNum-1).getType(),collegeList.get(spaceNum-1).returnSpaceMethod(),collegeList.get(spaceNum-1).returnText(),p);
            } else
            {
                runSpaceMethod(spaceList.get(spaceNum-1).getType(),spaceList.get(spaceNum-1).returnSpaceMethod(),spaceList.get(spaceNum-1).returnText(),p);
            }
        } else
        {
            runSpaceMethod(spaceList.get(spaceNum-1).getType(),spaceList.get(spaceNum-1).returnSpaceMethod(),spaceList.get(spaceNum-1).returnText(),p);
        }
        //return stuff
        //we are commenting this shit so that we can use if statements to do return values and then use them to change the variables of the player. so do that
        //lifespace: text, array[amount to be added to player's money, move space, career change] 
        //redspace: text, career change, car change(married), house change 
        //

        //do stuff to p
    }

    public int checkForRed(int spaceNum, Player p)
    {
        //if there is not a red(check between p.currentspace and p.currentspace+spaceNum), return spaceNum,
        //if there is a red, return the distance from currentspace to re
        if(p.getSpaceNum()<6)
        {
            System.out.println("POOP");
            if(p.getCollege())
            {
                if(!p.hasJob())
                {
                    if(p.getSpaceNum()+spaceNum>4) return 5-p.getSpaceNum();
                } else 
                {
                    for(int i=p.getSpaceNum();i<p.getSpaceNum()+spaceNum;i++)
                    {
                        if(spaceList.get(i).getType()==4)
                        {
                            return i-p.getSpaceNum();
                        }
                    }                    
                }
                /*for(int i=p.getSpaceNum();i<p.getSpaceNum()+spaceNum;i++)
                {
                    if(collegeList.get(i).getType()==4)
                    {
                        return i-p.getSpaceNum();
                    }
                }  */              
            }
        } else
        {
            for(int i=p.getSpaceNum();i<p.getSpaceNum()+spaceNum;i++)
            {
                if(spaceList.get(i).getType()==4)
                {
                    return i-p.getSpaceNum();
                }
            }
        }
        return spaceNum;
    }

    public void checkForGreen(int spaceNum, Player p)
    {
        //DON'T MODIFY SPACENUM
        //check how many greens between p.currentspace and p.currentspace+spacenum
        //use p.payday however many times ^^^^
        if(p.getSpaceNum()<5)
        {
            if(p.getCollege())
            {
                //do nothing
            } else
            {
                for(int i=p.getSpaceNum();i<p.getSpaceNum()+spaceNum;i++)
                {
                    if(spaceList.get(i).getType()==3)
                    {
                        System.out.println("You went over a Pay Day! Adding your salary: $" + p.returnSalary()); 
                        p.addMoney(p.returnSalary());
                    }
                }                
            }
        } else
        {
            for(int i=p.getSpaceNum();i<p.getSpaceNum()+spaceNum;i++)
            {
                if(spaceList.get(i).getType()==3)
                {
                    System.out.println("You went over a Pay Day! Adding your salary: $" + p.returnSalary()); 
                    p.addMoney(p.returnSalary());
                }
            }
        }
    }  
}
