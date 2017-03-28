public class Starter
{
    public static void main(String[] args)
    {
        Grid map = new Grid();
        GI gI = null;
        
        for (int i = 0; i < 5; i++){
            gI = new GI(map);
            gI.drawGI();
            
            map.nextGen();
            
            System.out.println("Generation #" + (i+1) + " ------------");
            System.out.println("Number in Row 10: " + map.getNumInRow(10));
            System.out.println("Number in Column 10: " + map.getNumInColumn(10));
            System.out.println("Number of living organisms: " + map.getNumLiving() + "\n");
            
            pause(7500);
        }
    }
    
    public static void pause(int time){
        try {
                Thread.sleep(time);
        } catch (InterruptedException e) {
        }
    }
}
