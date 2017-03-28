import com.opencsv.*;
import java.io.*;

public class Grid
{
    boolean[][] map;
    
    public Grid()
    {
        this.map = new boolean[20][20];
        
        populate("life100.txt");
    }
    
    public Grid(String file)
    {
        this.map = new boolean[20][20];
        
        populate(file);
    }
    
    public int getNumLiving()
    {
        int count = 0;
        
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map.length; j++){
                if (map[j][i] == true) count++;
            }
        }
        
        return count;
    }
    
    public int getNumInRow(int row)
    {
        int count = 0;
        
        for (int i = 0; i < map.length; i++){
            if (map[i][row - 1] == true) count++;
        }
        
        return count;
    }
    
    public int getNumInColumn(int col)
    {
        int count = 0;
        
        for (int i = 0; i < map.length; i++){
            if (map[col - 1][i] == true) count++;
        }
        
        return count;
    }
    
    public boolean getLifeAt(int x, int y)
    {
        return this.map[y][x];
    }
    
    public int getSquares()
    {
        return map.length;
    }
    
    public void populate(String file)
    {
        try
        {
            CSVReader reader = new CSVReader(new FileReader(file), '\t');
            
            String[] nextLine;
            
            try
            {
                while ((nextLine = reader.readNext()) != null)
                {
                    int splitIndex = nextLine[0].indexOf(" ");
                    String left = nextLine[0].substring(0, splitIndex);
                    String right = nextLine[0].substring(splitIndex + 1);
                    
                    int x = Integer.valueOf(left);
                    int y = Integer.valueOf(right);
                    
                    map[y - 1][x - 1] = true;
                }
            } catch (IOException e) {}
        } catch (FileNotFoundException e) {}
    }
    
    public void nextGen()
    {
        for (int y = 0; y < map.length; y++){
            for (int x = 0; x < map.length; x++){
                int end = map.length - 1;
                if ((y != 0 && x != 0) && (y != end && x != end)){
                    int count = 0;
                    
                    if (map[y-1][x-1] == true) count++; //top-left
                    if (map[y-1][x] == true) count++; //top-center
                    if (map[y-1][x+1] == true) count++; //top-right
                    if (map[y][x+1] == true) count++; //center-right
                    if (map[y][x-1] == true) count++; //center-left
                    if (map[y+1][x-1] == true) count++; //bottom-left
                    if (map[y+1][x] == true) count++; //bottom-center
                    if (map[y+1][x+1] == true) count++; //bottom-right
                    
                    if (map[y][x] == false && count == 3) map[y][x] = true;
                    if (count < 2 || count > 3) map[y][x] = false;
                    //if count == 2 do nothing
                } else if (y != 0 && y != end) { //x == 0 or end
                    if (x == 0){
                        int count = 0;
                        
                        if (map[y-1][x] == true) count++; //top-center
                        if (map[y-1][x+1] == true) count++; //top-right
                        if (map[y][x+1] == true) count++; //center-right
                        if (map[y+1][x] == true) count++; //bottom-center
                        if (map[y+1][x+1] == true) count++; //bottom-right
                        
                        if (map[y][x] == false && count == 3) map[y][x] = true;
                        if (count < 2 || count > 3) map[y][x] = false;
                        //if count == 2 do nothing
                    } else if (x == end){
                        int count = 0;
                    
                        if (map[y-1][x-1] == true) count++; //top-left
                        if (map[y-1][x] == true) count++; //top-center
                        if (map[y][x-1] == true) count++; //center-left
                        if (map[y+1][x-1] == true) count++; //bottom-left
                        if (map[y+1][x] == true) count++; //bottom-center
                        
                        if (map[y][x] == false && count == 3) map[y][x] = true;
                        if (count < 2 || count > 3) map[y][x] = false;
                        //if count == 2 do nothing
                    }
                } else if (x != 0 && x != end) { //y == 0 or end
                    if (y == 0){
                        int count = 0;
                        
                        if (map[y][x+1] == true) count++; //center-right
                        if (map[y][x-1] == true) count++; //center-left
                        if (map[y+1][x-1] == true) count++; //bottom-left
                        if (map[y+1][x] == true) count++; //bottom-center
                        if (map[y+1][x+1] == true) count++; //bottom-right
                        
                        if (map[y][x] == false && count == 3) map[y][x] = true;
                        if (count < 2 || count > 3) map[y][x] = false;
                        //if count == 2 do nothing
                    } else if (y == end){
                        int count = 0;
                        
                        if (map[y-1][x-1] == true) count++; //top-left
                        if (map[y-1][x] == true) count++; //top-center
                        if (map[y-1][x+1] == true) count++; //top-right
                        if (map[y][x+1] == true) count++; //center-right
                        if (map[y][x-1] == true) count++; //center-left
                        
                        if (map[y][x] == false && count == 3) map[y][x] = true;
                        if (count < 2 || count > 3) map[y][x] = false;
                        //if count == 2 do nothing
                    }
                } else if (y == 0 && x == 0){
                    int count = 0;
                    
                    if (map[y][x+1] == true) count++; //center-right
                    if (map[y+1][x] == true) count++; //bottom-center
                    if (map[y+1][x+1] == true) count++; //bottom-right
                    
                    if (map[y][x] == false && count == 3) map[y][x] = true;
                    if (count < 2 || count > 3) map[y][x] = false;
                    //if count == 2 do nothing
                } else if (y == end && x == end){
                    int count = 0;
                    
                    if (map[y-1][x-1] == true) count++; //top-left
                    if (map[y-1][x] == true) count++; //top-center
                    if (map[y][x-1] == true) count++; //center-left
                    
                    if (map[y][x] == false && count == 3) map[y][x] = true;
                    if (count < 2 || count > 3) map[y][x] = false;
                    //if count == 2 do nothing
                }
            }
        }
    }
}
