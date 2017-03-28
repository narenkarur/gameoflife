import gpdraw.*;

public class GI
{
    Grid map;
    DrawingTool window;
    
    public GI(Grid carte)
    {
        map = carte;
        
        window = new DrawingTool(new SketchPad(850, 850)); //extra 50's are to give the drawing more room
    }
    
    public void drawGI()
    {
        window.up();
        window.forward(400);
        window.turn(90);
        window.forward(400);
        window.turn(-90);
        
        //assuming square screen and "square" array (#rows = #columns)
        int numSquares = map.getSquares();
        
        int size = 800/numSquares;
        
        for (int i = 0; i < numSquares; i++)
        {
            for (int j = 0; j < numSquares; j++)
            {
                drawCell(size, i, j);
                
                window.up();
                window.turn(-90);
                window.forward(size);
                window.turn(90);
            }
            
            window.turn(90);
            window.forward(size*numSquares);
            window.turn(-90);
            window.backward(size);
        }
    }
    
    public void drawCell(int size, int x, int y)
    {
        window.down();
        window.setWidth(2);
        
        for (int i = 0; i < 4; i++){
            window.turn(-90);
            window.forward(size);
        }
        
        if (map.getLifeAt(x, y) == true){
            window.turn(-90);
            window.forward(size/2);
            window.turn(-90);
            window.forward(size/2);
            window.turn(180);
            
            window.fillRect(size, size);
            
            window.forward(size/2);
            window.turn(90);
            window.forward(size/2);
            window.turn(-90);
        }
    }
}
