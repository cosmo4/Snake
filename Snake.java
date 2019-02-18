package c14;

import java.awt.*;

public class Snake{
    public final int width;
    public final int height;
    private int x;
    private int y;

    public Snake(int xPan, int yPan){
        this.width=xPan/25;
        this.height=yPan/25;
        this.x=0;
        this.y=0;
    }

    public int getX(){
        int tmp=x;
        x++;
        System.out.println(x);
        return tmp;
    }
    public int getY(){
        int tmp=y;
        y++;
        System.out.println(y);
        return tmp;
    }
}