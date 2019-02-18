package c14;

import java.awt.*;
import static java.lang.Thread.sleep;

public class Snake{
    public final int width;
    public final int height;
    public int x;
    public int y;

    public Snake(int xPan, int yPan){
        this.width=xPan/25;
        this.height=yPan/25;
        this.x=0;
        this.y=0;
    }

    public void move(){
        x++;
        y++;
        System.out.println("Snake x: "+x);
        System.out.println("Snake y: "+y);
    }

    public void getsBigger(){
        System.out.println("I'am big boi");
    }
}